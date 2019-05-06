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
    LinkedList<Carta> listaCartasRobadas;
    MazoPeligro peligro;
    MazoDescartesPeligros despeligro;
    
    

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
        listaCartas.add(cj);
    }
}
