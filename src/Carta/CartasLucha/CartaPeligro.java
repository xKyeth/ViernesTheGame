/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carta.CartasLucha;


/**
 *
 * @author Insertar el nombre de la persona que edite esta clase
 */
public abstract class CartaPeligro extends CartaJugador {

    public CartaPeligro(CartaJugador carta) {
        this.carta = carta;
    }
    protected int valorverde;
    protected int valoramarillo;
    protected int valorrojo;
    protected int numCartas;
    protected CartaJugador carta;
    protected String nombre;

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

    public CartaJugador getCarta() {
        return carta;
    }
    
}
