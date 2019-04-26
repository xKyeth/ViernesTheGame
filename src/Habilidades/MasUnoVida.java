/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Habilidades;
import Carta.Carta;
import Jugador.Robinson;
import java.util.LinkedList;
/**
 *
 * @author Imanol G
 */
public class MasUnoVida extends Habilidad {
    Robinson j;
    
    @Override
    public void usarHabilidad(LinkedList<Carta> cartas, Carta carta, Robinson jugador){
       
    j.sumarVida(1);
        
   }
    
    
    
}
