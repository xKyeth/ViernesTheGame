/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carta.CartasPirata;

import Carta.CartasLucha.CartaJugador;

/**
 *
 * @author imanol
 */
public class CartaPirata7 extends CartaPirata {
    CartaJugador cj;
    public CartaPirata7(){
        setPoder(22);
        setNumCartas(9);
    }
    
    public void skillCarta(){
            cj.setPoder(cj.getPoder()/2);
        }
}
