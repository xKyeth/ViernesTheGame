/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mazo;

import Carta.CartasPirata.CartaPirata;
import java.util.LinkedList;

/**
 *
 * @author Imanol
 */
public class MazoPirata extends Mazo{
    
    private LinkedList<CartaPirata> listaCartasPirata;    

    public LinkedList<CartaPirata> getListaCartasPirata() {
        return listaCartasPirata;
    }

    public void setListaCartasPirata(LinkedList<CartaPirata> listaCartasPirata) {
        this.listaCartasPirata = listaCartasPirata;
    }
    
}
