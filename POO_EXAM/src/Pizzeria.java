import Pizzas.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private List<Pizza> pizzasTotales = new ArrayList<>();

    public void agregaPizzaAlMenu(Pizza pizza){
        pizzasTotales.add(pizza);
    }

    public void mostrarTodasLasPizzas(){
        for (Pizza pizza: pizzasTotales) {
            System.out.println("Nombre: " + pizza.getNombre() + ", Precio: " + pizza.getPrecio() + " $ ");
        }
    }

}
