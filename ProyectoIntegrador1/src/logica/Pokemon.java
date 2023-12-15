package logica;

public abstract class Pokemon {
    private Integer numPokedex;
    private String nombrePokemon;
    private Double pesoPokemon;
    private char sexoDelPokemon;
    private Integer TemporadaAparaicion;


    protected abstract Integer atacarPlacaje();
    protected abstract Integer atacarAranazo();
    protected abstract Integer atacarMordizco();

}
