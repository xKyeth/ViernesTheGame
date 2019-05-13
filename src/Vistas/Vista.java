/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Carta.Carta;
import Carta.CartasLucha.CartaJugador;
import Carta.CartasLucha.CartaPeligro;
import Carta.CartasPirata.CartaPirata;
import Control.Control;
import Jugador.Robinson;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author JACINTO
 */
public class Vista {
    Control control;
    CartaJugador robinson;
    public Vista(Control c){
        this.control=c;
    } 
    //ENRIQUE
    public void verCartaJugador( CartaJugador c ){
        System.out.println(c.getHabilidad()+" " + c.getNombreCarta()+" " + c.getPoder());
   
    }
    public void verCartasJugador( LinkedList<Carta> cartas){
        for (int i = 0; i < cartas.size(); i++) {
            robinson = (CartaJugador) cartas.get(i);
            this.verCartaJugador(robinson);
        }
   
    }
    public void verCartaPeligro (CartaPeligro c){
        
        System.out.println(c.getCarta()+" "+c.getNombre()+" "+c.getNumCartas()+" "+c.getValorverde()+" "+c.getValoramarillo()+" "+c.getValorrojo());
        
        
    }
     public void verCartaPirata (CartaPirata c){
    
        System.out.println(c.getNumCartas()+c.getPoder());
      
    
    }
     //FERNANDO
     public CartaJugador eligeCartaHabilidad(LinkedList<Carta> cartas, Carta c) {
         Scanner entrada = new Scanner(System.in);
        cartas.remove(c);
        
        for (int i = 0; i < cartas.size(); i++) {
            robinson = (CartaJugador) cartas.get(i);
            this.verCartaJugador(robinson);
        }
        System.out.print("Elige una carta: ");
        int x = entrada.nextInt();
        robinson = (CartaJugador) cartas.get(x);
        return robinson;
        
    }
     public CartaJugador eligeCarta(LinkedList<Carta> cartas) {
         Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < cartas.size(); i++) {
            robinson = (CartaJugador) cartas.get(i);
            this.verCartaJugador(robinson);
        }
        System.out.print("Elige una carta: ");
        int x = entrada.nextInt();
        robinson = (CartaJugador) cartas.get(x);
        return robinson;
        
    }
     
     //FERNANDO
     public int elegirOpcion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Robar carta");
        System.out.println("Usar carta");
        System.out.println("Terminar fase");
        int x = entrada.nextInt();
        return x;
    }
    public CartaJugador eligeCartaAleatoria(LinkedList<Carta> cartas, Carta c) {
        Collections.shuffle(cartas);
        robinson= (CartaJugador) cartas.get(0);
         this.verCartaJugador(robinson);
        return robinson;
    }
     
}
