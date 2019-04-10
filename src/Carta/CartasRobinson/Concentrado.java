
package Carta.CartasRobinson;
import Carta.CartasLucha.CartaJugador;
import Carta.CartasLucha.CartaRobinson;

// autor Fernando

public class Concentrado extends CartaJugador {

    CartaRobinson robinson;
    
    public Concentrado(String nombreCarta, int poder, String habilidad) {
        super(nombreCarta, poder, habilidad);
        nombreCarta = "Concentrado";
        poder = 1;
        habilidad = "+2 Vida";
    }
    
}
