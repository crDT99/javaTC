import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        System.out.println("Pila vacio: "+ pila);
        System.out.println("Esta vacia? " + pila.isEmpty());

        //agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        // recorrido
        for (Integer pilita : pila) {
            System.out.println(pilita);
        }

        // mostrar
        System.out.println("Pila: " + pila);
        System.out.println("Pila vacia? " + pila.isEmpty());

        pila.pop(); // elimina el ultimo registo que entro
        System.out.println("esta el 3? " + pila.search(3));
        System.out.println("esta el 9? " + pila.search(9));
        System.out.println("Ultimo agregado:" + pila.peek());


    }
}