/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carta.CartasPirata;
import Mazo.*;

/**
 *
 * @author alexandra
 */
public class CartaPirata1 extends CartaPirata {
    
    MazoEnvejecimiento me;
    
    
    
    
    public CartaPirata1(){
        setPoder((me.getListaCartasMazo().size()-10)*2);
        setNumCartas(5);
    }
    
    
    
    
    
}
