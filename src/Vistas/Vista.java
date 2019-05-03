/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Carta.CartasLucha.CartaJugador;
import Carta.CartasLucha.CartaPeligro;
import Carta.CartasPirata.CartaPirata;
import Control.Control;

/**
 *
 * @author pecorte
 */
public class Vista {
    Control control;
    public Vista(Control c){
        this.control=c;
    } 
    
    public void verCartaJugador( CartaJugador c ){
        System.out.print(c.getHabilidad() + c.getNombreCarta() + c.getPoder());
   
    }
    public void verCartaPeligro (CartaPeligro c){
        
        System.out.print(c.getCarta()+c.getNombre()+c.getNumCartas()+c.getValoramarillo()+c.getValorrojo()+c.getValorverde());
        
    }
     public void verCartaPirata (CartaPirata c){
    
        System.out.println(c.getNumCartas()+c.getPoder());
      
    
    }
    
}
