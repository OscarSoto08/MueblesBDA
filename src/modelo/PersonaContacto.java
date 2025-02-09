package modelo;

import java.util.List;

/**
 *
 * @author oscar
 */
public class PersonaContacto extends Persona{

    public PersonaContacto() {
    }

    public PersonaContacto(int id_pk, String nombre, String apellido, String correo, List<Telefono> telefonos) {
        super(id_pk, nombre, apellido, correo, telefonos);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
