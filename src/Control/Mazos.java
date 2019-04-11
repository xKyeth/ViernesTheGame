package Control;

import Carta.CartasLucha.CartasPeligro.*;
import Carta.CartasPirata.*;
import Carta.CartasRobinson.*;
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
        
        Genial carta4 = new Genial();
        MazoRobin.añadirCarta(carta4);
        
        Normal carta5 = new Normal();
        MazoRobin.añadirCarta(carta5);
        
        return MazoRobin;
    }
    
    public MazoPeligro getMazoPeligro(){
        
        BarcoVarado carta1 = new BarcoVarado("Lector", 0);
        MazoPeli.añadirCarta(carta1);
        
        BarcoVarado carta2 = new BarcoVarado("Truco", 0);
        MazoPeli.añadirCarta(carta2);
        
        BarcoVarado carta3 = new BarcoVarado("Conocimiento", 0);
        MazoPeli.añadirCarta(carta3);
    
        BarcoVarado carta4 = new BarcoVarado("Imitación", 0);
        MazoPeli.añadirCarta(carta4);
        
        BarcoVarado carta5 = new BarcoVarado("Nutrientes", 0);
        MazoPeli.añadirCarta(carta5);
        
        BarcoVarado carta6 = new BarcoVarado("Nutrientes", 0);
        MazoPeli.añadirCarta(carta6);
        
        BarcoVarado carta7 = new BarcoVarado("Equipamiento", 0);
        MazoPeli.añadirCarta(carta7);
        
        BarcoVarado carta8 = new BarcoVarado("Equipamiento", 0);
        MazoPeli.añadirCarta(carta8);
        
        BarcoVarado carta9 = new BarcoVarado("Estrategia", 0);
        MazoPeli.añadirCarta(carta9);
        
        BarcoVarado carta10 = new BarcoVarado("Estrategia", 0);
        MazoPeli.añadirCarta(carta10);
        
        ExplorarLaIsla carta11 = new ExplorarLaIsla("Imitación", 1);
        MazoPeli.añadirCarta(carta11);
        
        ExplorarLaIsla carta12 = new ExplorarLaIsla("Conocimiento", 1);
        MazoPeli.añadirCarta(carta12);
        
        ExplorarLaIsla carta13 = new ExplorarLaIsla("Repeticion", 1);
        MazoPeli.añadirCarta(carta13);
        
        ExplorarLaIsla carta14 = new ExplorarLaIsla("Truco", 1);
        MazoPeli.añadirCarta(carta14);
        
        ExplorarLaIsla carta15 = new ExplorarLaIsla("Nutrientes", 1);
        MazoPeli.añadirCarta(carta15);
        
        ExplorarLaIsla carta16 = new ExplorarLaIsla("Nutrientes", 1);
        MazoPeli.añadirCarta(carta16);
        
        ExplorarLaIsla carta17 = new ExplorarLaIsla("Arma", 2);
        MazoPeli.añadirCarta(carta17);
        
        ExplorarLaIsla carta18 = new ExplorarLaIsla("Arma", 2);
        MazoPeli.añadirCarta(carta18);
        
        ExplorarLaSelva carta19 = new ExplorarLaSelva("Experiencia", 2);
        MazoPeli.añadirCarta(carta19);
        
        ExplorarLaSelva carta20 = new ExplorarLaSelva("Conocimiento", 2);
        MazoPeli.añadirCarta(carta20);
        
        ExplorarLaSelva carta21 = new ExplorarLaSelva("Vision", 2);
        MazoPeli.añadirCarta(carta21);
        
        ExplorarLaSelva carta22 = new ExplorarLaSelva("Estrategia", 2);
        MazoPeli.añadirCarta(carta22);
        
        ExplorarLaSelva carta23 = new ExplorarLaSelva("Nutrientes", 2);
        MazoPeli.añadirCarta(carta23);
        
        ExplorarLaSelva carta24 = new ExplorarLaSelva("Repeticion", 2);
        MazoPeli.añadirCarta(carta24);
        
        AnimalesSalvajes carta25 = new AnimalesSalvajes("Conocimiento", 3);
        MazoPeli.añadirCarta(carta25);
        
        AnimalesSalvajes carta26 = new AnimalesSalvajes("Experiencia", 3);
        MazoPeli.añadirCarta(carta26);
        
        AnimalesSalvajes carta27 = new AnimalesSalvajes("Vision", 3);
        MazoPeli.añadirCarta(carta27);
        
        AnimalesSalvajes carta28 = new AnimalesSalvajes("Estrategia", 3);
        MazoPeli.añadirCarta(carta28);
        
        Canibal carta29 = new Canibal("Arma", 4);
        MazoPeli.añadirCarta(carta29);
        
        Canibal carta30 = new Canibal("Arma", 4);
        MazoPeli.añadirCarta(carta30);
        
    return MazoPeli;
    }
    
    public MazoPirata getMazoPirata(){
        
        CartaPirata1 carta1 = new CartaPirata1();
        MazoRobin.añadirCarta(carta1);
        
        CartaPirata2 carta2 = new CartaPirata2();
        MazoRobin.añadirCarta(carta2);
        
        CartaPirata3 carta3 = new CartaPirata3();
        MazoRobin.añadirCarta(carta3);
        
        CartaPirata4 carta4 = new CartaPirata4();
        MazoRobin.añadirCarta(carta4);
        
        CartaPirata5 carta5 = new CartaPirata5();
        MazoRobin.añadirCarta(carta5);
        
        CartaPirata6 carta6 = new CartaPirata6();
        MazoRobin.añadirCarta(carta6);
        
        CartaPirata7 carta7 = new CartaPirata7();
        MazoRobin.añadirCarta(carta7);
        
        CartaPirata8 carta8 = new CartaPirata8();
        MazoRobin.añadirCarta(carta8);
        
        CartaPirata9 carta9 = new CartaPirata9();
        MazoRobin.añadirCarta(carta9);
        
        CartaPirata10 carta10 = new CartaPirata10();
        MazoRobin.añadirCarta(carta10);
        
        return MazoPira;
    }
    
    public MazoEnvejecimiento getMazoEnvejecimiento(){
        
        Comer carta1 = new Comer();
        MazoRobin.añadirCarta(carta1);
        
        Concentrado carta2 = new Concentrado();
        MazoRobin.añadirCarta(carta2);
        
        Desconcentrado carta3 = new Desconcentrado();
        MazoRobin.añadirCarta(carta3);
        
        Genial carta4 = new Genial();
        MazoRobin.añadirCarta(carta4);
        
        Normal carta5 = new Normal();
        MazoRobin.añadirCarta(carta5);
        
        return MazoEnve;
    }
}