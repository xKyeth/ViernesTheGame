
package Vistas;
import Carta.*;
import Carta.CartasLucha.CartaRobinson;
import java.util.LinkedList;
import java.util.Scanner;
 // @author Fernando

public class elegirCarta {
    
    Scanner entrada = new Scanner(System.in);
    
    public elegirCarta() {
        
    }
    
    public Carta eligeCarta(LinkedList<CartaRobinson> cartas, Carta c, Vista a) {
        cartas.remove(c);
        for (int i = 0; i < cartas.size(); i++) {
            a.verCartaJugador(cartas.get(i));
        }
        System.out.print("Elige una carta: ");
        int x = entrada.nextInt();
        return cartas.get(x);
        
    }
    
}
