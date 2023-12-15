import encapsulamiento.Alumno;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(15,"TestName","Alfonso");
        System.out.println("id :" + alu2.getId());
        System.out.println("nombre :" + alu2.getNombre());
        System.out.println("apellido :" + alu2.getApellido());
    }
}