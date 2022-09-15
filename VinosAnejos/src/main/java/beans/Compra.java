package beans;

import java.sql.Date;

public class Compra {
    private int id;
    private int username;
    private Date fecha;
    private int años_añejado;
    private String nombre_vino;

    public Compra(int id, int username, Date fecha, int años_añejado, String nombre_vino) {
        this.id = id;
        this.username = username;
        this.fecha = fecha;
        this.años_añejado = años_añejado;
        this.nombre_vino = nombre_vino;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getAños_añejado() {
        return años_añejado;
    }

    public void setAños_añejado(int años_añejado) {
        this.años_añejado = años_añejado;
    }

    public String getNombre_vino() {
        return nombre_vino;
    }

    public void setNombre_vino(String nombre_vino) {
        this.nombre_vino = nombre_vino;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", username=" + username + ", fecha=" + fecha + ", a\u00f1os_a\u00f1ejado=" + años_añejado + ", nombre_vino=" + nombre_vino + '}';
    }
    
    
    
}
