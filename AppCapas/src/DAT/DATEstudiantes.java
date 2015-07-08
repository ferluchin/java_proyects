package DAT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DATEstudiantes 
{
    conexionBD c = new conexionBD();
    public ResultSet Consultar() throws ClassNotFoundException, SQLException
    {
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM ESTUDIANTES";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    
    public ResultSet Consultar(int Id) throws ClassNotFoundException, SQLException
    {
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM ESTUDIANTES WHERE ID = " + Id ;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
}
