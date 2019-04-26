/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Habilidades;
import Carta.Carta;
import Carta.CartasLucha.CartaJugador;
import Jugador.Robinson;
import Mazo.MazoCartasRobadas;
import java.util.LinkedList;
/**
 *
 * @author Imanol y paula
 */
public class MasUnoVida extends Habilidad {

    @Override
    public void usarHabilidad(LinkedList<MazoCartasRobadas> mcr, CartaJugador cartJug, Robinson jugador) {
        jugador.sumarVida(1);
    }
    
    
    

    
    
    
}
