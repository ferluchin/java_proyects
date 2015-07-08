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
public class Volante {
    
    int numVolantes;
    String tipoVolante;

    public Volante(int numVolantes, String tipoVolante) {
        this.numVolantes = numVolantes;
        this.tipoVolante = tipoVolante;
    }

    public int getNumVolantes() {
        return numVolantes;
    }

    public String getTipoVolante() {
        return tipoVolante;
    }
    
    
    
}
