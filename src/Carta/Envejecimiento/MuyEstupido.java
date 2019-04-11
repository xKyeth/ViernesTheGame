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
public class MuyEstupido extends CartaJugador{
    private String tipo = "Barba negra";
    public MuyEstupido() {
        super("Muy Estupido", -3, "...");
    }

    
    public String getTipo() {
        return tipo;
    }   
}
