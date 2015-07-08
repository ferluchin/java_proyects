package asoycomp;
public class Motor {
    private String strMarca;
    private double dblPotencia;

    public Motor(String strMarca, double dblPotencia) {
        this.strMarca = strMarca;
        this.dblPotencia = dblPotencia;
    }
    
    public String getMarca(){
        return this.strMarca;
    }
    
    public double getPotencia(){
        return this.dblPotencia;
    }
    
    public String toString(){
        return "[Marca: "+this.getMarca()+"] [Potencia: "+this.getPotencia()+"]";
    }
    
}
