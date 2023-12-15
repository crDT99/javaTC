package Logica;

public class Alumno {
    int id;
    String nombre;
    String apellido;

    // ----------- CONSTRUCTORES ----------------
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // ----------Metodos --------

    // getters y setters


    public void mostrarNombre(){
        System.out.println("Hola, soy un Alumno y se decir mi nombre");
    }


}
