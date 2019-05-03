/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carta.CartasPirata;

import Carta.CartasLucha.CartaJugador;
import Jugador.Robinson;

/**
 *
 * @author imanol
 */
public class CartaPirata10 extends CartaPirata {
    CartaJugador cj;
    
    public CartaPirata10(){
        setPoder(52);
        setNumCartas(10);
    }
    
    
    public void skillCarta(Robinson jugador){
            cj.setPoder(cj.getPoder()+1);
        }
    
}
