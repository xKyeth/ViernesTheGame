/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mazo;

import Carta.Carta;
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
    // Tengo que robar dos cartas, y este mazo tiene que mantener 1 de las
    // dos cartas, la cual elige el usuario. (Este mazo va a servir como 
    // tablero de las cartas)

    //FERNANDO
    public int getValor() {
        return valor;
    }

    //FERNANDO
    public void setValor(int valor) {
        this.valor = valor;
    }
}
