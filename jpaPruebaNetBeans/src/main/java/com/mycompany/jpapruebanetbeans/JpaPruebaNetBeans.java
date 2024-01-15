package com.mycompany.jpapruebanetbeans;

import com.mycompany.jpapruebanetbeans.logica.Alumno;
import com.mycompany.jpapruebanetbeans.logica.Carrera;
import com.mycompany.jpapruebanetbeans.logica.ControladoraLogica;
import com.mycompany.jpapruebanetbeans.logica.Materia;
import java.util.Date;
import java.util.LinkedList;



public class JpaPruebaNetBeans {

    public static void main(String[] args) {
       
        ControladoraLogica controlL = new ControladoraLogica();
        
    //--------------------------------------------------------    
        //Relacion Bidireccional (la materia necesita una carrera para asociarse 
        
        //Crear lista de materias vacia
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        
        //Creacion Carrera con lista de materias
        Carrera carrera1 = new Carrera(1, "Tecnicatura en Programacion", listaMaterias);
        
        //Guardado Carrera en BD
        controlL.crearCarrera(carrera1);
        
    //--------------------------------------------------------    
      
        
        //Creacion Materias con el id de la carrera  (asi tenga la lista de materias vacia)
        Materia mate1 = new Materia(50, "Programacion I" , "Semenstral" , carrera1);
        Materia mate2 = new Materia(60, "Programacion II" , "Semenstral" , carrera1);
        Materia mate3 = new Materia(70, "Programacion Avanzada" , "Anual" , carrera1);
        
        //Guardado Materias en BD
        controlL.crearMateria(mate1);
        controlL.crearMateria(mate2);
        controlL.crearMateria(mate3);
        
        
        //Agregar Materias a la lista de materias
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        
        // le agregamos a nivel logico a la carrera la lista de carreras actualizada
        carrera1.setListaMaterias(listaMaterias);
        //actualizamos la persistencia de carrera
        controlL.editarCarrera(carrera1);
        
        //Creacion de Alumno (con Carrera)
        Alumno alumno1 = new Alumno(2,"alumno","Con Carrera", new Date(), carrera1);
        
        //Guardamos el Alumno en la BD
        controlL.crearAlumno(alumno1);
        
        //Vemos el resultado
        Alumno alumnoB = controlL.traerAlumno(2);
        System.out.println("---------------- Datos Alumno ----------------");
        System.out.println("El Alumno es: " + alumnoB.toString());
        
    }
}







        /*

        // Creacion, edicion inspeccion y eliminacion de elementos

        //crear nuevo alumno---
        Alumno nalu = new Alumno(1,"THE" , "ONE", new Date());
        controlL.crearAlumno(nalu);

        //editar alumno---
        alu.setApellido("nuevoApellido");
        controlL.editarAlumno(alu);
        
        
        //eliminar alumno con ID20---
        controlL.eliminarAlumno(20);
        
        
        System.out.println("/////////////////////////////////////////////");
        
        Alumno alu1 = controlL.traerAlumno(20);
        System.out.println("---------------- BUSQUEDA INDIVIDUAL ----------------");
        System.out.println("El Alumno es: " + alu1.toString());
        
        System.out.println("---------------- BUSQUEDA GRUPAL ----------------");      
        ArrayList<Alumno> listaAlumnos = controlL.traerListaAlumnos();
        for(Alumno al : listaAlumnos){
            System.out.println("El Alumno de la lista es: " + al.toString());
        }
        
        System.out.println("/////////////////////////////////////////////"); 
        
        */