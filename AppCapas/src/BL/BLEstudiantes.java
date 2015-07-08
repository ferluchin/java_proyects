package BL;
import Clases.Estudiante;
import DAT.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class BLEstudiantes 
{
    DATEstudiantes ManejadorEstudiantes = new DATEstudiantes();
    //Para el Arreglo de Objetos
    public static Estudiante  ArrEstudiante [] = new Estudiante [2];
    //Clase Estudiante
    //Estudiante e = new Estudiante();
    public Estudiante[] Consultar() throws ClassNotFoundException, SQLException {
        int intIncremento =0;
        ResultSet rs;
        rs = ManejadorEstudiantes.Consultar();
        ResultSetMetaData rm = rs.getMetaData();
        //Recupera los campos de la tabla
        int columnCount = rm.getColumnCount();
        ArrayList<String> columns = new ArrayList<>();
        for (int i = 1; i < columnCount; i++) {
            String columnName = rm.getColumnName(i);
            columns.add(columnName);
        }
        //Envia los datos a la Clase
        while (rs.next()) 
        {
            Estudiante e = new Estudiante();
            for (String columnName : columns) 
            {
                String value = rs.getString(columnName);
                if (columnName.equals("nombres"))
                    e.SetNombres(value);
                if (columnName.equals("apellidos"))
                    e.SetApellidos(value);
                if (columnName.equals("identificacion"))
                    e.SetIdentificacion(Integer.parseInt(value));
                if (columnName.equals("edad"))
                    e.setEdad(Integer.parseInt(value));
            }
            ArrEstudiante[intIncremento] =  e;
            intIncremento = intIncremento +1;
        }
        return ArrEstudiante;
    }
    
    public ResultSet Consultar(int Id) throws ClassNotFoundException, SQLException 
    {
        ResultSet rs = ManejadorEstudiantes.Consultar(Id);
        return rs;
    }
}
