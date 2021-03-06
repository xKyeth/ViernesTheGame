package Control;

import Carta.CartasLucha.CartasPeligro.*;
import Carta.CartasPirata.*;
import Carta.CartasRobinson.*;
import Carta.Envejecimiento.*;
import Mazo.*;

/**
 *
 * @author Jesus Rosa
 */
public class Mazos {
    
    private MazoRobinson MazoRobin;
    private MazoPeligro MazoPeli;
    private MazoPirata MazoPira;
    private MazoEnvejecimiento MazoEnve;
    
    public Mazos(){    

    MazoRobin = new MazoRobinson();
    MazoPeli = new MazoPeligro();
    MazoPira = new MazoPirata();
    MazoEnve = new MazoEnvejecimiento();
    
    
    }
    
    public MazoRobinson getMazoRobinson(){
        for(int x=0; x<1; x++){
            Comer carta1 = new Comer();
            MazoRobin.añadirCarta(carta1);
        }
        
        for(int x=0; x<3; x++){
            Concentrado carta2 = new Concentrado();
            MazoRobin.añadirCarta(carta2);
        }
        
        for(int x=0; x<5; x++){
            Desconcentrado carta3 = new Desconcentrado();
            MazoRobin.añadirCarta(carta3);
        }
        
        for(int x=0; x<1; x++){
            Genial carta4 = new Genial();
            MazoRobin.añadirCarta(carta4);
        }
        
        for(int x=0; x<8; x++){
            Normal carta5 = new Normal();
            MazoRobin.añadirCarta(carta5);
        }
        this.MazoRobin.barajarCartas();
        return MazoRobin;
    }
    
    public MazoPeligro getMazoPeligro(){
        
        BarcoVarado carta1 = new BarcoVarado("lector", 0);
        MazoPeli.añadirCarta(carta1);
        
        BarcoVarado carta2 = new BarcoVarado("truco", 0);
        MazoPeli.añadirCarta(carta2);
        
        BarcoVarado carta3 = new BarcoVarado("conocimiento", 0);
        MazoPeli.añadirCarta(carta3);
    
        BarcoVarado carta4 = new BarcoVarado("imitación", 0);
        MazoPeli.añadirCarta(carta4);
        
        BarcoVarado carta5 = new BarcoVarado("nutrientes", 0);
        MazoPeli.añadirCarta(carta5);
        
        BarcoVarado carta6 = new BarcoVarado("nutrientes", 0);
        MazoPeli.añadirCarta(carta6);
        
        BarcoVarado carta7 = new BarcoVarado("equipamiento", 0);
        MazoPeli.añadirCarta(carta7);
        
        BarcoVarado carta8 = new BarcoVarado("equipamiento", 0);
        MazoPeli.añadirCarta(carta8);
        
        BarcoVarado carta9 = new BarcoVarado("estrategia", 0);
        MazoPeli.añadirCarta(carta9);
        
        BarcoVarado carta10 = new BarcoVarado("estrategia", 0);
        MazoPeli.añadirCarta(carta10);
        
        ExplorarLaIsla carta11 = new ExplorarLaIsla("imitación", 1);
        MazoPeli.añadirCarta(carta11);
        
        ExplorarLaIsla carta12 = new ExplorarLaIsla("conocimiento", 1);
        MazoPeli.añadirCarta(carta12);
        
        ExplorarLaIsla carta13 = new ExplorarLaIsla("repeticion", 1);
        MazoPeli.añadirCarta(carta13);
        
        ExplorarLaIsla carta14 = new ExplorarLaIsla("truco", 1);
        MazoPeli.añadirCarta(carta14);
        
        ExplorarLaIsla carta15 = new ExplorarLaIsla("nutrientes", 1);
        MazoPeli.añadirCarta(carta15);
        
        ExplorarLaIsla carta16 = new ExplorarLaIsla("nutrientes", 1);
        MazoPeli.añadirCarta(carta16);
        
        ExplorarLaIsla carta17 = new ExplorarLaIsla("arma", 2);
        MazoPeli.añadirCarta(carta17);
        
        ExplorarLaIsla carta18 = new ExplorarLaIsla("arma", 2);
        MazoPeli.añadirCarta(carta18);
        
        ExplorarLaSelva carta19 = new ExplorarLaSelva("experiencia", 2);
        MazoPeli.añadirCarta(carta19);
        
        ExplorarLaSelva carta20 = new ExplorarLaSelva("conocimiento", 2);
        MazoPeli.añadirCarta(carta20);
        
        ExplorarLaSelva carta21 = new ExplorarLaSelva("vision", 2);
        MazoPeli.añadirCarta(carta21);
        
        ExplorarLaSelva carta22 = new ExplorarLaSelva("estrategia", 2);
        MazoPeli.añadirCarta(carta22);
        
        ExplorarLaSelva carta23 = new ExplorarLaSelva("nutrientes", 2);
        MazoPeli.añadirCarta(carta23);
        
        ExplorarLaSelva carta24 = new ExplorarLaSelva("repeticion", 2);
        MazoPeli.añadirCarta(carta24);
        
        AnimalesSalvajes carta25 = new AnimalesSalvajes("conocimiento", 3);
        MazoPeli.añadirCarta(carta25);
        
        AnimalesSalvajes carta26 = new AnimalesSalvajes("experiencia", 3);
        MazoPeli.añadirCarta(carta26);
        
        AnimalesSalvajes carta27 = new AnimalesSalvajes("vision", 3);
        MazoPeli.añadirCarta(carta27);
        
        AnimalesSalvajes carta28 = new AnimalesSalvajes("estrategia", 3);
        MazoPeli.añadirCarta(carta28);
        
        Canibal carta29 = new Canibal("arma", 4);
        MazoPeli.añadirCarta(carta29);
        
        Canibal carta30 = new Canibal("Arma", 4);
        MazoPeli.añadirCarta(carta30);
        this.MazoPeli.barajarCartas();;
    return MazoPeli;
    }
    
    public MazoPirata getMazoPirata(){
        
        CartaPirata1 carta1 = new CartaPirata1();
        MazoPira.añadirCarta(carta1);
        
        CartaPirata2 carta2 = new CartaPirata2();
        MazoPira.añadirCarta(carta2);
        
        CartaPirata3 carta3 = new CartaPirata3();
        MazoPira.añadirCarta(carta3);
        
        CartaPirata4 carta4 = new CartaPirata4();
        MazoPira.añadirCarta(carta4);
        
        CartaPirata5 carta5 = new CartaPirata5();
        MazoPira.añadirCarta(carta5);
        
        CartaPirata6 carta6 = new CartaPirata6();
        MazoPira.añadirCarta(carta6);
        
        CartaPirata7 carta7 = new CartaPirata7();
        MazoPira.añadirCarta(carta7);
        
        CartaPirata8 carta8 = new CartaPirata8();
        MazoPira.añadirCarta(carta8);
        
        CartaPirata9 carta9 = new CartaPirata9();
        MazoPira.añadirCarta(carta9);
        
        CartaPirata10 carta10 = new CartaPirata10();
        MazoPira.añadirCarta(carta10);
        
        this.MazoPira.barajarCartas();
        return MazoPira;
    }
    
    public MazoEnvejecimiento getMazoEnvejecimiento(){
        
        Asustado carta1 = new Asustado();
        MazoEnve.añadirCarta(carta1);
        
        Autohomicida carta2 = new Autohomicida();
        MazoEnve.añadirCarta(carta2);
        
        Cansado carta3 = new Cansado();
        MazoEnve.añadirCarta(carta3);
        
        DesconcentradoE carta4 = new DesconcentradoE();
        MazoEnve.añadirCarta(carta4);
        
        Estupido carta5 = new Estupido();
        MazoEnve.añadirCarta(carta5);
        
        Hambriento carta6 = new Hambriento();
        MazoEnve.añadirCarta(carta6);
        
        Idiota carta7 = new Idiota();
        MazoEnve.añadirCarta(carta7);
        
        MuyEstupido carta8 = new MuyEstupido();
        MazoEnve.añadirCarta(carta8);
        
        MuyHambriento carta9 = new MuyHambriento();
        MazoEnve.añadirCarta(carta9);
        this.MazoEnve.barajarCartas();
        return MazoEnve;
    }
}