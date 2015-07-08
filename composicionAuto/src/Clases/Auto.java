/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class Auto {
    
    private String strMarca;
    private String strModelo;
    //Array
    private Rueda[] ruedasArray;
    //Lista
    private ArrayList<Rueda> ruedasList;
   
  
    
    CinturonSeguridad cs = new CinturonSeguridad("3 anclajes", 4, "2015");
    Parabrisas para = new Parabrisas(2, "Blindados");
    Volante vol = new Volante(1, "Redondo");

    public Auto(String strMarca, String strModelo) {
        this.strMarca = strMarca;
        this.strModelo = strModelo;
        //Cuando se crea el auto se crean las ruedas
        //Si desaparecen el auto las ruedas tambien
        this.ruedasArray = new Rueda[4];
        this.ruedasList = new ArrayList<Rueda>();
        
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
