
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

    
    public String getNombreCarta() {
        return nombreCarta;
    }

    
    public void setNombreCarta(String nombreCarta) {
        this.nombreCarta = nombreCarta;
    }

    
    public int getPoder() {
        return poder;
    }

    
    public void setPoder(int poder) {
        this.poder = poder;
    }
    
    
}


