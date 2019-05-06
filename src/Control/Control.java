package Control;

import Carta.Carta;
import Carta.CartasLucha.*;
import Estados.*;
import Fase.*;
import Jugador.Robinson;
import Mazo.Descartes.*;
import Mazo.*;
import Vistas.Vista;
import java.util.Scanner;

/**
 *
 * @author Jesus Rosa
 */
public class Control {
    // Para ese turno, robar una carta del mazo de Robinson y guardarlo en un arrayList de cartas para ese turno.
    Cambio cambio;
    Robinson jugador;
    Vista vista;
    Fase fase;
    CartaPeligro peligro;
    Mazos mazos;
    MazoDescartesPeligros descartesPeligro;
    MazoDescartesRobinson descartesRobinson;
    MazoDescartesTotal descartesFinal;
    MazoCartasRobadas mano;
    MazoEnvejecimiento mazoEnvejecimiento;
    MazoPeligro mazoPeligro;
    MazoPirata mazoPirata;
    MazoRobinson mazoRobinson;
    public Control(){
        this.cambio=new EstadoVerde();
        this.vista=new Vista(this);
        this.fase=new FasePeligro();
        this.mazos=new Mazos();
        //Iniciacion de los mazos
        this.mazoEnvejecimiento=mazos.getMazoEnvejecimiento();
        this.mazoPeligro=mazos.getMazoPeligro();
        this.mazoPirata=mazos.getMazoPirata();
        this.mazoRobinson=mazos.getMazoRobinson(); 
        this.descartesFinal=new MazoDescartesTotal();
        this.descartesRobinson=new MazoDescartesRobinson();
        this.descartesPeligro=new MazoDescartesPeligros();
        //Relacion de los mazos
        this.descartesPeligro.setMazoanterior(mazoPeligro);
        this.mazoPeligro.setMazoanterior(descartesPeligro);
        this.mano.setMazoanterior(mazoRobinson);
        this.descartesRobinson.setMazoanterior(mano);
        this.mazoRobinson.setMazoanterior(descartesRobinson);
    }
    
    public void elegirCarta(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Robamos dos cartas.");
        Carta carta1=mazoPeligro.cogerCarta();
        Carta carta2=mazoPeligro.cogerCarta();
        System.out.println("¿Qué carta quieres quedarte? 1 para la primera, 2 para la segunda.");
        System.out.println(carta1);
        System.out.println(carta2);
        int respuesta=sc.nextInt();
        
        switch (respuesta) {
            case 1:
                peligro=(CartaPeligro) carta1;
                descartesPeligro.añadirCarta(carta2);
                break;
            case 2:
                peligro=(CartaPeligro) carta2;
                descartesPeligro.añadirCarta(carta1);
                break;
            default:
                throw new AssertionError();
        }
    }
    public void lucha(){
        Cambio cam=cambio;
        int robar=peligro.getNumCartas();
        int nivel;
        if (cambio instanceof EstadoVerde){
            nivel=peligro.getValorverde();
        }else if (cambio instanceof EstadoAmarillo){
            nivel=peligro.getValoramarillo();
        }else if (cambio instanceof EstadoRojo){
            nivel=peligro.getValorrojo();
        }else if (cambio instanceof EstadoPiratas){
        //Llamar al metodo lucha pirata
            return;
        }
        mano.robarCarta();
        int num=0;
        while (num!=3){
            
        }
        
    }
}
