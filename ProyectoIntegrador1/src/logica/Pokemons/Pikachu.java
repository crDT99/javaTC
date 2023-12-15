package logica.Pokemons;

import logica.ITipoTrueno;
import logica.Pokemon;

public class Pikachu extends Pokemon implements ITipoTrueno {

    public Pikachu() {
    }

    // --- Metodos
    @Override
    public Integer atacarPlacaje() {
        System.out.println("Hola, soy Pikachu y este es mi ataque Placaje");
        return 10;
    }

    @Override
    public Integer atacarAranazo() {
        System.out.println("Hola, soy Pikachu y este es mi ataque arañazo");
        return 10;
    }

    @Override
    public Integer atacarMordizco() {
        System.out.println("Hola, soy Pikachu y este es mi ataque Mordizco");
        return 10;
    }
    @Override
    public Integer atacarImpacTrueno() {
        System.out.println("Hola, soy Pikachu y este es mi ataque ImpacTrueno");
        return 10;
    }

    @Override
    public Integer atacarPunioTrueno() {
        System.out.println("Hola, soy Pikachu y este es mi ataque Puño Trueno");
        return 10;
    }

    @Override
    public Integer atacarRayo() {
        System.out.println("Hola, soy Pikachu y este es mi ataque Rayo");
        return 10;
    }

    @Override
    public Integer atacarRayoCarga() {
        System.out.println("Hola, soy Pikachu y este es mi ataque Rayo Cargado ");
        return 10;
    }
}
