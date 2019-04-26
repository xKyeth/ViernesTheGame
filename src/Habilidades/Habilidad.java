
package Habilidades;

import Carta.Carta;
import Jugador.Robinson;
import java.util.LinkedList;


public abstract class Habilidad {
   Robinson robinson; 
   //public void action(Personaje p,Vista v){}
   
   public abstract void usarHabilidad(LinkedList<Carta> cartas, Carta carta, Robinson jugador);
   
   
    
}
