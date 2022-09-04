package beans;

public class vino {
    private int id;
    private String nombre_del_vino;
    private boolean grados_de_alcohol;
    private boolean cantidad;
    private boolean años_añejado;
    private String pais_de_procedencia;

    public vino(int id, String nombre_del_vino, boolean grados_de_alcohol, boolean cantidad, boolean años_añejado, String pais_de_procedencia) {
        this.id = id;
        this.nombre_del_vino = nombre_del_vino;
        this.grados_de_alcohol = grados_de_alcohol;
        this.cantidad = cantidad;
        this.años_añejado = años_añejado;
        this.pais_de_procedencia = pais_de_procedencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_del_vino() {
        return nombre_del_vino;
    }

    public void setNombre_del_vino(String nombre_del_vino) {
        this.nombre_del_vino = nombre_del_vino;
    }

    public boolean isGrados_de_alcohol() {
        return grados_de_alcohol;
    }

    public void setGrados_de_alcohol(boolean grados_de_alcohol) {
        this.grados_de_alcohol = grados_de_alcohol;
    }

    public boolean isCantidad() {
        return cantidad;
    }

    public void setCantidad(boolean cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isAños_añejado() {
        return años_añejado;
    }

    public void setAños_añejado(boolean años_añejado) {
        this.años_añejado = años_añejado;
    }

    public String getPais_de_procedencia() {
        return pais_de_procedencia;
    }

    public void setPais_de_procedencia(String pais_de_procedencia) {
        this.pais_de_procedencia = pais_de_procedencia;
    }

    @Override
    public String toString() {
        return "Vino{" + "id=" + id + ", nombre_del_vino=" + nombre_del_vino + ", grados_de_alcohol=" + grados_de_alcohol + ", cantidad=" + cantidad + ", a\u00f1os_a\u00f1ejado=" + años_añejado + ", pais_de_procedencia=" + pais_de_procedencia + '}';
    }
    
    
}
