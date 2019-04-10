
package Carta.CartasLucha;

import Carta.Carta;

//autor Fernando

public abstract class CartaJugador extends Carta {
    
    private String nombreCarta;
    private int poder;
    private String habilidad;
    
    public CartaJugador(String nombreCarta, int poder, String habilidad) {
        this.nombreCarta = nombreCarta;
        this.poder = poder;
        this.habilidad = habilidad;
        
    }
    

    
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

    
    public String getHabilidad() {
        return habilidad;
    }

    
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
    
    
}


