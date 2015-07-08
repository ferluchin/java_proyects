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
public class ATM {
    boolean boolUsuarioAutenticado = false;
    
    
    RanuraDeposito rn = new RanuraDeposito();
    Pantalla screen = new Pantalla("Este es el mensaje enviado");
    DispensadorEfectivo de = new DispensadorEfectivo(200);
    Teclado keyboard = new Teclado(1);
    
    
    
    
}
