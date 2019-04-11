package Control;

import Carta.CartasLucha.CartasPeligro.BarcoVarado;
import Carta.CartasRobinson.Comer;
import Carta.CartasRobinson.Concentrado;
import Carta.CartasRobinson.Desconcentrado;
import Mazo.MazoEnvejecimiento;
import Mazo.MazoPeligro;
import Mazo.MazoPirata;
import Mazo.MazoRobinson;

/**
 *
 * @author Jesus Rosa
 */
public class Mazos {
    
    private MazoRobinson MazoRobin;
    private MazoPeligro MazoPeli;
    private MazoPirata MazoPira;
    private MazoEnvejecimiento MazoEnve;
    
    public void Mazos(){    

    MazoRobin = new MazoRobinson();
    MazoPeli = new MazoPeligro();
    MazoPira = new MazoPirata();
    MazoEnve = new MazoEnvejecimiento();
    
    
    }
    
    public MazoRobinson getMazoRobinson(){
        
        Comer carta1 = new Comer();
        MazoRobin.añadirCarta(carta1);
        
        Concentrado carta2 = new Concentrado();
        MazoRobin.añadirCarta(carta2);
        
        Desconcentrado carta3 = new Desconcentrado();
        MazoRobin.añadirCarta(carta3);
        return MazoRobin;
    }
    
    public MazoPeligro getMazoPeligro(){
    BarcoVarado carta1 = new BarcoVarado("Lector", 0);
    
    return MazoPeli;
    }
    
}