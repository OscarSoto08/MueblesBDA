/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author oscar
 */
public class Compra {
    private int id_pk;
    private double costo;
    private int cantidad;
    private Fecha fecha;
    private Mueble mueble;
    private Proveedor proveedor;

    //Constructs
    
    public Compra() {
    }

    public Compra(int id_pk, double costo, int cantidad, Fecha fecha, Mueble mueble, Proveedor proveedor) {
        this.id_pk = id_pk;
        this.costo = costo;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.mueble = mueble;
        this.proveedor = proveedor;
    }

    // Getters
    public int getId_pk() {
        return id_pk;
    }

    public double getCosto() {
        return costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Mueble getMueble() {
        return mueble;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }
    
    //setters

    public void setId_pk(int id_pk) {
        this.id_pk = id_pk;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setMueble(Mueble mueble) {
        this.mueble = mueble;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    //ToString

    @Override
    public String toString() {
        return "Compra{" + "id_pk=" + id_pk + ", costo=" + costo + ", cantidad=" + cantidad + ", fecha=" + fecha + ", mueble=" + mueble + ", proveedor=" + proveedor + '}';
    }
    
}
