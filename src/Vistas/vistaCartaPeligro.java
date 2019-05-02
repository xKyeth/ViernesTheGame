
package Vistas;

import Carta.CartasLucha.CartaPeligro;
public class vistaCartaPeligro {

    public vistaCartaPeligro() {
    }
    
    public void verCarta (CartaPeligro c){
        
        System.out.print(c.getCarta()+c.getNombre()+c.getNumCartas()+c.getValoramarillo()+c.getValorrojo()+c.getValorverde());
        
    }
    
}
