
package Carta.CartasLucha;

import Carta.Carta;

//autor Fernando

public abstract class CartaJugador extends Carta {
    
    private String nombreCarta;
    private int poder;
    
    public CartaJugador(String nombreCarta, int poder) {
        this.nombreCarta = nombreCarta;
        this.poder = poder;
        
    }
    
    public abstract void habilidad();
    
    
}


