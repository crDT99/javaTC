package interface_implementacion;

public class Cuadrado implements Figura, Dibujable {
    private Double lado;

    public Cuadrado() {
    }

    public Cuadrado(Double lado) {
        this.lado = lado;
    }

    // metodos de las interfaces
    @Override
    public Double calcularArea() {
        Double resultado = lado * lado;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println(" Hola, estoy dibujando un cuadrado");
    }
}
