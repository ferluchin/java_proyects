package DAT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DATConexion 
{
    //Conectarse a la BDD
    public static Connection con;
    
    public Connection getConnection () throws ClassNotFoundException, SQLException
    {
        String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
        String db = "C:\\Users\\Luis\\Documents\\basedatosHola.accdb";
        String url = "jdbc:odbc:MS Access Database;DBQ=" + db;
        Class.forName(driver);
        return DriverManager.getConnection(url,"","");
    }
    
    public Connection AbrirConexion() throws ClassNotFoundException, SQLException
    {
        con = getConnection();
        return con;
    }
    
    public void CerrarConexion() throws SQLException
    {
       con.close();
    }
}
