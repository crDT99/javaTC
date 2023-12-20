package videojuegos;


import java.util.ArrayList;
import java.util.List;

public class Consola {
    private String nombreConsola;
    private Integer generacion;
    private Double costoUSD;

    private List<VideoJuego> gamesInThisConsole = new ArrayList<>();

    public Consola() {
    }

    public Consola(String nombreConsola, Integer generacion, Double costoUSD, List<VideoJuego> gamesInThisConsole) {
        this.nombreConsola = nombreConsola;
        this.generacion = generacion;
        this.costoUSD = costoUSD;
        this.gamesInThisConsole = gamesInThisConsole;
    }

    public void addGameToConsole(VideoJuego game){
        gamesInThisConsole.add(game);
    }


    public List<VideoJuego> getGamesInThisConsole() {
        return gamesInThisConsole;
    }

    public void setGamesInThisConsole(List<VideoJuego> gamesInThisConsole) {
        this.gamesInThisConsole = gamesInThisConsole;
    }

    public java.lang.String getNombreConsola() {
        return nombreConsola;
    }

    public void setNombreConsola(java.lang.String nombreConsola) {
        this.nombreConsola = nombreConsola;
    }

    public java.lang.Integer getGeneracion() {
        return generacion;
    }

    public void setGeneracion(java.lang.Integer generacion) {
        this.generacion = generacion;
    }

    public java.lang.Double getCostoUSD() {
        return costoUSD;
    }

    public void setCostoUSD(java.lang.Double costoUSD) {
        this.costoUSD = costoUSD;
    }


    @Override
    public String toString() {
        String fullString = "";
        Integer count = 0;
        for(VideoJuego game : gamesInThisConsole)
        {
            count++;
            String lineString = "juego N." + count + " " + game.getTitulo() + " " + " es de la consola : " + nombreConsola + " es para " + game.getCantidadJugadores() + " jugadores";
            System.out.println(lineString);
            fullString.concat(lineString);
        }
        return fullString;
    }
}
