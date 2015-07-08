package ejercicio1;

public class Contacto {
    String nombre;
    String n_tele;

    public Contacto() {
    }

    public Contacto(String nombre, String n_tele) {
        this.nombre = nombre;
        this.n_tele = n_tele;
    }

    public String getN_tele() {
        return n_tele;
    }

    public Contacto(Contacto a) {
        this.nombre = a.getNombre();
        this.n_tele = a.getN_tele();
    }
    

    public String getNombre() {        
        return nombre;
    } 
    
}