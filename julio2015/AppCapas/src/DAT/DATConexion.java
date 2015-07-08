package DAT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DATConexion 
{
    //Conectarse a la BDD
    public static Connection con;
    
    //Metodo que permite conectarse a la BDD, dependiendo del driver se lo utiliza
    public Connection getConnection () throws ClassNotFoundException, SQLException
    {
        String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
        String db = "C:\\Users\\daguaman\\BASEDATOS.mdb";
        String url = "jdbc:odbc:MS Access Database;DBQ=" + db;
        Class.forName(driver);
        return DriverManager.getConnection(url,"","");
    }
    
    //Metodo que se lo llama cada vez que se requiera realizar una conexion
    public Connection AbrirConexion() throws ClassNotFoundException, SQLException
    {
        con = getConnection();
        return con;
    }
    
    //Metodo para cerrar las conexiones a la BDD
    public void CerrarConexion() throws SQLException
    {
       con.close();
    }
}
