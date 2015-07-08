package Clases;
public class Estudiante 
{
    private int Identificacion;
    private String Nombres;
    private String Apellidos;
    private int Edad;
    
    public Estudiante(int Id, String strNom, String strApe, int intEdad)
    {
        Identificacion = Id;
        Nombres = strNom;
        Apellidos = strApe;
        Edad = intEdad;
    }
    
    public Estudiante()
    {
    }    

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
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
    
}
