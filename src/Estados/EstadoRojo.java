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
public class EstadoRojo extends Cambio{
    
    @Override
    public Cambio cambioFase() {
       Cambio piratas = new EstadoPiratas();
       return piratas;
    }

    @Override
    public Cambio faseAnterior() {
        Cambio amarillo = new EstadoAmarillo();
        return amarillo;
    }
    
}
