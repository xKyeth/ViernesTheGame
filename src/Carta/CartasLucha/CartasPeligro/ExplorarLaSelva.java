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
public class ExplorarLaSelva extends CartaPeligro {
    
    public ExplorarLaSelva(CartaJugador carta) {
        super(carta);
        this.nombre="Explorando la Selva Profunda";
        this.valorverde=2;
        this.valoramarillo=5;
        this.valorrojo=8;
        this.numCartas=3;
    }
    
}
