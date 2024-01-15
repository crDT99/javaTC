package com.mycompany.jpapruebanetbeans.logica;

import com.mycompany.jpapruebanetbeans.persistencia.ControladoraPersistencia;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */ 

// contendra todos los metodos CRUD, que se emcargen de llamar a sus equivalentes en la controladora de Persistencia
public class ControladoraLogica {
    //Instancia de la controladora de persitencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia(); 
    
    
    
    
    
    //////////////////////////// CRUD Alumno ////////////////////////////
    // metodo que a partir de los datos cargados, dar de alta un nuevo Alumno de manera logica y pasarlo luego a la persistencia
    
    public void crearAlumno(Alumno alu){
        controlPersis.crearAlumno(alu);
    }
    
    public void eliminarAlumno(int id){
        controlPersis.eliminarAlumno(id);
    }
    
    public void editarAlumno(Alumno alu){
       controlPersis.editarAlumno(alu);
    }
    
    //traer alumno en particular
    public Alumno traerAlumno(int id){
        return controlPersis.traerAlumno(id);
    }
    
    //traer lista de Alumnos
    public ArrayList<Alumno> traerListaAlumnos(){
        return controlPersis.traerListaAlumnos();
    }
    
    
    
    //////////////////////////// CRUD Carrera ////////////////////////////
    
    public void crearCarrera(Carrera carre){
        controlPersis.crearCarrera(carre);
    }
    
    public void eliminarCarrera(int id){
        controlPersis.eliminarCarrera(id);
    }
    
    public void editarCarrera(Carrera carre){
       controlPersis.editarCarrera(carre);
    }
    
    //traer Carrera en particular
    public Carrera traerCarrera(int id){
        return controlPersis.traerCarrera(id);
    }
    
    //traer lista de Carreras
    public ArrayList<Carrera> traerListaCarreras(){
        return controlPersis.traerListaCarreras();
    }
    
    
    
    //////////////////////////// CRUD Materia ////////////////////////////
    
    public void crearMateria(Materia mat){
        controlPersis.crearMateria(mat);
    }
    
    public void eliminarMateria(int id){
        controlPersis.eliminarMateria(id);
    }
    
    public void editarMateria(Materia mat){
       controlPersis.editarMateria(mat);
    }
    
    //traer Carrera en particular
    public Materia traerMateria(int id){
        return controlPersis.traerMateria(id);
    }
    
    //traer lista de Materias
    public ArrayList<Materia> traerListaMaterias(){
        return controlPersis.traerListaMaterias();
    }
    
    
    
}
