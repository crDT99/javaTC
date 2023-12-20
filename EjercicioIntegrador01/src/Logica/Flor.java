package Logica;

public class Flor  extends Planta{
    private String colorDePetalos;
    private Integer promedioPetalos;
    private String colorPistilo;
    private String variedadFlor;
    private String estacionFlorecimiento;

    public Flor() {
    }

    public Flor(String nombre, Double altoDelTallo, Boolean tieneHojas,
                String climaIdeal, String colorDePetalos, Integer promedioPetalos,
                String colorPistilo, String variedadFlor, String estacionFlorecimiento) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.colorDePetalos = colorDePetalos;
        this.promedioPetalos = promedioPetalos;
        this.colorPistilo = colorPistilo;
        this.variedadFlor = variedadFlor;
        this.estacionFlorecimiento = estacionFlorecimiento;
    }


    public String getColorDePetalos() {
        return colorDePetalos;
    }

    public void setColorDePetalos(String colorDePetalos) {
        this.colorDePetalos = colorDePetalos;
    }

    public Integer getPromedioPetalos() {
        return promedioPetalos;
    }

    public void setPromedioPetalos(Integer promedioPetalos) {
        this.promedioPetalos = promedioPetalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getEstacionFlorecimiento() {
        return estacionFlorecimiento;
    }

    public void setEstacionFlorecimiento(String estacionFlorecimiento) {
        this.estacionFlorecimiento = estacionFlorecimiento;
    }

    @Override
    public String saludar() {
        return "Hola, soy una Flor!! 🌼🌼 ";
    }
}
