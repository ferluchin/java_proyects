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
public class SolicitudSaldo extends Transaccion {

    public SolicitudSaldo(int intNumeroCuenta) {
        super(intNumeroCuenta);
    }

    @Override
    public String ejecutar() {

        return "Resultado Ejecutar Solicitud Saldo";
    }

}
