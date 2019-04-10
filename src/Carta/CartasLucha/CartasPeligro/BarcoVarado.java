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
public class BarcoVarado extends CartaPeligro {

    public BarcoVarado(CartaJugador carta) {
        super(carta);
        this.nombre="Barco Varado";
        this.valorverde=0;
        this.valoramarillo=1;
        this.valorrojo=3;
        this.numCartas=1;
    }

    
}
