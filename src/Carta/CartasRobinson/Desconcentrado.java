
package Carta.CartasRobinson;
import Carta.CartasLucha.CartaJugador;
 //autor Fernando

public class Desconcentrado extends CartaJugador {

    public Desconcentrado(String nombreCarta, int poder) {
        super(nombreCarta, poder);
        nombreCarta = "Desconcentrado";
        poder = -1;
    }

    @Override
    public void habilidad() {
        //No tiene ninguna habilidad
    }
    
}
