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
public class DispensadorEfectivo {

    int intCuenta = 500;
    int intMontoSol;

    public DispensadorEfectivo(int intMontoSol) {
        this.intMontoSol = intMontoSol;
    }

    
    public String dispensarEfectivo(int intMontoSol) {
        
        if (haySuficienteEfectivoDisponible()) {
            return "Se ha concluido con exito la transaccion";
        } else {
            return "No se ha podido completar la transaccion, saldo insuficiente";

        }
    }

    public boolean haySuficienteEfectivoDisponible() {
        if ((intCuenta - intMontoSol) >= 0) {
            return true;
        } else {
            return false;
        }
    }
    /*
     dispensarEfectivo
     haySuficienteEfectivoDisponible : Boolean
    
     */

}
