package Pizzas;

public abstract class Pizza {
    // Atributos
    private String nombre;
    private String description;

    // Metodos -----------------------

    // Constructor
    public Pizza(String nombre, String description) {
        this.nombre = nombre;
        this.description = description;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescription() {
        return description;
    }


    protected abstract Double calcularPrecio();

    public  Double getPrecio(){
        return calcularPrecio();
    }
}
