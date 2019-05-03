/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Carta.Carta;
import Carta.CartasLucha.CartaJugador;
import Carta.CartasLucha.CartaPeligro;
import Carta.CartasLucha.CartaRobinson;
import Carta.CartasPirata.CartaPirata;
import Control.Control;
import java.util.LinkedList;
import java.util.Scanner;


/**
 *
 * @author JACINTO
 */
public class Vista {
    Control control;
    public Vista(Control c){
        this.control=c;
    } 
    //ENRIQUE
    public void verCartaJugador( CartaJugador c ){
        System.out.print(c.getHabilidad() + c.getNombreCarta() + c.getPoder());
   
    }
    public void verCartaPeligro (CartaPeligro c){
        
        System.out.print(c.getCarta()+c.getNombre()+c.getNumCartas()+c.getValoramarillo()+c.getValorrojo()+c.getValorverde());
        
    }
     public void verCartaPirata (CartaPirata c){
    
        System.out.println(c.getNumCartas()+c.getPoder());
      
    
    }
     //FERNANDO
     public Carta eligeCarta(LinkedList<CartaRobinson> cartas, Carta c, Vista a) {
         Scanner entrada = new Scanner(System.in);
        cartas.remove(c);
        for (int i = 0; i < cartas.size(); i++) {
            a.verCartaJugador(cartas.get(i));
        }
        System.out.print("Elige una carta: ");
        int x = entrada.nextInt();
        return cartas.get(x);
        
    }
    
}
