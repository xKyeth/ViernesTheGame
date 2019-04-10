
package Fase;

/**
 *
 * @author Jesus Rosa
 */
public class Fase {
    
      Fase e;
    protected String nombre;
    
    public Fase(){
        
    }
    
    public Fase cambiaEstado(){
        return e;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
