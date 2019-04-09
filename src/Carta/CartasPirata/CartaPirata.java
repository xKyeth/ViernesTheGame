/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carta.CartasPirata;

import Carta.Carta;

/**
 *
 * @author imanol
 */
public abstract class CartaPirata extends Carta {
    
    private int poder;
    private int numCartas;

    /**
     * @return the poder
     */
    public int getPoder() {
        return poder;
    }

    /**
     * @param poder the poder to set
     */
    public void setPoder(int poder) {
        this.poder = poder;
    }

    /**
     * @return the numCartas
     */
    public int getNumCartas() {
        return numCartas;
    }

    /**
     * @param numCartas the numCartas to set
     */
    public void setNumCartas(int numCartas) {
        this.numCartas = numCartas;
    }
    
}
