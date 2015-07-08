package Algoritmos;

import Clases.Conductor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class RegistrarCon {

    public void LeerObjetos(Conductor[] arrConductoress) {
 
        for (int i = 0; i < arrConductoress.length; i++) {
            
            JOptionPane.showMessageDialog(null, (
                    "Identificacion: " + arrConductoress[i].getIdentificacion()
                    + " Nombres: " + arrConductoress[i].getNombres()
                    + " Apellidos: " + arrConductoress[i].getApellidos()
                    + " Direccion: " + arrConductoress[i].getDireccion()
                    + " Email: " + arrConductoress[i].getCorreo()
                    + " Ead: " + arrConductoress[i].getEdad()
                  //  + " Transporte: " + arrCondictores[i].getTransporte()
            ));
                   
                               

        }
        
    }

    public void GuardarArchivo(Conductor[] arrConductores) throws FileNotFoundException, IOException {
        File f = new File("C:/Users/Administrador/Documents/Conductores_Java.txt");
        FileWriter fw = new FileWriter(f, true);
        FileReader fr = new FileReader(f);
        
        BufferedWriter bw = new BufferedWriter(fw);
        BufferedReader br = new BufferedReader(fr);

        
        for (int i = 0; i < arrConductores.length; i++) {

            bw.write("/n" + arrConductores[i].getNombres() + " ");
            bw.write(arrConductores[i].getApellidos() + " ");
            bw.write(arrConductores[i].getIdentificacion() + " ");
            bw.write(arrConductores[i].getCorreo()+ " ");
            bw.write(arrConductores[i].getDireccion() + " ");
            bw.write(arrConductores[i].getEdad()+ " ");
        }
        bw.close();
        fw.close();

    }
    
    public void leerArchivo () throws FileNotFoundException, IOException{
    
        File f = new File("C:/Users/Administrador/Documents/Conductores_Java.txt");
        
        FileReader fr = new FileReader(f);
        
        
        BufferedReader br = new BufferedReader(fr);
        
        
        
       // return br;
    }
}



