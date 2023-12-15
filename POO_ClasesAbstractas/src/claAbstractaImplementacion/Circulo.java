package claAbstractaImplementacion;

public class Circulo extends Figura {

    private Double radio;

    public Circulo() {
    }

    public Circulo(double x, double y, Double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return  Math.PI * Math.pow(radio,2);
    }
}
