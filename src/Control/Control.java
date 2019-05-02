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
    Carta peligro;
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
        this.mazoEnvejecimiento=mazos.getMazoEnvejecimiento();
        this.mazoPeligro=mazos.getMazoPeligro();
        this.mazoPirata=mazos.getMazoPirata();
        this.mazoRobinson=mazos.getMazoRobinson();       
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
                peligro=carta1;
                descartesPeligro.añadirCarta(carta2);
                break;
            case 2:
                peligro=carta2;
                descartesPeligro.añadirCarta(carta1);
                break;
            default:
                throw new AssertionError();
        }
    }
    public void lucha(){
        
    }
}
