package beans;

public class Vinos {
    private int id;
    private String nombre_vino;
    private boolean porcentaje_licor;
    private int cantidad;
    private int años_anejado;

    public Vinos(int id, String nombre_vino, boolean porcentaje_licor, int cantidad, int años_anejado) {
        this.id = id;
        this.nombre_vino = nombre_vino;
        this.porcentaje_licor = porcentaje_licor;
        this.cantidad = cantidad;
        this.años_anejado = años_anejado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_vino() {
        return nombre_vino;
    }

    public void setNombre_vino(String nombre_vino) {
        this.nombre_vino = nombre_vino;
    }

    public boolean isPorcentaje_licor() {
        return porcentaje_licor;
    }

    public void setPorcentaje_licor(boolean porcentaje_licor) {
        this.porcentaje_licor = porcentaje_licor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getAños_anejado() {
        return años_anejado;
    }

    public void setAños_anejado(int años_anejado) {
        this.años_anejado = años_anejado;
    }

    @Override
    public String toString() {
        return "Vinos{" + "id=" + id + ", nombre_vino=" + nombre_vino + ", porcentaje_licor=" + porcentaje_licor + ", cantidad=" + cantidad + ", a\u00f1os_anejado=" + años_anejado + '}';
    }

    

    
}