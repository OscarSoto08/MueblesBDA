/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author oscar
 */
public class Proveedor {
    private int id_pk;
    private String nombre;
    private String direccion;
    private PersonaContacto persona;
    private int[] telefono;
    
    public Proveedor() {
    }
    
    public Proveedor(int id_pk, String nombre, String direccion, PersonaContacto persona, int[] telefono) {
        this.id_pk = id_pk;
        this.nombre = nombre;
        this.direccion = direccion;
        this.persona = persona;
        this.telefono = telefono;
    }

    public Proveedor(String nombre, String direccion, PersonaContacto persona, int[] telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.persona = persona;
        this.telefono = telefono;
    }

    public int[] getTelefono() {
        return telefono;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public PersonaContacto getPersona() {
        return persona;
    }

    public void setPersona(PersonaContacto persona) {
        this.persona = persona;
    }

    public void setTelefono(int[] telefono) {
        this.telefono = telefono;
    }
    

    @Override
    public String toString() {
        return "Proveedor{" + "id_pk=" + id_pk + ", nombre=" + nombre + ", direccion=" + direccion + ", persona=" + persona + '}';
    }
}
