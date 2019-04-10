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
public class Canibal extends CartaPeligro {
    
    public Canibal(CartaJugador carta) {
        super(carta);
        this.nombre="Canibal";
        this.valorverde=5;
        this.valoramarillo=9;
        this.valorrojo=14;
        this.numCartas=5;
    }
    
}
