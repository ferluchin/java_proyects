package Clases;
public class Estudiante {
    String strNombre;
    Materia [] arrMateria;
    
    public Estudiante(String strNombre, Materia[] m) {
        this.strNombre = strNombre;
        arrMateria = m;
    }
    
    public String getEstudiante(){
        return this.strNombre;
    }
    
    public String RetornaEstMaterias(){
        String cadena = "Estudiante " + getEstudiante();
        String materias ="";
        try
        {
            for (int i=0; i<arrMateria.length;i++){
                if (arrMateria[i]!=null)
                    materias += arrMateria[i].getInfo();
            }
        }
        catch(Exception ex)
        {
            String msn = ex.getMessage();}
        return cadena + materias;
    }
}
