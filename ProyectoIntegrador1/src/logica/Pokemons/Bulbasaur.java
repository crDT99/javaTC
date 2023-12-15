package logica.Pokemons;

import logica.ITipoPlanta;
import logica.Pokemon;

public class Bulbasaur extends Pokemon implements ITipoPlanta {

    public Bulbasaur() {
    }

    @Override
    public Integer atacarPlacaje() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque Placaje");
        return 10;
    }

    @Override
    public Integer atacarAranazo() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque arañazo");
        return 10;
    }

    @Override
    public Integer atacarMordizco() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque Mordizco");
        return 10;
    }

    @Override
    public Integer atacarParalizar() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque Paralizar");
        return 10;
    }

    @Override
    public Integer atacarDrenaje() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque Drenaje");
        return 10;
    }

    @Override
    public Integer atacarHojaAfilada() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque Hoja filada");
        return 10;
    }

    @Override
    public Integer atacarLatigoCepa() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque Latigo Cepa");
        return 10;
    }
}
