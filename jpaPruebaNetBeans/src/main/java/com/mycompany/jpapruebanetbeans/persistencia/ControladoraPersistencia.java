package com.mycompany.jpapruebanetbeans.persistencia;

import com.mycompany.jpapruebanetbeans.logica.Alumno;
import com.mycompany.jpapruebanetbeans.logica.Carrera;
import com.mycompany.jpapruebanetbeans.logica.Materia;
import com.mycompany.jpapruebanetbeans.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


  // recibe las peticiones desde la logica y en base a eso delega dichas peticiones a una controladora

public class ControladoraPersistencia {
 
    //Controla cada una de las instancias de la JPA controles que tengamos
    
    // ------------ Instancias de JPA Controllers ------------
    AlumnoJpaController aluJpa = new AlumnoJpaController();
    CarreraJpaController carreJpa = new CarreraJpaController();
    MateriaJpaController matJpa = new MateriaJpaController();
    
    
        //////////////////////////// CRUD Alumno ////////////////////////////
    
    public void crearAlumno(Alumno alu) {
        // llama al controladorJPA del tipo especifico de objeto Alumno
       aluJpa.create(alu);
    }

    public void eliminarAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return aluJpa.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        
        List<Alumno> listaA = aluJpa.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno> (listaA);
        
        return listaAlumnos;
        
    }
    
    
    
        //////////////////////////// CRUD Carrera ////////////////////////////
    
        
    public void crearCarrera(Carrera carr) {
        // llama al controladorJPA del tipo especifico de objeto Alumno
       carreJpa.create(carr);
    }

    public void eliminarCarrera(int id) {
        try {
            carreJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera carre) {
        try {
            carreJpa.edit(carre);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return carreJpa.findCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarreras() {
        
        List<Carrera> listaC = carreJpa.findCarreraEntities();
        ArrayList<Carrera> listaCarreras = new ArrayList(listaC);
        
        return listaCarreras;
        
    }
    
    
    //////////////////////////// CRUD Materia ////////////////////////////

    public void crearMateria(Materia mat) {
        matJpa.create(mat);
    }

    public void eliminarMateria(int id) {
        try {
            matJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMateria(Materia mat) {
        try {
            matJpa.edit(mat);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia traerMateria(int id) {
        return matJpa.findMateria(id);
    }

    public ArrayList<Materia> traerListaMaterias() {
        List<Materia> listaM = matJpa.findMateriaEntities();
        ArrayList<Materia> listaMaterias = new ArrayList(listaM);
        
        return listaMaterias;
    }
    
    
    
}
