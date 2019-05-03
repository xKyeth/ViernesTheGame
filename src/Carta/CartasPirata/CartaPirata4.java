/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carta.CartasPirata;

import Carta.CartasLucha.CartaJugador;
import Jugador.Robinson;
import Mazo.MazoCartasRobadas;
import java.util.LinkedList;

/**
 *
 * @author imanol
 */
public class CartaPirata4 extends CartaPirata {
    
    public CartaPirata4(){
        setPoder(16);
        setNumCartas(7);
    }
    
        public void skillCarta(Robinson jugador){
            jugador.setValorCarta(2);
        }
        
        
}
