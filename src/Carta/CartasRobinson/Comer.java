
package Carta.CartasRobinson;

import Carta.CartasLucha.CartaJugador;

 //autor usuario

 
public class Comer extends CartaJugador {

    public Comer(String nombreCarta, int poder) {
        super(nombreCarta, poder);
        nombreCarta = "Comer";
        poder = 0;
    }
    
    @Override
    public void habilidad() {
        //No tiene ninguna habilidad
    }
    
}
