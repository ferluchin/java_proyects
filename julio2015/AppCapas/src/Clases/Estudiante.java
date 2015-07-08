package Clases;

import java.util.ArrayList;

public class Estudiante 
{
    private int Identificacion;
    private String Nombres;
    private String Apellidos;
    
    ArrayList<Componentes> ListaC;
    
    public Estudiante(int Id, String strNom, String strApe)
    {
        Identificacion = Id;
        Nombres = strNom;
        Apellidos = strApe;
    }
    //Envio la lista de componentes
    public Estudiante(int Id, String strNom, String strApe, ArrayList<Componentes> lc)
    {
        Identificacion = Id;
        Nombres = strNom;
        Apellidos = strApe;
        this.ListaC = lc;
    }
    
    
    public Estudiante()
    {
    }    
    
    public void SetIdentificacion(int Ident)
    {
        Identificacion = Ident;
    }
    public void SetNombres(String strNombre)
    {
        Nombres = strNombre;
    }
    public void SetApellidos(String strApellido)
    {
        Apellidos = strApellido;
    }
    public int GetIdentificacion()
    {
        return Identificacion;
    }
    public String GetNombres()
    {
        return Nombres;
    }
    public String GetApellidos()
    {
        return Apellidos;
    }
    public String toString(){
        return this.Identificacion + "-" + this.Nombres +"-"+ this.Apellidos + Materias();
    }
    
    public String Materias()
    {
        String strComponentes = "";
        for (Componentes componentes : ListaC) {
                strComponentes = strComponentes + componentes.getStrNombre() + "-" + componentes.getStrCodigo();
            }
        return strComponentes;
    }
    
}
