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
public class Idiota extends CartaJugador{
    private String tipo = "Barba blanca";
    public Idiota() {
        super("Asustado", -4, "...");
    }

    
    public String getTipo() {
        return tipo;
    }   
}
