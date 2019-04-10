
package Carta.CartasLucha;

import Carta.Carta;


 //@autor Fernando

public abstract class CartaRobinson extends Carta {
    
    private String fase;
    private int vida;
   
    
    public CartaRobinson() {
        setFase("Verde");
        setVida(20);
    }

    
    public String getFase() {
        return fase;
    }

    
    public void setFase(String fase) {
        this.fase = fase;
    }

    
    public int getVida() {
        return vida;
    }

    
    public void setVida(int vida) {
        this.vida = vida;
    }
    
}
