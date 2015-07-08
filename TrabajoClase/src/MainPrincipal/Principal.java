/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPrincipal;
import Clases.Cliente;
import java.util.Scanner;
/**
 *
 * @author Luis
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //clase
          Cliente c = new Cliente();
          
          // Arreglo
          Cliente cl[] = new Cliente[3];
          
          for (int i = 0; i < cl.length; i++) {
            Cliente cl1 = cl[i];
            
        }
          
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese Identificacion");
        String StrI = sc.nextLine();
        //asignacion de valor a  metodo de clase
        c.setStrIdentificacion(strI);
        System.out.println("Ingrese Nombres");
        String StrN = sc.nextLine();
        System.out.println("Ingrese Apellidos");
        String StrA = sc.nextLine();
        System.out.println("Ingrese FechaNace");
        String StrF = sc.nextLine();
        System.out.println("Ingrese Email");
        String StrEm = sc.nextLine();
        System.out.println("Ingrese Direccion");
        String StrDir = sc.nextLine();

        
        
        
        
        
        
        C.setStrIdentificacion("1101")
        c.setStrNombres("Daniel");
        c.setStrApellidos("Guaman");
        c.setStrFechaNace("18/03/1982");
        c.setStrEmail("daguaman@utpl.edu.ec");
        c.setStrDireccion("Loja");

        
        // TODO code application logic here
    }
    
}
