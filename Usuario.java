
package beans;

public class Usuario {
    private String username;
    private String contrasena;
    private String nombre_usuario;
    private String apellido;
    private int telefono;

    public Usuario(String username, String contrasena, String nombre_usuario, String apellido, int telefono) {
        this.username = username;
        this.contrasena = contrasena;
        this.nombre_usuario = nombre_usuario;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" + "username=" + username + ", contrasena=" + contrasena + ", nombre_usuario=" + nombre_usuario + ", apellido=" + apellido + ", telefono=" + telefono + '}';
    }
    
    
}
