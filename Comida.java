
package beans;


public class Comida {
    private int id;
    private String nombre_comida;
    private String tipo_mascota;
    private String edad_mascota;

    public Comida(int id, String nombre_comida, String tipo_mascota, String edad_mascota) {
        this.id = id;
        this.nombre_comida = nombre_comida;
        this.tipo_mascota = tipo_mascota;
        this.edad_mascota = edad_mascota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_comida() {
        return nombre_comida;
    }

    public void setNombre_comida(String nombre_comida) {
        this.nombre_comida = nombre_comida;
    }

    public String getTipo_mascota() {
        return tipo_mascota;
    }

    public void setTipo_mascota(String tipo_mascota) {
        this.tipo_mascota = tipo_mascota;
    }

    public String getEdad_mascota() {
        return edad_mascota;
    }

    public void setEdad_mascota(String edad_mascota) {
        this.edad_mascota = edad_mascota;
    }

    @Override
    public String toString() {
        return "Comida{" + "id=" + id + ", nombre_comida=" + nombre_comida + ", tipo_mascota=" + tipo_mascota + ", edad_mascota=" + edad_mascota + '}';
    }

   
    
    
}
