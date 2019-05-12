/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Habilidades;

import Carta.Carta;
import Carta.CartasLucha.CartaJugador;
import Estados.Cambio;
import Jugador.Robinson;
import Mazo.MazoCartasRobadas;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author paula
 */
public class CartaMasAlta0 extends Habilidad{

    @Override
    public void usarHabilidad(MazoCartasRobadas mcr, CartaJugador cartJug, Robinson jugador, Cambio cambio) {
        int mayor=0;
        CartaJugador c=null;
        LinkedList<CartaJugador> cartas=mcr.getListaCartasRobadas();
        
        for(int i=0;i<cartas.size();i++){
           if(cartas.get(i).getPoder()>mayor){
               mayor=cartas.get(i).getPoder();
               c=cartas.get(i);
           }
          c.setPoder(0);
        }
        
        
    }
    
}
