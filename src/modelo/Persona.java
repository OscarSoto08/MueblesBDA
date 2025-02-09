/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author oscar
 */
public abstract class Persona {
    protected int id_pk;
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected int[] telefono;

    public Persona() {
    }

    public Persona(int id_pk, String nombre, String apellido, String correo, int[] telefono) {
        this.id_pk = id_pk;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Persona(String nombre, String apellido, String correo, int[] telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getId_pk() {
        return id_pk;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public int[] getTelefono() {
        return telefono;
    }

    public void setId_pk(int id_pk) {
        this.id_pk = id_pk;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(int[] telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        
        String tels = "";
        for (int i : telefono) {
            tels += i + " , ";
        }
        return "Persona{" + "id_pk=" + id_pk + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", telefono= " + tels;
    }
}