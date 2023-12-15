package logica;

import logica.Pokemons.Bulbasaur;
import logica.Pokemons.Charmander;
import logica.Pokemons.Pikachu;
import logica.Pokemons.Squirtle;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Squirtle squirtle1 = new Squirtle();
        Charmander charmander1 = new Charmander();
        Bulbasaur bulbasaur1 = new Bulbasaur();
        Pikachu pikachu1 = new Pikachu();

        squirtle1.atacarAranazo();
        squirtle1.atacarHidroBomba();

        charmander1.atacarAranazo();
        charmander1.atacarLanzallamas();

        bulbasaur1.atacarAranazo();
        bulbasaur1.atacarDrenaje();

        pikachu1.atacarAranazo();
        pikachu1.atacarImpacTrueno();

    }
}