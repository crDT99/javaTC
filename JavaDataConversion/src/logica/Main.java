package logica;

public class Main {
    public static void main(String[] args) {
        double num = 1.67;

    // CASTING - CASTEO

        //casteo a entero
            int numInt = (int) num;
        //casteo a long
        long numLong = (long) num;

        System.out.println("double: " + num);  //double: 1.67
        System.out.println("int: " + numInt);  //int: 1
        System.out.println("long: " + numLong); //long: 1

        // no redondea, solo captura la parte entera


        // METODOS DE CONVERSION

        String cantidad = "15";
        String precio = "150.27";

        int cantEntero = Integer.parseInt(cantidad);
        double precioDouble = Double.parseDouble(precio);

        //System.out.println(" intento de String " + (cantidad * precio)); // ERROR
        System.out.println(" El valor total de la compra es: " + (cantEntero * precioDouble));

        int edad = 30;
        double estatura = 1.67;

        String edadString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);

        System.out.println("Edad: " + edadString + " Estatura: " + estaturaString);

    }
}