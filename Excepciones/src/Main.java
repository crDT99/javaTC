
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] ages = { 15,0,23,30};

        try {

            System.out.println("el resultado es: " + ages[0] / ages[1]);
            System.out.println("la edad de la posicion 4 es: " + ages[4]);

        }catch (ArithmeticException e){
            System.out.println(" No se puede dividir por cero! ");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" No existe ese indice ");
        }catch (Exception e){
            System.out.println("ha ocurrido un error");
        }

    }
}