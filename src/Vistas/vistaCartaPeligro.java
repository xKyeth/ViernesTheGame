
package Vistas;

import Carta.CartasLucha.CartaPeligro;
public class vistaCartaPeligro {

    public vistaCartaPeligro() {
    }
    
    public void verCarta (CartaPeligro c){
        System.out.println(c.getCarta());
        System.out.println(c.getNombre());
        System.out.println(c.getNumCartas());
        System.out.println(c.getValoramarillo());
        System.out.println(c.getValorrojo());
        System.out.println(c.getValorverde());
    }
    
}
