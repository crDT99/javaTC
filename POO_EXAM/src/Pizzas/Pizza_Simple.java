package Pizzas;

public class Pizza_Simple extends Pizza{

    private Double precioBase;
    private boolean esEspecial;

    public Pizza_Simple(String nombre, String description, Double precioBase, boolean esEspecial) throws Exception{
        super(nombre, description);
        if(precioBase == null)
            throw new Exception("El precio no puede ser nulo");
        if(precioBase < 0)
            throw new Exception("El precio no es válido");
        this.precioBase = precioBase;
        this.esEspecial = esEspecial;
    }

    @Override
    protected Double calcularPrecio() {
        return esEspecial ? precioBase * 1.7 : precioBase;
    }

    @Override
    public Double getPrecio() {
        return calcularPrecio();
    }
}
