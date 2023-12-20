package Logica;

public class Arbol extends Planta{

    private String variedad;
    private String tipoTronco;
    private Double radioTronco;
    private String color;
    private String tipoDeHojas;


    public Arbol() {
    }

    public Arbol(String nombre, Double altoDelTallo, Boolean tieneHojas,
                 String climaIdeal, String variedad, String tipoTronco,
                 Double radioTronco, String color, String tipoDeHojas) {

        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.radioTronco = radioTronco;
        this.color = color;
        this.tipoDeHojas = tipoDeHojas;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoTronco() {
        return tipoTronco;
    }

    public void setTipoTronco(String tipoTronco) {
        this.tipoTronco = tipoTronco;
    }

    public Double getRadioTronco() {
        return radioTronco;
    }

    public void setRadioTronco(Double radioTronco) {
        this.radioTronco = radioTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoDeHojas() {
        return tipoDeHojas;
    }

    public void setTipoDeHojas(String tipoDeHojas) {
        this.tipoDeHojas = tipoDeHojas;
    }

    @Override
    public String saludar() {
        return "Hola, soy un Arbol!! 🌲🌲";
    }
}
