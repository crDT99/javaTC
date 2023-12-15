package Pizzas;

import java.util.ArrayList;
import java.util.List;

public class Pizza_Combinada extends Pizza{
   private List<Pizza> pizzasCombinadas = new ArrayList<>();

   public void agregarPizza(Pizza pizza){
       pizzasCombinadas.add(pizza);
   }

    public Pizza_Combinada(String nombre, String description) {
        super(nombre, description);
    }
    public Pizza_Combinada(String nombre, String description, List<Pizza> pizzasCombinadas) {
        super(nombre, description);
        this.pizzasCombinadas = pizzasCombinadas;
    }

    @Override
    protected Double calcularPrecio() {
        double precioMax = 0;
        for (Pizza pizza : pizzasCombinadas) {
            double precio = pizza.calcularPrecio();
            if (precio > precioMax) {
                precioMax = precio;
            }
        }
        return precioMax;
    }


}
