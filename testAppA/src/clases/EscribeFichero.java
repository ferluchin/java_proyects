/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.io.*;

/**
 *
 * @author Luis
 */
public class EscribeFichero {
      public static void main(String[] args)
    {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("C:\\Users\\Luis\\Documents\\NetBeansProjects\\testAppA\\src\\Pruebas.txt",true);
            pw = new PrintWriter(fichero);
 
            for (int i = 0; i < 10; i++)
                pw.println("Linea " + i);
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
}
