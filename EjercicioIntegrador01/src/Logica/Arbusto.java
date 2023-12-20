package Logica;

public class Arbusto extends Planta {

    private Double ancho;
    private Boolean esDomestico;
    private String variedadArbusto;
    private Boolean sePodaONo;
    private String colorDeHojas;

    public Arbusto() {
    }

    public Arbusto(String nombre, Double altoDelTallo, Boolean tieneHojas,
                   String climaIdeal, Double ancho, Boolean esDomestico,
                   String variedadArbusto, Boolean sePodaONo, String colorDeHojas) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.ancho = ancho;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.sePodaONo = sePodaONo;
        this.colorDeHojas = colorDeHojas;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Boolean getEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(Boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public Boolean getSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(Boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    public String getColorDeHojas() {
        return colorDeHojas;
    }

    public void setColorDeHojas(String colorDeHojas) {
        this.colorDeHojas = colorDeHojas;
    }

    @Override
    public String saludar() {
        return "Hola, soy un Arbusto!! 🌳🌳";
    }
}
