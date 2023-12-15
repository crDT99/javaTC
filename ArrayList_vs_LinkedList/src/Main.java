import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Persona> listaArray = new ArrayList<>();



        listaArray.add(new Persona(1,"Luisina",30));
        listaArray.add(new Persona(2,"Gabriel",30));
        listaArray.add(new Persona(3,"Ibra",9));
        listaArray.add(new Persona(4,"TodoCode",2));


        List<Persona> listaLinked = new LinkedList<>();

        listaLinked.add(new Persona(1,"Luisina",30));
        listaLinked.add(new Persona(2,"Gabriel",30));
        listaLinked.add(new Persona(3,"Ibra",9));
        listaLinked.add(new Persona(4,"TodoCode",2));

// ------ ELIMINAR COSAS

        // remove en ArrayList -- se conoce el indice
        listaArray.remove(1);


        // remove en LinkedList
        String nombreBorrar = "Gabriel";
        for (Persona personait: listaLinked){
            if(personait.getNombre().equals(nombreBorrar)){listaLinked.remove(personait);
            break;
            }
        }

// ------ RECORRER LISTAS

        System.out.println("------ LUEGO DE ELIMINAR ------");
        // recorrido por foreach
        System.out.println("--------ARRAYLIST ------- ");
        for(Persona persona:listaArray) {
            System.out.println("prueba " + persona.getNombre());
        }

        System.out.println("----LINKEDLIST-----");

        for (Persona persona : listaLinked) {
            System.out.println("prueba " + persona.getNombre());
        }

// ------ OBTENER EL TAMAÑO

        //Tamaño lista
        System.out.println("---------Qué tamaño tienen las listas?---- -");
        System.out.println("ArrayList: " + listaArray.size());
        System.out.println("LinkedList: " + listaLinked.size());

// ------ OBTENER OBJETOS

        //obtener primer objeto
        System.out.println("- --PRIMER y último OBJETO (solo para LINKED LIST)--");
        System.out.println("Primero de LinkedList: " + listaLinked.getFirst().toString());
        System.out.println("Último de LinkedList: " + listaLinked.getLast().toString());

 // ------ borrar toda la lista
        System.out.println("-----Borrando Listas...");
        listaArray.clear();
        listaLinked.clear();

// ------ comprobar si está vacía
        System.out.println("---------Está vacía alguna lista?---- -");
        System.out.println("ArrayList: " + listaArray.isEmpty());
        System.out.println("LinkedList: " + listaLinked.isEmpty());


    }
}