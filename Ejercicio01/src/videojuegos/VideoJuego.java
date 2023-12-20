package videojuegos;

public class VideoJuego {
    private Integer codigo;
    private String titulo;

    private String nombreCategoria;

    private  Integer cantidadJugadores;

    public VideoJuego() {
    }

    public VideoJuego(Integer codigo, String titulo, String nombreCategoria, Integer cantidadJugadores) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.nombreCategoria = nombreCategoria;
        this.cantidadJugadores = cantidadJugadores;
    }


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public Integer getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(Integer cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

}
