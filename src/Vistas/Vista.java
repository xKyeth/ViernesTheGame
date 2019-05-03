/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Carta.Carta;
import Carta.CartasLucha.CartaJugador;
import Carta.CartasLucha.CartaPeligro;
import Carta.CartasLucha.CartaRobinson;
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
    CartaRobinson robinson;
    public Vista(Control c){
        this.control=c;
    } 
    //ENRIQUE
    public void verCartaJugador( CartaJugador c ){
        System.out.print(c.getHabilidad() + c.getNombreCarta() + c.getPoder());
   
    }
    public void verCartaPeligro (CartaPeligro c){
        
        System.out.print(c.getCarta()+c.getNombre()+c.getNumCartas()+c.getValoramarillo()+c.getValorrojo()+c.getValorverde());
        
    }
     public void verCartaPirata (CartaPirata c){
    
        System.out.println(c.getNumCartas()+c.getPoder());
      
    
    }
     //FERNANDO
     public CartaRobinson eligeCarta(LinkedList<Carta> cartas, Carta c) {
         Scanner entrada = new Scanner(System.in);
        cartas.remove(c);
        
        for (int i = 0; i < cartas.size(); i++) {
            robinson = (CartaRobinson) cartas.get(i);
            this.verCartaJugador(robinson);
        }
        System.out.print("Elige una carta: ");
        int x = entrada.nextInt();
        robinson = (CartaRobinson) cartas.get(x);
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
    public CartaRobinson eligeCartaAleatoria(LinkedList<Carta> cartas, Carta c) {
        Collections.shuffle(cartas);
        robinson= (CartaRobinson) cartas.get(0);
         this.verCartaJugador(robinson);
        return robinson;
    }
     
}
