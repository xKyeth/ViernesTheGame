/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sonido;

import java.applet.Applet;
import java.applet.AudioClip;

/**
 *
 * @author Jesus Rosa
 */
public class Sonido {
    
    AudioClip fondo1;
    AudioClip fondo2;
    
    public void SonidoFondo(){
    fondo1 = Applet.newAudioClip(getClass().getResource("/Sonido/Sonido.wav"));   
    fondo2.stop();
    fondo1.play();
    fondo1.loop();
}
        
    public void SonidoFondo2(){
    fondo2 = Applet.newAudioClip(getClass().getResource("/Sonido/Sonido2.wav"));
    fondo2.play();
    
}
    
    
    
}
