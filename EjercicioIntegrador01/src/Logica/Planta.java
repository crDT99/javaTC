package Logica;

public abstract class Planta {
    private String nombre;
    private Double altoDelTallo;
    private Boolean tieneHojas;
    private String climaIdeal;

    public Planta() {
    }

    public Planta(String nombre, Double altoDelTallo, Boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.altoDelTallo = altoDelTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getAltoDelTallo() {
        return altoDelTallo;
    }

    public void setAltoDelTallo(Double altoDelTallo) {
        this.altoDelTallo = altoDelTallo;
    }

    public Boolean getTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(Boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    public abstract String saludar();

}
