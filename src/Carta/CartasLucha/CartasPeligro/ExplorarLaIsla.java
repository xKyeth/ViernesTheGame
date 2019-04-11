/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carta.CartasLucha.CartasPeligro;

import Carta.CartasLucha.CartaJugador;
import Carta.CartasLucha.CartaPeligro;

/**
 *
 * @author pecorte
 */
public class ExplorarLaIsla extends CartaPeligro {
    
    public ExplorarLaIsla(String carta, int p) {
        super(carta, p);
        this.nombre="Explorando la Isla";
        this.valorverde=1;
        this.valoramarillo=3;
        this.valorrojo=6;
        this.numCartas=2;
    }
    
}
