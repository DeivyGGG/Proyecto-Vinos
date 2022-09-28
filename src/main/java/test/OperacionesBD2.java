package test;

import beans.Vinos;
import connection.DBConnectionVino;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD2 {

        public static void main(String[] args) {
            //listarVinos();
            actualizarVinos(1, "Los Vascos / Rosé");

        }

        public static void actualizarVinos(int id, String nombre_vino) {

            DBConnectionVino con = new DBConnectionVino();
            String sql = "UPDATE vinos SET nombre_vino = '" + nombre_vino + "'where id =" + id;

            try {
                Statement st = con.getConnection().createStatement();
                st.executeUpdate(sql);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            } finally {
                con.desconectar();
            }
        }

        public static void listarVinos() {

            DBConnectionVino con = new DBConnectionVino();
            String sql = "SELECT * FROM vinos";

            try {
                Statement st = con.getConnection().createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nombre_vino = rs.getString("nombre_vino");
                    boolean porcentaje_licor = rs.getBoolean("porcentaje_licor");
                    int cantidad = rs.getInt("cantidad");
                    int años_anejado = rs.getInt("años_anejado");
                    

                    Vinos vinos = new Vinos(id, nombre_vino, porcentaje_licor, cantidad, años_anejado);
                    System.out.println(vinos.toString());
                }
                st.executeQuery(sql);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            } finally {
                con.desconectar();
            }
        }

    }
