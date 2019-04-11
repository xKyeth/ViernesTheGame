/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carta.CartasLucha;

import Carta.Carta;
import Carta.CartasLucha.CartasPeligro.CartasContrarias.FactoriaCartasContrarias;


/**
 *
 * @author Insertar el nombre de la persona que edite esta clase
 */
public abstract class CartaPeligro extends Carta {

    public CartaPeligro(String carta, int p) {
        this.carta = carta;
        this.poder=p;
    }
    protected int valorverde;
    protected int valoramarillo;
    protected int valorrojo;
    protected int numCartas;
    protected String carta;
    protected String nombre;
    protected FactoriaCartasContrarias fact;
    protected int poder;

    public String getNombre() {
        return nombre;
    }
    
    public int getValorverde() {
        return valorverde;
    }

    public int getValoramarillo() {
        return valoramarillo;
    }

    public int getValorrojo() {
        return valorrojo;
    }

    public int getNumCartas() {
        return numCartas;
    }

    public String getCarta() {
        return carta;
    }
    
    public CartaJugador peligroConseguido(){
        CartaJugador cart=fact.getCarta(carta);
        cart.setPoder(poder);
        return cart;
    }
    
}
