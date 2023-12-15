package logica.Pokemons;

import logica.ITipoAgua;
import logica.Pokemon;

public class Squirtle extends Pokemon implements ITipoAgua {

    public Squirtle() {
    }

    // --- Metodos
    @Override
    public Integer atacarPlacaje() {
        System.out.println("Hola, soy Squirtle y este es mi ataque Placaje");
        return 10;
    }

    @Override
    public Integer atacarAranazo() {
        System.out.println("Hola, soy Squirtle y este es mi ataque arañazo");
        return 10;
    }

    @Override
    public Integer atacarMordizco() {
        System.out.println("Hola, soy Squirtle y este es mi ataque Mordizco");
        return 10;
    }
    @Override
    public Integer atacarHidroBomba() {
        System.out.println("Hola, soy Squirtle y este es mi ataque Hidro Bomba");
        return 10;
    }

    @Override
    public Integer atacarPistolaAgua() {
        System.out.println("Hola, soy Squirtle y este es mi ataque Pistola de Agua");
        return 10;
    }

    @Override
    public Integer atacarBurbuja() {
        System.out.println("Hola, soy Squirtle y este es mi ataque Burbuja");
        return 10;
    }

    @Override
    public Integer atacarHidroPulso() {
        System.out.println("Hola, soy Squirtle y este es mi ataque Hidro Pulso");
        return 10;
    }
}
