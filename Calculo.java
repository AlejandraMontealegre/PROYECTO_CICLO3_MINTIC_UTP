
package beans;

import java.sql.Date;

public class Calculo {
    private int id;
    private String username;
    private Date fecha;

    public Calculo(int id, String username, Date fecha) {
        this.id = id;
        this.username = username;
        this.fecha = fecha;
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

    @Override
    public String toString() {
        return "Calculo{" + "id=" + id + ", username=" + username + ", fecha=" + fecha + '}';
    }
    
    
}
