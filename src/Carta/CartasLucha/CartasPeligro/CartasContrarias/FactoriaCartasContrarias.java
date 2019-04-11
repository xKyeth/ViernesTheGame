/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carta.CartasLucha.CartasPeligro.CartasContrarias;

import Carta.CartasLucha.CartaJugador;
import java.util.ResourceBundle;

/**
 *
 * @author pecorte
 */
public class FactoriaCartasContrarias {
    ResourceBundle rb=ResourceBundle.getBundle("Carta.CartasLucha.CartasPeligro.CartasContrarias.cartasPeligros");

    public FactoriaCartasContrarias() {
    
    }
    public CartaJugador getCarta(String p){
        try{
            String nombre=rb.getString(p);
            CartaJugador a=(CartaJugador)Class.forName(nombre).newInstance();
            return a;
        }catch (Exception e){
            System.out.println("Error properties Peligro");
            return null;
        }
        
    }
}
