package beans;

import java.sql.Date;

public class compra {
    private int id;
    private String username;
    private Date fecha;
    private boolean grados_de_alcohol;
    private String pais_de_procedencia;

    public compra(int id, String username, Date fecha, boolean grados_de_alcohol, String pais_de_procedencia) {
        this.id = id;
        this.username = username;
        this.fecha = fecha;
        this.grados_de_alcohol = grados_de_alcohol;
        this.pais_de_procedencia = pais_de_procedencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isGrados_de_alcohol() {
        return grados_de_alcohol;
    }

    public void setGrados_de_alcohol(boolean grados_de_alcohol) {
        this.grados_de_alcohol = grados_de_alcohol;
    }

    public String getPais_de_procedencia() {
        return pais_de_procedencia;
    }

    public void setPais_de_procedencia(String pais_de_procedencia) {
        this.pais_de_procedencia = pais_de_procedencia;
    }

    @Override
    public String toString() {
        return "compra{" + "id=" + id + ", username=" + username + ", fecha=" + fecha + ", grados_de_alcohol=" + grados_de_alcohol + ", pais_de_procedencia=" + pais_de_procedencia + '}';
    }
    
    
}
