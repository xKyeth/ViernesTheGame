/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mazo;

import Carta.CartasLucha.CartaRobinson;
import java.util.LinkedList;

/**
 *
 * @author alexandra
 */
public class MazoRobinson extends Mazo{
    private LinkedList<CartaRobinson> listaCartasRobinson;

    public LinkedList<CartaRobinson> getListaCartasRobinson() {
        return listaCartasRobinson;
    }

    public void setListaCartasRobinson(LinkedList<CartaRobinson> listaCartasRobinson) {
        this.listaCartasRobinson = listaCartasRobinson;
    }
}
