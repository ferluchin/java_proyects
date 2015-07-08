package ejercicio1;

import Clases.Auto;
import Clases.Llantas;

public class Ejercicio1 {

    public static void main(String[] args) {
            Llantas[] arrll = new Llantas[4];
            Auto a1 = new Auto("Hiunday", 1000);
            Llantas l1 = new Llantas("Llanta1");
            a1.AgregarLlantasPos(l1,0);
            Llantas l2 = new Llantas("Llanta2");
            a1.AgregarLlantasPos(l2,1);
            Llantas l3 = new Llantas("Llanta3");
            a1.AgregarLlantasPos(l3,2);
            Llantas l4 = new Llantas("Llanta4");
            a1.AgregarLlantasPos(l4,3);
            for (int i =0; i<arrll.length; i++){
                arrll[i] = new Llantas("LLantas" + i);
            }
            a1.AgregarLlantasArr(arrll);
            System.out.println(
                    "Modelo" + a1.getModelo()+
                    "Motor"  + a1.getMotorAuto());
            System.out.println("Llantas");
            a1.getLlantas();
    }
}
