/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mazo;

import Carta.CartasLucha.CartaPeligro;
import java.util.LinkedList;

/**
 *
 * @author alexandra
 */
public class MazoPeligro extends Mazo {
    private LinkedList<CartaPeligro> listaCartasPeligro;

    public LinkedList<CartaPeligro> getListaCartasPeligro() {
        return listaCartasPeligro;
    }

    public void setListaCartasPeligro(LinkedList<CartaPeligro> listaCartasPeligro) {
        this.listaCartasPeligro = listaCartasPeligro;
    }
}
