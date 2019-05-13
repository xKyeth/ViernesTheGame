/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mazo;

import Carta.CartasLucha.CartaJugador;
import java.util.LinkedList;

/**
 *
 * @author alexandra
 */
public class MazoRobinson extends Mazo{
    private LinkedList<CartaJugador> listaCartasRobinson;

    @Override
    public void robarCarta(){
        if(!this.listaCartas.isEmpty())
            this.robarmazo();
        listaCartas.add(mazoanterior.cogerCarta());
    }
    public LinkedList<CartaJugador> getListaCartasRobinson() {
        return listaCartasRobinson;
    }

    public void setListaCartasRobinson(LinkedList<CartaJugador> listaCartasRobinson) {
        this.listaCartasRobinson = listaCartasRobinson;
    }
}
