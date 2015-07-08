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
public class Cuenta {

    int intNumeroCuenta;
    int intNID;
    double dblSaldoDisponible;
    double dblSaldoTotal;

    public int validarNID(int intNID) {

        return intNID;

    }

    public double obtenerSaldoDisponible(double dblSaldoDisponible) {

        return dblSaldoDisponible;

    }
    
    public double obtenerSaldoTotal(double dblSaldoTotal) {

        return dblSaldoDisponible;

    }
    
    public String abonar (){
    
    return "Operacion Realizada Con exito";
    
    }
    
    public String cargar (){
    
    return "Carga realizada con Exito";
    
    }
    //Metodos
    /*
    
     validarNID
     obtenerSaldoDisponible
     obtenerSaldoTotal
     abonar
     cargar
    
     */
}
