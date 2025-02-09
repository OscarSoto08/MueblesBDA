package modelo;

import java.util.List;

public abstract class Persona{
    private int id_pk;
    private String nombre;
    private String apellido;
    private String correo;
    private List<Telefono> telefonos;

    public Persona() {
    }

    public Persona(int id_pk, String nombre, String apellido, String correo, List<Telefono> telefonos) {
        this.id_pk = id_pk;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefonos = telefonos;
    }
    
    //Getters

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

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    @Override
    public String toString() {
        return "Persona{" + "id_pk=" + id_pk + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", telefonos=" + telefonos + '}';
    }
}