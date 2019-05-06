
package Habilidades;


import Carta.CartasLucha.CartaJugador;
import Estados.Cambio;
import Jugador.Robinson;
import Mazo.MazoCartasRobadas;
import java.util.LinkedList;


public abstract class Habilidad {
   Robinson robinson; 
   //public void action(Personaje p,Vista v){}
   
   public abstract void usarHabilidad(MazoCartasRobadas mcr, CartaJugador cartJug, Robinson jugador, Cambio cambio);
   
   
    
}
