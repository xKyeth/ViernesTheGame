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
public class Asustado extends CartaJugador{
    private String tipo = "Barba negra";
    public Asustado(String nombreCarta, int poder, String habilidad) {
        super("Asustado", 0, "Tu mayor carta = 0");
    }

    
    public String getTipo() {
        return tipo;
    }   
}
