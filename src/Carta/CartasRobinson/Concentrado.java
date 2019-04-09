
package Carta.CartasRobinson;
import Carta.CartasLucha.CartaJugador;
 
// autor Fernando

public class Concentrado extends CartaJugador {

    public Concentrado(String nombreCarta, int poder) {
        super(nombreCarta, poder);
        nombreCarta = "Concentrado";
        poder = 1;
    }
    
    
    @Override
    public void habilidad() {
        //aumenta dos de vida
    }
    
}
