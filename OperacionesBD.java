
package test;

import beans.Comida;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {
    public static void main(String[] args) {
       //  listarComida();
        actualizarComida(1, "nutrican");
    }
    
    public static void actualizarComida(int id, String nombre_comida) {
        DBConnection con = new DBConnection();
        String sql = "UPDATE comida SET nombre_comida = '"+ nombre_comida+ "'WHERE id = " + id;
        
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        } 
        
        finally {
            con.desconectar();
        }
    }
    
    public static void listarComida() {
        DBConnection con= new DBConnection();
        String sql = "SELECT * FROM COMIDA";
        
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre_comida = rs.getString("nombre_comida");
                String tipo_mascota = rs.getString("tipo_mascota");
                String edad_mascota = rs.getString("edad_mascota");
                Comida comida = new Comida(id, nombre_comida, tipo_mascota, edad_mascota); 
                System.out.println(comida.toString());
            }
         st.executeQuery(sql);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        } 
        
        finally {
            con.desconectar();
        }

    }
}
