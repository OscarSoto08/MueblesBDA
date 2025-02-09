package modelo;

/**
 *
 * @author oscar
 */
public class Cliente extends Persona{
    private String direccion;

    public Cliente() {
    }

    public Cliente(int id_pk, String nombre, String apellido, String correo, int[] telefono, String direccion) {
        super(id_pk, nombre, apellido, correo, telefono);
        this.direccion = direccion;
    }

    public Cliente(String nombre, String apellido, String correo, int[] telefono, String direccion) {
        super(nombre, apellido, correo, telefono);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    
    @Override
    public String toString() {
        return super.toString() + "direccion: " + direccion;
    }
    
    
}
