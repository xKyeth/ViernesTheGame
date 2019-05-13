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
 * @author imanol
 */
public class CartaPirata5 extends CartaPirata {
     MazoPeligro mp;
     
     public CartaPirata5(){
        
        setNumCartas(6);
    }
     
     
   public void skillCarta (Robinson robinson, MazoCartasRobadas mcr,MazoEnvejecimiento me, MazoPeligro mdp){
             
    setPoder(mp.getListaCartasMazo().size());
       
  }

     
}
