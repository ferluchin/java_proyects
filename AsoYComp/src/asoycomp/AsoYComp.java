package asoycomp;

public class AsoYComp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Composición
        Auto obj_a = new Auto("Toyota", "Ford");
        Rueda obj_b = new Rueda("Michellin", "3324B");
        System.out.println("Agrega Rueda Lista");
        obj_a.agregarRuedaList(obj_b);
        System.out.println("Agrega Rueda Array");
        obj_a.agregarRuedaArray(obj_b);
        System.out.println("Rueda1 Lista");
        obj_a.ObtieneRuedasList();
        System.out.println("Rueda1 Array");
        obj_a.ObtieneRuedasArray();
        Rueda obj_b1 = new Rueda("Kempo", "w22");
        obj_a.cambiarRuedaList(obj_b1, 0);
        obj_a.cambiarRuedaArray(obj_b1, 0);
        System.out.println("Rueda2 Lista");
        obj_a.ObtieneRuedasList();
        System.out.println("Rueda2 Array");
        obj_a.ObtieneRuedasArray();
        //Agregacion
        Motor m = new Motor("Motor H1", 1000);
        //Auto tiene un motor
        Auto obj_a1 = new Auto("Hiunday", "Tucson", m);
        //Recupera el motor del auto
        System.out.println("Datos del Auto1" + obj_a1.toString() + "Datos del Motor" + m.toString());
        System.out.println("Datos del Auto2" + obj_a1.toString() + "Datos del Motor" + obj_a1.m.toString());
        
    }
    
}
