package DAT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DATEstudiantes 
{
    DATConexion c = new DATConexion();
    //Método que contiene la recuperacion de los datos desde la BDD
    public ResultSet Consultar() throws ClassNotFoundException, SQLException
    {
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM ESTUDIANTE";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    
    //Metodo que contiene la recuperacion de los datos de la BDD cuando hay mas de una relacion
    public ResultSet ConsultarEstMaterias() throws ClassNotFoundException, SQLException
    {
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT NOMBRES, APELLIDOS, IDENTIFICACION, Codigo, Nombre FROM ESTUDIANTE E LEFT JOIN COMPONENTES C\n" +
        "ON  E.ID = C.ID_ESTUDIANTE;";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }    
    
    //Metodo que contiene la recuperacion de los datos de la BDD cuando le enviamos un parámetro de tipo int
    public ResultSet Consultar(int Id) throws ClassNotFoundException, SQLException
    {
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM ESTUDIANTE WHERE ID = " + Id ;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    
    //Metodo que permite realizar la inserción de registros a la BDD
    
    public int Insertar(int intIdentificacion, String strNombres, String strApellidos) throws SQLException, ClassNotFoundException{
        int intRetorno=0;
        //Utilizando Statement
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "INSERT INTO ESTUDIANTE (Nombres, Apellidos, Identificacion)  VALUES ( " 
                +"'" +strNombres +"'"  + "," 
                +"'" +strApellidos +"'" + "," 
                + intIdentificacion + ")" ;
        //intRetorno = st.executeUpdate(Sentencia);

        /* Utilizando JDBC PREPARE STATEMENT
        String Sentencia1;
        Sentencia1 = "INSERT INTO ESTUDIANTE (Nombres, Apellidos, Identificacion) VALUES (?,?,?)";
        //"UPDATE DBUSER SET USERNAME = ? WHERE USER_ID = ?";
        PreparedStatement ps = c.AbrirConexion().prepareStatement(Sentencia1);
        ps.setString(1, strNombres);
        ps.setString(2, strApellidos);
        ps.setInt(1, intIdentificacion);
        ps.executeUpdate();*/
        c.CerrarConexion();
        return intRetorno;
    }
    
    //Metodo que permite eliminar un registro, dado un parámetro de tipo STRING y utilizando Statement
    public int Eliminar(String strClave) throws ClassNotFoundException, SQLException{
        int intRetorno =0;
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "DELETE FROM ESTUDIANTE WHERE Nombres = " 
                +"'" +strClave +"'";
        intRetorno = st.executeUpdate(Sentencia); 
        //Podemos cerrar porque ya se ha ejecutado en la BDD y obtenemos un valor entero
        //que indica si se ha eliminado o no el registro
        c.CerrarConexion();
        return intRetorno;
    }
}
