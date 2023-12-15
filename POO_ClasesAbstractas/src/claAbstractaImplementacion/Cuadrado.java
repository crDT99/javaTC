package claAbstractaImplementacion;

public class Cuadrado extends Figura {
    private Double lado;

    public Cuadrado() {
    }

    public Cuadrado(double x, double y, Double lado) {
        super(x, y);
        this.lado = lado;
    }

    @Override
    public Double calcularArea() {
        Double resultado = lado * lado;
        return resultado;
    }
}
