package modelo;
public class Venta {
    private Factura factura;
    private Mueble mueble;
    private int cantidad;
    private double precio_suma;

    public Venta() {
    }

    public Venta(Factura factura, Mueble mueble, int cantidad, double precio_suma) {
        this.factura = factura;
        this.mueble = mueble;
        this.cantidad = cantidad;
        this.precio_suma = precio_suma;
    }

    public Factura getFactura() {
        return factura;
    }

    public Mueble getMueble() {
        return mueble;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio_suma() {
        return precio_suma;
    }
    
    //setter

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public void setMueble(Mueble mueble) {
        this.mueble = mueble;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio_suma(double precio_suma) {
        this.precio_suma = precio_suma;
    }
    
    // toString

    @Override
    public String toString() {
        return "Venta{" + "factura=" + factura + ", mueble=" + mueble + ", cantidad=" + cantidad + ", precio_suma=" + precio_suma + '}';
    }
    
}
