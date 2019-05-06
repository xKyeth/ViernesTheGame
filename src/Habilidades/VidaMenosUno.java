package Habilidades;


import Carta.CartasLucha.CartaJugador;
import Estados.Cambio;
import Jugador.Robinson;
import Mazo.MazoCartasRobadas;
import java.util.LinkedList;

/**
 *
 * @author Imanol y paula
 */

public class VidaMenosUno extends Habilidad {

    @Override
    public void usarHabilidad(MazoCartasRobadas mcr, CartaJugador cartJug, Robinson jugador, Cambio cambio) {
       jugador.restarVida(1);
    }

    
   
    
}
