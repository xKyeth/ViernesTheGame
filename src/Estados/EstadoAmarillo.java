/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estados;

/**
 *
 * @author usuario
 */
public class EstadoAmarillo extends Cambio {
    
    @Override
    public void cambioFase() {
        Cambio rojo = new EstadoRojo();
    }
    
}
