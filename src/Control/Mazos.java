package Control;

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
    
}