package relaciones;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Relaciones {
    public static void main(String[] args) {


    //  ---- LISTA DE PROPIETARIOS ---

        List<Propietario> listaPropietarios = new ArrayList<>();
        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();

        prop1.setId(10L);
        prop1.setNombre("Cristian");
        prop1.setApellido("DLT");


        prop2.setId(20L);
        prop2.setNombre("Andrea");
        prop2.setApellido("DVL");

        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);

        // --- NEW AUTO

        Auto auto1 = new Auto();
        auto1.setId(1L);
        auto1.setMarca("Remault");
        auto1.setModelo("Duster");

        auto1.setOwner(prop1);
        auto1.setOwnerList(listaPropietarios);


        System.out.println(" el auto con datos: " + auto1.toString());
        System.out.println(" tiene como propietario principal a: " + auto1.getOwner().toString());
        System.out.println(" y tiene los siguientes dueños asociados: " + auto1.getOwnerList().toString());
    }
}