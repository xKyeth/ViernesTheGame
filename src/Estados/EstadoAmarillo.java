/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estados;
import Carta.CartasLucha.CartaRobinson;

/**
 *
 * @author usuario
 */
public class EstadoAmarillo extends Cambio {
    CartaRobinson robinson ;
    @Override
    public void cambioFase() {
        robinson.setFase() = new EstadoRojo();
    }
    
}