
package Carta.CartasRobinson;
import Carta.CartasLucha.CartaJugador;
import Carta.CartasLucha.CartaRobinson;
// autor Fernando

public class Concentrado extends CartaJugador {

    CartaRobinson robinson;
    
    public Concentrado(String nombreCarta, int poder) {
        super(nombreCarta, poder);
        nombreCarta = "Concentrado";
        poder = 1;
    }
    
    
    @Override
    public void habilidad() {
        robinson.setVida(robinson.getVida()+2);
    }
    
}
