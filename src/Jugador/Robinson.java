package Jugador;

/**
 *
 * @author paula
 */
public class Robinson {
    private int vida;
    private int valorCarta=1;
    public Robinson(int vida){
        this.vida=vida;
    }

    /**
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public void sumarVida(int n){
         if(this.vida+n<22){
             this.vida=this.vida+n;
         }         
    }
    
    public boolean restarVida(int n){
        boolean muerto;
        this.vida=this.vida-n;
        
        //se resta la vida y si se queda en negativo la variable muerto es true;
        
            if(this.vida-n>=0){
                muerto=false;
            }
            else
                muerto=true;
        
        return muerto;
    }
    public void setValorCarta(int valorCarta) {
        this.valorCarta = valorCarta;
    }
    
    public boolean robarcarta(){
        boolean muerto;
        //se resta la vida y si se queda en negativo la variable muerto es true;
        if(this.vida-this.valorCarta>=0){
                this.vida=this.vida-this.valorCarta;
                muerto=false;
            }
            else
                muerto=true;
        
        return muerto;
    }
}
