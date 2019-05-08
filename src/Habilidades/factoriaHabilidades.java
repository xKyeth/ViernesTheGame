
package Habilidades;

import java.util.ResourceBundle;
//@autor Fernando

public class factoriaHabilidades {
    public factoriaHabilidades(){}
    public Habilidad creaHabilidad(String clave){
        try{
            ResourceBundle rb=ResourceBundle.getBundle("Habilidades.Habilidad");
            Habilidad habilidad=(Habilidad)Class.forName(rb.getString(clave)).newInstance();
            return habilidad;
        }catch (Exception e){
            System.out.println("Habilidad no encontrada");
            return null;
        }
        
        
    }
    }
    

