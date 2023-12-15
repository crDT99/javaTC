import herencia.Consultor;
import herencia.Empleado;
import herencia.Jefe;
import herencia.Persona;

public class Main {
    public static void main(String[] args) {

        /*
        // HERENCIA EXAMPLE

        Empleado emple = new Empleado();
        emple.getNum_legajo();
        emple.getNombre(); //metodo de persona

        Consultor consul = new Consultor();
        consul.getNum_consultor();
        consul.getNombre(); //metodo de persona
         */



        Persona vector[] = new Persona[5];
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();
       // vector[4] = "Hola";   // Required type:Persona Provided:String

        //clase madre: Persona
        // Clases hijas: Empleado, Consultor, Jefe

        // polimorfismo -> las clases hijas son formas diferentes de representar una misma persona


        Persona perso = new Persona();
        Consultor consul = new Consultor();
        perso = consul;
        //consul = perso; // error


    }
}