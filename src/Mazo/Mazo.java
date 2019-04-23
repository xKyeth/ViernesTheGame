/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mazo;

import Carta.Carta;
import Jugador.Robinson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author alexandra
 */
public abstract class Mazo {
    LinkedList<Carta> listaCartas;
    Carta carta;
    Robinson robinson;
    
    // ROBAR, BARAJAR 
    
    public Carta robarCarta() {
        Carta carta=listaCartas.getFirst();
        listaCartas.remove(carta);
        return carta;
    }
    
    public Carta robarNCartaGratis(int numero){
        for(int i=0;i<numero;i++){
            Carta carta=listaCartas.getFirst();
            listaCartas.remove(carta);
        }
        return carta;
    }
    
    public Carta robarNCartaVida(int numero) {
        for(int i=0;i<numero;i++){
            Carta carta=listaCartas.getFirst();
            listaCartas.remove(carta);
            robinson.restarVida(1);
        }
        
        return carta;
    }
    
    private static void barajarCartas(Mazo mazo){
	Collections.shuffle((List<?>) mazo);
    }
        
    public LinkedList<Carta> getListaCartasMazo() {
        return listaCartas;
    }

    public void setListaMazo(LinkedList<Carta> listaCartas) {
        this.listaCartas = listaCartas;
    }
    
    public void añadirCarta(Carta carta){
        getListaCartasMazo().add(carta);
    }

    public void eliminarCarta(Carta carta){
        getListaCartasMazo().remove(0);
    }
    
    public LinkedList<Carta> verCartas(Mazo mazo){
        LinkedList<Carta> cartas=mazo.getListaCartasMazo();
        return cartas;
    }
}
