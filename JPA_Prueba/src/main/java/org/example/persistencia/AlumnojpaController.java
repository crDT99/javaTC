package org.example.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaQuery;
import org.example.logica.Alumno;

import java.io.Serializable;
import java.util.List;
import java.util.Queue;

public class AlumnojpaController implements Serializable {

    public AlumnojpaController(EntityManagerFactory emf)
    {
        this.emf = emf;
    }

    public AlumnojpaController(){
        emf = Persistence.createEntityManagerFactory("pruebaJPA-pu");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager(){
        return  emf.createEntityManager();
    }

    public void create(Alumno alumno){
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(alumno);
            em.getTransaction().commit();
        }finally {
            if (em != null){
                em.close();
            }
        }
    }

    public void edit(Alumno alumno) throws  NonexistentEntityExeption, Exception{
        EntityManager em  = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            alumno = em.merge(alumno);
            em.getTransaction().commit();
        }catch (Exception ex){
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0){
                int id = alumno.getId();
                if (findAlumno(id)== null) {
                    throw new  NonexistentEntityExeption("The alumno with id " + id + " no longer exist.");
                }
            }
            throw ex;
        }finally {
            if(em != null){
                em.close();
            }
        }
    }

    public  void destroy(int id) throws NonexistentEntityExeption{
        EntityManager em = null;
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            Alumno alumno;
            try{
                alumno = em.getReference(Alumno.class, id);
                alumno.getId();
            }catch (EntityNotFoundException enfe){
                throw new NonexistentEntityExeption("The alumno with id "+ id + " no longer exist.", enfe);
            }
            em.remove(alumno);
            em.getTransaction().commit();
        }finally {
            if (em != null){
                em.close();
            }
        }
    }

    public List<Alumno> findAlumnoEntities(){
        return  findAlumnoEntities(true, -1 ,-1);
    }
    public List<Alumno> findAlumnoEntities( int maxResults, int firstResult){
        return  findAlumnoEntities(false, maxResults ,firstResult);
    }

    public List<Alumno> findAlumnoEntities( boolean all, int maxResults, int firstResult){
        EntityManager em = getEntityManager();
        try{
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Alumno.class));
            Query q = em.createQuery(cq);
            if(!all){
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList(firstResult)
        }finally {
            em.close();
        }
        return  findAlumnoEntities(false, maxResults ,firstResult);
    }


}