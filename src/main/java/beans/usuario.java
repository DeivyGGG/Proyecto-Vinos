    package beans;

public class usuario {
    private String username;
    private String contraseña;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private int saldo;

    public usuario(String username, String contraseña, String nombre, String apellido, String email, String direccion, int saldo) {
        this.username = username;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.saldo = saldo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "usuario{" + "username=" + username + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", direccion=" + direccion + ", saldo=" + saldo + '}';
    }
    
    
}
