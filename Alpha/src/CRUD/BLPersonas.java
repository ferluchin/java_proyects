package CRUD;
import Clases.Persona;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class BLPersonas 
{
    DATPersonas ManejadorPersonas = new DATPersonas();
    //Para el Arreglo de Objetos
    public static Persona [] ArrPersonas = new Persona [2];
    
    public Persona[] Consultar() throws ClassNotFoundException, SQLException {
        int intIncremento =0;
        ResultSet rs;
        rs = ManejadorPersonas.Consultar();
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
            Persona e = new Persona();
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
            ArrPersonas[intIncremento] =  e;
            intIncremento = intIncremento +1;
        }
        return ArrPersonas;
    }
    
    public ResultSet Consultar(int Id) throws ClassNotFoundException, SQLException 
    {
        ResultSet rs = ManejadorPersonas.Consultar(Id);
        return rs;
    }
}
