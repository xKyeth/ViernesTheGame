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
public class Cansado extends CartaJugador{
    private String tipo = "Barba negra";
    public Cansado(String nombreCarta, int poder, String habilidad) {
        super("Cansado", 0, "Stop!");
    }

    
    public String getTipo() {
        return tipo;
    }   
}