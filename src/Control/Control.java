package Control;

import Carta.Carta;
import Carta.CartasLucha.*;
import Carta.CartasLucha.CartasPeligro.CartasContrarias.FactoriaCartasContrarias;
import Carta.CartasPirata.CartaPirata;
import Estados.*;
import Fase.*;
import Habilidades.*;
import Jugador.Robinson;
import Mazo.Descartes.*;
import Mazo.*;
import Vistas.Vista;
import java.applet.Applet;
import java.applet.AudioClip;
import java.util.Scanner;

/**
 *
 * @author pecorte
 */
public class Control {
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
    factoriaHabilidades factoriaHabilidades;
    FactoriaCartasContrarias factoriaContrarias;
    Scanner sc;
    CartaPirata pirata1;
    CartaPirata pirata2;    
    public Control(){
        sc=new Scanner(System.in);
        this.jugador=new Robinson(20);
        this.factoriaContrarias= new FactoriaCartasContrarias();
        this.factoriaHabilidades=new factoriaHabilidades();
        this.cambio=new EstadoVerde();
        this.vista=new Vista(this);
        this.fase=new FasePeligro();
        this.mazos=new Mazos();
        //Iniciacion de los mazos
        mano=new MazoCartasRobadas();
        mazoEnvejecimiento=new MazoEnvejecimiento();
        mazoPeligro=new MazoPeligro();
        mazoPirata=new MazoPirata();
        mazoRobinson=new MazoRobinson();
        this.mazoRobinson=mazos.getMazoRobinson(); 
        this.mazoEnvejecimiento=mazos.getMazoEnvejecimiento();
        this.mazoPeligro=mazos.getMazoPeligro();
        this.mazoPirata=mazos.getMazoPirata();
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
    
    public void jugar(){
        this.descartesRobinson.robarmazo();
        mano.clear();
        if(mazoPeligro.hayCartas())
            cambio=cambio.cambioFase();
        if(cambio instanceof EstadoPiratas)
            this.fasePirata();
        else
            this.fasePeligro();
        jugar();
    }
    
    public void fasePeligro(){
        System.out.println("Robamos dos cartas.");
        CartaPeligro carta1=(CartaPeligro) mazoPeligro.cogerCarta();
        CartaPeligro carta2=(CartaPeligro) mazoPeligro.cogerCarta();
        elegirPeligro(carta1, carta2);
        lucha();
    }
    
    public void elegirPeligro(CartaPeligro carta1, CartaPeligro carta2){
        System.out.println("¿Qué carta quieres quedarte? 1 para la primera, 2 para la segunda.");
        vista.verCartaPeligro(carta1);
        vista.verCartaPeligro(carta2);
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
                System.out.println("Error al escoger carta seleccione 1 o 2");
                elegirPeligro(carta1, carta2);
                break;
        }
    }
    public void jugada(int robar, Cambio cam){
        boolean exit=false;
        mano.robarCarta();
        while (exit!=true){
            if (cam instanceof EstadoVerde){
                System.out.println("Puntos Necesarios: "+peligro.getValorverde());
            }else if (cam instanceof EstadoAmarillo){
                System.out.println("Puntos Necesarios: "+peligro.getValoramarillo());
            }else if (cam instanceof EstadoRojo){
                System.out.println("Puntos Necesarios: "+peligro.getValorrojo());
            }
            System.out.println("Puntos de Vida: "+jugador.getVida());
            vista.verCartasJugador(mano.getListaCartasMazo());
            System.out.println(mano.getValor());
            int x=vista.elegirOpcion();
            switch (x){
                case 1:
                    if( robar>0 ){
                        robar--;
                        mano.robarCarta();
                    }else if (!jugador.robarcarta())
                        mano.robarCarta();
                    else 
                        System.out.println("No se pueden robar mas cartas");
                    break;
                case 2:
                    Habilidad hab;
                    CartaJugador jug=vista.eligeCarta(mano.getListaCartasMazo());
                    String habi=jug.getHabilidad();
                    if (habi!="..."){
                        hab=factoriaHabilidades.creaHabilidad(habi);
                        hab.usarHabilidad(mano, jug, jugador, cam);}
                    else
                        System.out.println("Esta carta no tiene habilidad");
                    break;
                case 3:
                    exit=true;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }
    }
        public void jugadaPirata(int robar, Cambio cam, CartaPirata p){
        boolean exit=false;
        mano.robarCarta();
        while (exit!=true){
            System.out.println("Puntos Necesarios: "+p.getPoder());
            System.out.println("Puntos de Vida: "+jugador.getVida());
            vista.verCartasJugador(mano.getListaCartasMazo());
            System.out.println(mano.getValor());
            int x=vista.elegirOpcion();
            switch (x){
                case 1:
                    if( robar>0 ){
                        robar--;
                        mano.robarCarta();
                    }else if (!jugador.robarcarta())
                        mano.robarCarta();
                    else 
                        System.out.println("No se pueden robar mas cartas");
                    break;
                case 2:
                    Habilidad hab;
                    CartaJugador jug=vista.eligeCarta(mano.getListaCartasMazo());
                    String habi=jug.getHabilidad();
                    if (habi!="..."){
                        hab=factoriaHabilidades.creaHabilidad(habi);
                        hab.usarHabilidad(mano, jug, jugador, cam);}
                    else
                        System.out.println("Esta carta no tiene habilidad");
                    break;
                case 3:
                    exit=true;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }   
    }
    public void lucha(){
        Cambio cam=cambio;
        int robar=peligro.getNumCartas()-1;
        int nivel=0;
        jugada(robar, cam);
        if (cam instanceof EstadoVerde){
            nivel=peligro.getValorverde();
        }else if (cam instanceof EstadoAmarillo){
            nivel=peligro.getValoramarillo();
        }else if (cam instanceof EstadoRojo){
            nivel=peligro.getValorrojo();
        }else if (cam instanceof EstadoPiratas){
        //Llamar al metodo lucha pirata
            return;
        }
        if(nivel<=mano.getValor())
            this.descartesRobinson.añadirCarta(factoriaContrarias.getCarta(peligro.getCarta()));
        else{
            this.descartesPeligro.añadirCarta(peligro);
            if(jugador.restarVida(nivel-mano.getValor()))
                finJuego();
        }
    }
    
    public void fasePirata(){
        System.out.println("Cogemos 2 Cartas de Piratas");
        CartaPirata cartaAux1=(CartaPirata) mazoPirata.cogerCarta();
        CartaPirata cartaAux2=(CartaPirata) mazoPirata.cogerCarta();
        elegirPirata(cartaAux1, cartaAux2);
        luchaPirata(pirata1);
        luchaPirata(pirata2);
        victoria();
    }
    public void elegirPirata(CartaPirata cartaAux1, CartaPirata cartaAux2){
        System.out.println("¿Con cual quiere luchar Primero? 1 para la primera, 2 para la segunda.");
        vista.verCartaPirata(cartaAux1);
        vista.verCartaPirata(cartaAux2);
        int respuesta=sc.nextInt();
        switch (respuesta) {
            case 1:
                pirata1=cartaAux1;
                pirata2=cartaAux2;
                break;
            case 2:
                pirata1=cartaAux2;
                pirata2=cartaAux1;
                break;
            default:
                System.out.println("Error al escoger carta seleccione 1 o 2");
                elegirPirata(cartaAux1, cartaAux2);
                break;
        }
        
    }
    public void luchaPirata(CartaPirata pirata){
        Cambio cam=cambio;
        pirata.skillCarta(jugador, mano, mazoEnvejecimiento, mazoPeligro);
        int robar=pirata.getNumCartas()-1;
        int nivel=pirata.getPoder();
        jugadaPirata(robar, cam, pirata);
        if(nivel<=mano.getValor())
            this.descartesRobinson.añadirCarta(factoriaContrarias.getCarta(peligro.getCarta()));
        else{
            finJuego();
        }
    }
    public void finJuego(){
        System.out.println("Ha muerto");
        System.exit(0);
    }
    public void victoria(){
        System.out.println("Ha ganado");
        System.exit(0);
    }
}
