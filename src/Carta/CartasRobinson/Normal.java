
package Carta.CartasRobinson;
import Carta.CartasLucha.CartaJugador;

 //author Fernando
 
public class Normal extends CartaJugador {

    public Normal(String nombreCarta, int poder) {
        super(nombreCarta, poder);
        nombreCarta = "Normal";
        poder = 0;
    }

    @Override
    public void habilidad() {
        //No tiene ninguna habilidad
    }
    
    
}
