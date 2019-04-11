/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mazo;

import Carta.Carta;

/**
 *
 * @author alexandra
 * Esta clase es simplemente para probar las funciones de los mazos, 
 * se borra antes de terminar el juego
 */
public class Probar {
    
    public static void main(String[] args) {
        MazoPeligro peligro=new MazoPeligro();
        Carta carta1=peligro.robarCarta();
        System.out.println(carta1);
    }
}
