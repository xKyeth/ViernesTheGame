/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mazo;

import Carta.Carta;
import java.util.*;

/**
 *
 * @author alexandra
 */
public abstract class Mazo {
    LinkedList<Carta> listaCartas;
    Carta carta;
    Mazo mazoanterior;
    // ROBAR, BARAJAR 
    
    public Mazo(){
        this.listaCartas = new LinkedList();
    }
    
    public Carta cogerCarta() {
        Carta carta=listaCartas.getFirst();
        listaCartas.remove(carta);
        return carta;
    }
    public void robarCarta(){
        
        listaCartas.add(mazoanterior.cogerCarta());
    }
    public void robarmazo(){
        listaCartas=mazoanterior.getListaCartasMazo();
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

    public void setListaCartas(LinkedList<Carta> listaCartas) {
        this.listaCartas = listaCartas;
    }
    
    public LinkedList<Carta> robarMazo() {
        LinkedList<Carta> listaaux=new LinkedList();
        this.listaCartas=listaaux;
        this.listaCartas=null;
        return listaaux;
    }

    public void setMazoanterior(Mazo mazoanterior) {
        this.mazoanterior = mazoanterior;
    }
    
}
