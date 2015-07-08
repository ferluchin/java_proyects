package BL;
import Clases.Componentes;
import Clases.Estudiante;
import DAT.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class BLEstudiantes 
{
    //Permite acceder a los métodos de la capa DAT de la Clase Estudiante
    DATEstudiantes ManejadorEstudiantesDAT = new DATEstudiantes();
    //Permite acceder a los métodos de la capa DAT de la Clase Conexion
    DATConexion ManejadorConexionDAT = new DATConexion();
    //Para el Arreglo de Objetos
    public static Estudiante  ArrEstudiante [] = new Estudiante [10];
    //Para recuperar los datos en un ArrayList
    public static ArrayList<Estudiante> lstEstudiante;
    //Crear un ArrayList de Tipo Generico para recuperar cuando hay relaciones
    public static ArrayList<Object>  ListEstudiante = new ArrayList<>();
    
    //metodo de consulta que recupera datos desde la base de datos.
    //Llama al metodo consultar que se encuentra en la capa de Datos DAT
    //Los recupera en el resulset
    //Luego los descompone
    public ArrayList<Estudiante> Consultar() throws ClassNotFoundException, SQLException {
        int intIncremento =0;
        ResultSet rs;
        String strNombres="";
        String strApellidos="";
        int intIdentificacion=0;
        lstEstudiante = new ArrayList<>();
        rs = ManejadorEstudiantesDAT.Consultar();
        ResultSetMetaData rm = rs.getMetaData();
        //Recupera los campos de la tabla
        int columnCount = rm.getColumnCount();
        ArrayList<String> columns = new ArrayList<>();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = rm.getColumnName(i);
            columns.add(columnName);
        }
        //Envia los datos a la Clase
        while (rs.next()) 
        {
            for (String columnName : columns) 
            {
                String value = rs.getString(columnName);
                if (columnName.equals("NOMBRES"))
                    strNombres = value;
                if (columnName.equals("APELLIDOS"))
                    strApellidos = value;
                if (columnName.equals("IDENTIFICACION"))
                    intIdentificacion = (Integer.parseInt(value));
            }
            try
            {
                Estudiante e = new Estudiante(intIdentificacion, strNombres, strApellidos);
                
                lstEstudiante.add(e);
            }
            catch(Exception ex)
            {
                String msn = ex.getMessage();
            }
        }
        //Metodo para cerrar la conexion de la BDD, siempre cerramos luego que ya lo tenemos en un objeto para manipularlos
        CerrarConexionBDD();
        return lstEstudiante;
    }
    
    public ResultSet Consultar(int Id) throws ClassNotFoundException, SQLException 
    {
        ResultSet rs = ManejadorEstudiantesDAT.Consultar(Id);
        //Metodo para cerrar la conexion de la BDD, siempre cerramos luego que ya lo tenemos en un objeto para manipularlos
        CerrarConexionBDD();
        return rs;
    }
    //Aquí debe implementar los métodos de INSERCION, ACTUALIZACION Y BORRADO
    public int Insertar(ArrayList<Estudiante> e) throws SQLException, ClassNotFoundException{
        int intRetorno =0;
        //Descompone lo que viene en el ArrayList de Estudiantes par apoderlos procesar uno a uno.
        for (int i = 0; i < e.size(); i++) {
            intRetorno = ManejadorEstudiantesDAT.Insertar(e.get(i).GetIdentificacion(),e.get(i).GetNombres(), e.get(i).GetApellidos());
        }
        return intRetorno;
    }    
    
    public int Eliminar(String strClave) throws ClassNotFoundException, SQLException {
        return ManejadorEstudiantesDAT.Eliminar(strClave);
    }    
    
    public ArrayList<Object> ConsultarLista() throws ClassNotFoundException, SQLException {
        int intIncremento =0;
        
        ResultSet rs;
         
        String nombres = null;
        String apellidos = null;
        int identificacion = 0;
        String codigo = null;
        String nombreC = null;
        rs = ManejadorEstudiantesDAT.ConsultarEstMaterias();
        ResultSetMetaData rm = rs.getMetaData();
        //Recupera los campos de la tabla
        int columnCount = rm.getColumnCount();
        ArrayList<String> columns = new ArrayList<>();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = rm.getColumnName(i);
            columns.add(columnName);
        }
        //Envia los datos a la Clase
        while (rs.next()) 
        {
            for (String columnName : columns) 
            {
                String value = rs.getString(columnName);
                if (columnName.equals("NOMBRES"))
                    nombres = value;
                if (columnName.equals("APELLIDOS"))
                    apellidos = value;
                if (columnName.equals("IDENTIFICACION"))    
                    identificacion = Integer.parseInt(value);
                if (columnName.equals("Codigo"))
                    codigo = value;
                if (columnName.equals("Nombre"))    
                    nombreC = value;
            }
            ArrayList<Componentes> listac = new ArrayList<>();
            Componentes c = new Componentes(codigo, nombreC);
            listac.add(c);
            Estudiante e = new Estudiante(identificacion, nombres, apellidos,listac);
            ListEstudiante.add(e);
        }
        CerrarConexionBDD();
        return ListEstudiante;
    } 
    
    public void CerrarConexionBDD() throws SQLException{
        ManejadorConexionDAT.CerrarConexion();
    }
}
