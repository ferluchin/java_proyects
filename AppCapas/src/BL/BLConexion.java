package BL;

//import DAT.DATConexion;
import DAT.conexionBD;
import java.sql.SQLException;

public class BLConexion {

    //DATConexion ManejadorConexion = new DATConexion();

    conexionBD ManejadorConexion = new conexionBD();

    public void CerrarConexion() throws SQLException {
       
        ManejadorConexion.CerrarConexion();

    }
}
