package modelo;

/**
 *
 * @author oscar
 */
public class PersonaContacto extends Persona{

    public PersonaContacto() {
        super();
    }

    public PersonaContacto(int id_pk, String nombre, String apellido, String correo, int[] telefono) {
        super(id_pk, nombre, apellido, correo, telefono);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
