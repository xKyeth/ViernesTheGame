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
public class Autohomicida extends CartaJugador{
    private String tipo = "Barba blanca";
    public Autohomicida() {
        super("Autohomicida", -5, "...");
    }

    
    public String getTipo() {
        return tipo;
    }   
}
