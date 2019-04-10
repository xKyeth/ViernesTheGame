
package Carta.CartasRobinson;
import Carta.CartasLucha.CartaJugador;

//autor Fernando

public class Genial extends CartaJugador {

    public Genial(String nombreCarta, int poder) {
        super(nombreCarta, poder);
        nombreCarta = "Genial";
        poder = 2;
    }

    @Override
    public void habilidad() {
        //No tiene ninguna habilidad
    }
    
    
}
