package Logica;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Planta arbol1 = new Arbol("Pino", 10D ,true, "Calido" , "Pino Largo" ,
                "Tronco Duro" , 30D , "Verde" , "Hoja de Pino");

        Planta flor1 = new Flor("Orquidea",20D,true,"Templado",
                "Blanco con Morado", 6 , "Morado", "Albina", "Primavera");


        Planta arbusto1 = new Arbusto("Arbusto", 20D , true , "Frio"
                , 5D ,true, "Comun", true, "Verdes");


        System.out.println(arbol1.saludar());
        System.out.println(flor1.saludar());
        System.out.println(arbusto1.saludar());



    }
}