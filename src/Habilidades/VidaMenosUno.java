package Habilidades;


import Carta.CartasLucha.CartaJugador;
import Jugador.Robinson;
import Mazo.MazoCartasRobadas;
import java.util.LinkedList;

/**
 *
 * @author Imanol y paula
 */

public class VidaMenosUno extends Habilidad {

    @Override
    public void usarHabilidad(LinkedList<MazoCartasRobadas> mcr, CartaJugador cartJug, Robinson jugador) {
       jugador.restarVida(1);
    }

    
   
    
}
