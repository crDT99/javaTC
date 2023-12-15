import Pizzas.Pizza;
import Pizzas.Pizza_Combinada;
import Pizzas.Pizza_Simple;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Test {
    public static void main(String[] args) {
        //Pizzeria
        Pizzeria pizzeria = new Pizzeria();

        try {
        // Pizzas Simples
        Pizza simple1 = new Pizza_Simple("Pizza de muzzarella" , "crujiente, sabrosa y llena de queso derretido. 🍕" , 700d , false);
        Pizza simple2 = new Pizza_Simple("Pizza margarita" , "Simple, fresca y deliciosa con tomate, mozzarella y albahaca." , 850d , true);
        Pizza simple3 = new Pizza_Simple("Pizza de anana" , "ni idea de que tenga esta pizza la verdad" , 950d , false);

        // Pizzas Combinadas
        Pizza_Combinada comb1 = new Pizza_Combinada("Pizza Combianda Loca"," la Combinacion mas loca de pizza, margarita y anana");
        comb1.agregarPizza(simple2);
        comb1.agregarPizza(simple3);

        // Agregar las Pizzas al menu
        pizzeria.agregaPizzaAlMenu(simple1);
        pizzeria.agregaPizzaAlMenu(simple2);
        pizzeria.agregaPizzaAlMenu(simple3);
        pizzeria.agregaPizzaAlMenu(comb1);

        }catch (NumberFormatException e) {
            System.out.println("La entrada no es un precio valido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Mostrar Pizzas Por Consola
        pizzeria.mostrarTodasLasPizzas();

        /*
        System.out.println("Extra test: ");
        try {
            Pizza test1 = new Pizza_Simple("Pizza falla" , "hecha para fallar :P" , -1d , false);
        } catch (NumberFormatException e) {
            System.out.println("La entrada no es un precio valido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

         */

    }
}