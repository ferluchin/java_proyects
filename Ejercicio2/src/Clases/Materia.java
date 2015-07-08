package Clases;
public class Materia {
    String strNombre;
    String strCodigo;

    public Materia(String strNombre, String strCodigo) {
        this.strNombre = strNombre;
        this.strCodigo = strCodigo;
    }
    
    public String getInfo(){
        return this.strNombre + "-" + this.strCodigo;
    }
}
