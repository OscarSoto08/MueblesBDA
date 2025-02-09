package modelo;

import java.util.List;

/**
 *
 * @author oscar
 */
public class Cliente extends Persona{
    private String direccion;
    private List<Factura> facturas;
    public Cliente() {
    }

    public Cliente(int id_pk, String nombre, String apellido, String correo, List<Telefono> telefonos, String direccion) {
        super(id_pk, nombre, apellido, correo, telefonos);
        this.direccion = direccion;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }    
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
    
    @Override
    public String toString() {
        return super.toString() + "direccion: " + direccion;
    }
}
