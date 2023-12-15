package logica.Pokemons;

import logica.ITipoFuego;
import logica.Pokemon;

public class Charmander extends Pokemon implements ITipoFuego {

    public Charmander() {
    }

    // --- Metodos
    @Override
    public Integer atacarPlacaje() {
        System.out.println("Hola, soy Charmander y este es mi ataque Placaje");
        return 10;
    }

    @Override
    public Integer atacarAranazo() {
        System.out.println("Hola, soy Charmander y este es mi ataque Arañazo");
        return 10;
    }

    @Override
    public Integer atacarMordizco() {
        System.out.println("Hola, soy Charmander y este es mi ataque Mordizco");
        return 10;
    }

    @Override
    public Integer atacarPunioFuego() {
        System.out.println("Hola, soy Charmander y este es mi ataque Punio Fuego");
        return 10;
    }

    @Override
    public Integer atacarAscuas() {
        System.out.println("Hola, soy Charmander y este es mi ataque Ascuas");
        return 10;
    }

    @Override
    public Integer atacarLanzallamas() {
        System.out.println("Hola, soy Charmander y este es mi ataque Lanzallamas");
        return 10;
    }
}
