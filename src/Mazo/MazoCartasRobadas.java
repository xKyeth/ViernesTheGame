/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mazo;

import Carta.Carta;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author alexandra
 */
public class MazoCartasRobadas extends Mazo{
    LinkedList<Carta> listaCartasRobadas;
    MazoPeligro peligro;
    // Tengo que robar dos cartas, y este mazo tiene que mantener 1 de las
    // dos cartas, la cual elige el usuario. (Este mazo va a servir como 
    // tablero de las cartas)
    
    public void quedarseCarta(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Robamos dos cartas.");
        Carta carta1=peligro.robarCarta();
        Carta carta2=peligro.robarCarta();
        System.out.println("¿Qué carta quieres quedarte? 1 para la primera, 2 para la segunda.");
        System.out.println(carta1);
        System.out.println(carta2);
        int respuesta=sc.nextInt();
        
        switch (respuesta) {
            case 1:
                listaCartasRobadas.add(carta1);
                break;
            case 2:
                listaCartasRobadas.add(carta2);
                break;
            default:
                throw new AssertionError();
        }
    }
}
