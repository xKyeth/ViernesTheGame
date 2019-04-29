package Control;

import Carta.CartasLucha.CartaPeligro;
import Estados.*;
import Fase.*;
import Jugador.Robinson;
import Mazo.Descartes.*;
import Mazo.*;
import Vistas.Vista;

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
        mazoEnvejecimiento=mazos.getMazoEnvejecimiento();
        mazoPeligro=mazos.getMazoPeligro();
        mazoPirata=mazos.getMazoPirata();
        mazoRobinson=mazos.getMazoRobinson();
    }
}
