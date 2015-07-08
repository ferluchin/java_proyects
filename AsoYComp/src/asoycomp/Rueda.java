/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asoycomp;

/**
 *
 * @author ruben
 */
public class Rueda {
    private String strEmpresa;
    private String strCodigo;

    
    public Rueda(String strEmpresa, String strCodigo) {
        this.strEmpresa = strEmpresa;
        this.strCodigo = strCodigo;
    }
    
    public String GetEmpresa(){
        return this.strEmpresa;
    }
    
    public String GetCodigo(){
        return this.strCodigo;
    }
    
    @Override
    public String toString() {
        return "[Codigo: "+this.GetCodigo()+"] [Empresa: "+this.GetEmpresa()+"]";
    }    
}
