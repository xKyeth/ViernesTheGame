
package Carta.CartasLucha;

import Carta.Carta;
import Estados.Cambio;
import Estados.*;

 //@autor Fernando

public abstract class CartaRobinson extends Carta {
    
    private Cambio cambio;
    private int vida;
   
    
    public CartaRobinson() {
        cambio = new EstadoVerde();
        setVida(20);
    }

  
    public int getVida() {
        return vida;
    }

    
    public void setVida(int vida) {
        this.vida = vida;
    }

    
    public Cambio getCambio() {
        return cambio;
    }

    
    public void setCambio(Cambio cambio) {
        this.cambio = cambio;
    }
    
}
