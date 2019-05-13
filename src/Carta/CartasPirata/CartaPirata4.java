/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carta.CartasPirata;

import Carta.CartasLucha.CartaJugador;
import Jugador.Robinson;
import Mazo.*;
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
    
    @Override
        public void skillCarta (Robinson robinson, MazoCartasRobadas mcr,MazoEnvejecimiento me, MazoPeligro mdp){
            robinson.setValorCarta(2);
        }
        
        
}
