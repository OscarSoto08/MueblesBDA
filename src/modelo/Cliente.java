package modelo;

/**
 *
 * @author oscar
 */
public class Cliente {
    private int id_pk;
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;

    public Cliente() {
        this.id_pk = 0;
        this.nombre = this.apellido = this.correo = this.direccion = "";
    }

    public Cliente(int id_pk, String nombre, String apellido, String correo, String direccion) {
        this.id_pk = id_pk;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
    }

    public int getId_pk() {
        return id_pk;
    }

    public void setId_pk(int id_pk) {
        this.id_pk = id_pk;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_pk=" + id_pk + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", direccion=" + direccion + '}';
    }
}
