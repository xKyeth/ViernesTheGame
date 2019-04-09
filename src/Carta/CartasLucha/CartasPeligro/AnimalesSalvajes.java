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
public class AnimalesSalvajes extends CartaPeligro {
    
    public AnimalesSalvajes(CartaJugador carta) {
        super(carta);
        this.nombre="Animales Salvajes";
        this.valorverde=4;
        this.valoramarillo=7;
        this.valorrojo=11;
        this.numCartas=4;
    }
    
}
