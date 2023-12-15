package clases;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ClaseAlumno {

    // -------- Atributos ------------
    int id;
    String nombre;
    String apellido;

    // Logger
    private static final Logger logger = Logger.getLogger(ClaseAlumno.class.getName());


    // ----- Metodos ----

    public void mostrarNombre(){
        logger.log(Level.INFO  ,() ->  String.format("Hola, soy un Alumno y mo nombre es: %s" , nombre));
    }

    public void saberAprovado ( double calificacion){
        if (calificacion >= 7){
            logger.log(Level.INFO  ,"Aprobé la materia 😊");
        }else{
            logger.log(Level.INFO ,"No aprobe 🙁");
        }
    }

}
