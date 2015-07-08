/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Luis
 */
public class Pantalla {
    
    String strMensaje;

    public Pantalla(String strMensaje) {
        this.strMensaje = strMensaje;
    }
    
    
    public String mostrarMensaje(String strMensaje) {
    
        System.out.println("Este es el sistema de Cajeros Automaticos"+strMensaje);
        return "Finalizado";
    }
    
    /*
    *
    mostrarMensaje()
    */
}
