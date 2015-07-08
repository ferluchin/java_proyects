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
public class Deposito extends Transaccion {

    double dblMonto;

    public Deposito(double dblMonto, int intNumeroCuenta) {
        super(intNumeroCuenta);
        this.dblMonto = dblMonto;
    }

    @Override
    public String ejecutar() {

        return "Resultado Ejecutar Deposito";
    }

}
