/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mazo;

import Carta.Carta;
import Carta.CartasLucha.CartaJugador;
import Mazo.Descartes.MazoDescartesPeligros;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author alexandra
 */
//variable valor
public class MazoCartasRobadas extends Mazo{
    private int valor;
    private LinkedList<CartaJugador> listaCartasRobadas;
    MazoPeligro peligro;
    MazoDescartesPeligros despeligro;
    int valorCarta=2;
    
    
    public MazoCartasRobadas(){
        this.listaCartasRobadas= new LinkedList();
    }
    
    @Override
    public void clear(){
        this.valor=0;
        this.listaCartas.clear();
    }
    
    //FERNANDO
    public int getValor() {
        return valor;
    }

    //FERNANDO
    public void setValor(int valor) {
        this.valor = valor;
    }
    @Override
    public void robarCarta(){
        
        Carta c=mazoanterior.cogerCarta();
        CartaJugador cj=(CartaJugador) c;
        this.valor=valor+cj.getPoder();
        this.listaCartas.add(c);
    }
    public void setValorCarta(int x){
        this.valorCarta=x;
    }

    /**
     * @return the listaCartasRobadas
     */
    public LinkedList<CartaJugador> getListaCartasRobadas() {
        return listaCartasRobadas;
    }
}
