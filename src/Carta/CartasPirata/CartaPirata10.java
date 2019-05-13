/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carta.CartasPirata;

import Carta.CartasLucha.CartaJugador;
import Jugador.Robinson;
import Mazo.MazoCartasRobadas;
import Mazo.MazoEnvejecimiento;
import Mazo.MazoPeligro;

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
    
    @Override
public void skillCarta (Robinson robinson, MazoCartasRobadas mcr,MazoEnvejecimiento me, MazoPeligro mdp){            cj.setPoder(cj.getPoder()+1);
        }
    
}
