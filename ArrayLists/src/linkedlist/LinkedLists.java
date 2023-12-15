
package linkedlist;

import java.util.LinkedList;
import java.util.List;


public class LinkedLists {

    public static void main(String[] args) {
      
        
        List<Persona> lista = new LinkedList<>();

        // Agregar al final
        lista.add(new Persona(1, "Luisina", 30));
        lista.add(new Persona(2, "Gabriel", 30));
        lista.add(new Persona(3, "Ibra", 9));
        lista.add(new Persona(4, "TodoCode", 2));

        // Agregar al principio
        lista.add(0, new Persona(5, "Prueba", 99));

        System.out.println("------PRUEBA FOREACH--------");
        //recorrido por foreach
            for (Persona persona:lista) {
                System.out.println("prueba " + persona.getNombre());
            }

 
    }
    
}
