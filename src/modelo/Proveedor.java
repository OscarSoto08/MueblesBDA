/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author oscar
 */
public class Proveedor {
    private int id_pk;
    private String nombre;
    private String direccion;
    private PersonaContacto persona;
    private List<Telefono> telefonos;

    //constructs 
    
    public Proveedor() {
    }

    public Proveedor(int id_pk, String nombre, String direccion, PersonaContacto persona, List<Telefono> telefonos) {
        this.id_pk = id_pk;
        this.nombre = nombre;
        this.direccion = direccion;
        this.persona = persona;
        this.telefonos = telefonos;
    }

    //Getters
    
    public int getId_pk() {
        return id_pk;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public PersonaContacto getPersona() {
        return persona;
    }

    public List<Telefono> getTelefonos() {
        return telefonos;
    }
    
    // Setters

    public void setId_pk(int id_pk) {
        this.id_pk = id_pk;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPersona(PersonaContacto persona) {
        this.persona = persona;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }
    
    //To String

    @Override
    public String toString() {
        return "Proveedor{" + "id_pk=" + id_pk + ", nombre=" + nombre + ", direccion=" + direccion + ", persona=" + persona + ", telefonos=" + telefonos + '}';
    }
    
}
