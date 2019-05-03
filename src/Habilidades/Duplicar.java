/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Habilidades;

import Carta.CartasLucha.CartaJugador;
import Jugador.Robinson;
import Mazo.MazoCartasRobadas;
import java.util.LinkedList;

/**
 *
 * @author Imanol G
 */
public class Duplicar extends Habilidad {

    CartaJugador cj;
    
    @Override
    public void usarHabilidad(MazoCartasRobadas mcr, CartaJugador cartJug, Robinson jugador) {
        cj.setPoder(cj.getPoder()*2);
    }
    
    
}
