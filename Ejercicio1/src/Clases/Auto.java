package Clases;

import java.util.ArrayList;

public class Auto {
    //AStributo de Auto
    String strModelo;
    //Objeto de Clase Motor
    Motor m;
    //Espacio de Memoria para las 4 llantas
    //de la Clase Llantas
    Llantas [] l;
    //Espacio de Memoria para llantas
    ArrayList<Llantas> l1;
    
    //forma1 
    public Auto(String strMo, int intPotencia) {
        this.strModelo = strMo;
        this.m = new Motor(intPotencia);
        this.l = new Llantas[4];
    }
    //forma2
    public Auto(String strMo, Motor m1){
        this.strModelo = strMo;
        this.m = new Motor(m1.intPotencia);
        this.l = new Llantas[4];
        //this.l1 = new ArrayList<Llantas>();
    }
    public void AgregaLlantas(Llantas lla){
        try
        {
            for(int i=0; i<l.length; i++){
                l[i] = lla;
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public void AgregarLlantasPos(Llantas lla, int pos){
        l[pos] = lla;
    }
    
    public void AgregarLlantasArr(Llantas []lla){
        try
        {
            for(int i=0; i<l.length; i++){
                l[i] = lla[i];
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }        
    }
    //Modelo del Auto
    public String getModelo(){
        return this.strModelo;
    }
    //Motor del Auto
    public int getMotorAuto(){
        return m.getMotor();
    }
    
    public void getLlantas(){
        for(int i=0; i<l.length; i++){
            System.out.println(l[i].strMarca);
        }
    }
}