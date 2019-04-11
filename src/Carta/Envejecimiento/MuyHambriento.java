/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carta.Envejecimiento;

import Carta.CartasLucha.CartaJugador;

/**
 *
 * @author usuario
 */
public class MuyHambriento extends CartaJugador{
    private String tipo = "Barba blanca";
    public MuyHambriento() {
        super("Muy Hambriento", 0, "-2 de vida");
    }

    
    public String getTipo() {
        return tipo;
    }   
}
