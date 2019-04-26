package Habilidades;

import Carta.Carta;
import Habilidades.Habilidad;
import Jugador.Robinson;
import java.util.LinkedList;


public class VidaMenosUno extends Habilidad {
    Robinson j;
    
    @Override
    public void usarHabilidad(LinkedList<Carta> cartas, Carta carta, Robinson jugador) {
        j.restarVida(1);
    }
}
