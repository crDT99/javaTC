package videojuegos;

import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Consola nintendo64 = new Consola();
        Consola xbox360 = new Consola();
        Consola playStation5 = new Consola();

        VideoJuego mario64 = new VideoJuego(1,"Super Mario Bros 64","Plataformero",2);
        VideoJuego smash = new VideoJuego(2,"Super Smash Bros","Peleas",4);
        VideoJuego marioKart = new VideoJuego(3,"Mario Kart","Carreras",8);
        VideoJuego pokemon = new VideoJuego(4,"Pokemon Red & Blue","Aventuras",1);
        VideoJuego sonic = new VideoJuego(5,"Sonic The HedgeHog","Plataformero",1);

        VideoJuego halo3 = new VideoJuego(6,"Halo 3","Shooter",2);
        VideoJuego uncharted = new VideoJuego(7,"Uncharted","Aventuras",2);


        // -------- Nintendo ------------
        nintendo64.setNombreConsola("nintendo 64");
        nintendo64.setGeneracion(1);
        nintendo64.setCostoUSD(300D);
        nintendo64.setGamesInThisConsole(new ArrayList<>(Arrays.asList(mario64,smash,marioKart,pokemon)));
        nintendo64.addGameToConsole(sonic);


        // -------- Xbox360 ------------
        xbox360.setNombreConsola("Xbox 360");
        xbox360.setGeneracion(2);
        xbox360.setCostoUSD(300D);
        xbox360.addGameToConsole(halo3);


        // -------- PlayStation ------------
        playStation5.setNombreConsola("PlayStation5");
        playStation5.setGeneracion(4);
        playStation5.setCostoUSD(400D);
        playStation5.addGameToConsole(uncharted);


        nintendo64.toString();

    }

}