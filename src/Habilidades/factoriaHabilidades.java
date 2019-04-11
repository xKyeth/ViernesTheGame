
package Habilidades;

import java.util.ResourceBundle;
//@author usuario

public class factoriaHabilidades {
    
    public Habilidad creaHabilidad(String clave) {
        try {
        ResourceBundle rb=ResourceBundle.getBundle("Habilidades.Habilidad");
        Habilidad habilidad=(Habilidad)Class.forName(rb.getString(clave)).newInstance();
        return habilidad;
        }
        catch(Exception e) {
        
    }
        
    }
    
}
