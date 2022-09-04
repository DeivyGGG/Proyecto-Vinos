package test;

import beans.vino;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {

    public static void main(String[] args) {
        listarVino();
    }

    public static void actualizarVino(int id, int cantidad) {
        DBConnection con = new DBConnection();
        String sql = "UPDATE pelicula SET cantidad = '" + cantidad + "'WHERE id = " + id;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();

        }
    }

    public static void listarVino() {
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM vino";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre_vino = rs.getString("nombre_vino");
                boolean grados_de_alcohol = rs.getBoolean("grados_de_alcohol");
                boolean cantidad = rs.getBoolean("cantidad");
                boolean años_añejado = rs.getBoolean("años_añejado");
                String pais_de_procedencia = rs.getString("pais_de_procedencia");
                vino vino = new vino(id, nombre_vino, grados_de_alcohol, cantidad, años_añejado, pais_de_procedencia);
                System.out.println(vino.toString());
            }

            st.executeQuery(sql);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();

        }
    }
}
