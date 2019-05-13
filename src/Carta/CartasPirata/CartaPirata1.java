/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carta.CartasPirata;
import Jugador.Robinson;
import Mazo.*;

/**
 *
 * @author alexandra
 */
public class CartaPirata1 extends CartaPirata {
    
    
    
    
    
    
    public CartaPirata1(){
        
        setNumCartas(5);
    }
    
    public void skillCarta (Robinson robinson, MazoCartasRobadas mcr,MazoEnvejecimiento me, MazoPeligro mdp){
        
        setPoder((me.getListaCartasMazo().size()-10)*2);
    }
    
    
    
}
