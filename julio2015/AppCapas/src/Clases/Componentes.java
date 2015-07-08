
package Clases;

public class Componentes {
    String strCodigo;
    String strNombre;

    public Componentes(String strCodigo, String strNombre) {
        this.strCodigo = strCodigo;
        this.strNombre = strNombre;
    }
    
    public Componentes(){
    
    }

    public String getStrCodigo() {
        return strCodigo;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrCodigo(String strCodigo) {
        this.strCodigo = strCodigo;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }
    
    public String toString(){
        return this.strNombre + "-" +this.strCodigo;
    }
    
    
    
}
