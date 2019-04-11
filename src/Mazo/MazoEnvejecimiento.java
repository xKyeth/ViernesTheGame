/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mazo;

import Carta.CartasLucha.CartaEnvejecimiento;
import java.util.LinkedList;

/**
 *
 * @author alexandra
 */
public class MazoEnvejecimiento extends Mazo {
    private LinkedList<CartaEnvejecimiento> listaCartasEnvejecimiento;

    public LinkedList<CartaEnvejecimiento> getListaCartasEnvejecimiento() {
        return listaCartasEnvejecimiento;
    }

    public void setListaCartasEnvejecimiento(LinkedList<CartaEnvejecimiento> listaCartasEnvejecimiento) {
        this.listaCartasEnvejecimiento = listaCartasEnvejecimiento;
    }
}
