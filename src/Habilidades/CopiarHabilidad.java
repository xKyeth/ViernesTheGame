/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Habilidades;

import Carta.CartasLucha.CartaJugador;
import Carta.CartasLucha.CartaRobinson;
import Jugador.Robinson;
import Mazo.MazoCartasRobadas;
import Vistas.Vista;
import java.util.LinkedList;

/**
 *
 * @author Imanol G
 */
public class CopiarHabilidad extends Habilidad{

    Vista vista;
  
    @Override
    public void usarHabilidad(MazoCartasRobadas mcr, CartaJugador cartJug, Robinson jugador) {
        vista.eligeCarta(mcr, cartJug);
    }
    
}