/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asoycomp;

import java.util.ArrayList;

/**
 *
 * @author ruben
 */
public class Auto {
    private String strMarca;
    private String strModelo;
    //Array
    private Rueda[] ruedasArray;
    //Lista
    private ArrayList<Rueda> ruedasList;
    //Motor
    Motor m;
    
    

    public Auto(String strMarca, String strModelo) {
        this.strMarca = strMarca;
        this.strModelo = strModelo;
        //Cuando se crea el auto se crean las ruedas
        //Si desaparecen el auto las ruedas tambien
        this.ruedasArray = new Rueda[4];
        this.ruedasList = new ArrayList<Rueda>();
    }
    
    public Auto(String strMa, String strMo, Motor mo){
        this.strMarca = strMa;
        this.strModelo = strMo;
        this.m = mo;
    }
    
    public void cambiarRuedaList(Rueda obj_r, int pos){
        Rueda obj_ru = new Rueda(obj_r.GetCodigo(), obj_r.GetEmpresa());
        //this.ruedas[pos] = obj_ru;
        this.ruedasList.remove(pos);
        this.ruedasList.add(pos, obj_ru);
    }
    public void ObtieneRuedasList(){
        try
        {
            for(int i=0; i< ruedasList.size(); i++) {
                System.out.println("Indice" + ruedasList.size() + "-" + this.ruedasList.get(i));
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public void agregarRuedaList(Rueda obj_r){
        //this.ruedas[this.ruedas.length-1] = obj_r;
        this.ruedasList.add(obj_r);
    }
    
    //ARRAY
    public void ObtieneRuedasArray(){
        try
        {
            for(int i=0; i< ruedasArray.length; i++) {
                System.out.println("Indice" + ruedasArray.length + "-" + this.ruedasArray[i]);
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }   
    public void agregarRuedaArray(Rueda obj_r){
        this.ruedasArray[this.ruedasArray.length-1] = obj_r;
        
    }
    public void cambiarRuedaArray(Rueda obj_r, int pos){
        Rueda obj_ru = new Rueda(obj_r.GetCodigo(), obj_r.GetEmpresa());
        this.ruedasArray[pos] = obj_ru;
    }  
    
    public String getMarca(){
        return this.strMarca;
    }
    
    public String getModelo(){
        return this.strModelo;
    }
    
    public String toString()
    {
        return "[Marca: "+this.getMarca()+"] [Modelo: "+this.getModelo()+"]";
    }
    
}
