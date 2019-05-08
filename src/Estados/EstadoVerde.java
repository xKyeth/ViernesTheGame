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
public class EstadoVerde extends Cambio {

    @Override
    public Cambio cambioFase() {
        Cambio amarillo = new EstadoAmarillo();
        return amarillo;
    }

    @Override
    public Cambio faseAnterior() {
        Cambio verde = new EstadoVerde();
        return verde;
    }
    
}
