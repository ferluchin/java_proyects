package ejercicio2;

import Clases.Estudiante;
import Clases.Materia;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Materia [] arrMateria;
        Estudiante est;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Nombre del Estudiante");
        String strEstudiante = sc.next();
        System.out.println("¿Cuantas materias desea Ingresar?");
        int intRes = sc.nextInt();
        arrMateria = new Materia[intRes];
        for(int i = 0; i<arrMateria.length;i++){
            System.out.println("Ingrese el Nombre de la Materia");
            String strNM = sc.next();
            System.out.println("Ingrese el Codigo de la Materia");
            String strCM = sc.next();
            arrMateria[i] = new Materia(strNM, strCM);
        }
        est = new Estudiante(strEstudiante, arrMateria);
        System.out.println(est.RetornaEstMaterias());
    }
    
}
