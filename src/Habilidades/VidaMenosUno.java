package Habilidades;


import Carta.CartasLucha.CartaJugador;
import Jugador.Robinson;
import Mazo.MazoCartasRobadas;
import java.util.LinkedList;


public class VidaMenosUno extends Habilidad {

    @Override
    public void usarHabilidad(LinkedList<MazoCartasRobadas> mcr, CartaJugador cartJug, Robinson jugador) {
       jugador.restarVida(1);
    }

    
   
    
}
