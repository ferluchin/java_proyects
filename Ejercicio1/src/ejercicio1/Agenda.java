package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    ArrayList <Contacto> age=new ArrayList<Contacto>();
    Scanner leer=new Scanner(System.in);
    
    public void addcontacto(String n,String tel){
        Contacto a=new Contacto(n,tel);
        age.add(a);
        
    } public void delcontacto(String n){        
        int tam=age.size();
        for(int i=0;i<tam;i++){
            String bu=age.get(i).getNombre();
            if(n.equals(bu)){
                age.remove(i);
                System.out.println("Eliminado el "+n);
                tam=age.size();
            }
        }
    } public String listcontacto(){
        int tam=age.size();
        String mens="";
        for(int i=0;i<tam;i++){            
            Contacto c=new Contacto(age.get(i));
            mens+="Nombre: "+c.getNombre()+" Telefono: "+c.getN_tele()+"\n";
        } 
        return mens;
    } public String findcontacto(String n){        
        int tam=age.size();
        String resultado="";
        for(int i=0;i<tam;i++){
            String bu=age.get(i).getNombre();
            String parcial= bu.substring(0, n.length());       
            if(n.equals(parcial)){
                resultado+= " "+bu+" "+age.get(i).getN_tele()+"\n";
            }
        }
        if(resultado.equals(""))
        {
            resultado="No se encontro";
        }
        return resultado;        
    }
    
}