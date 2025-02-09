package modelo;
public class Factura {
    private int id_pk;
    private double subtotal;
    private Fecha fecha;
    private double total;
    private double iva;
    private Cliente cliente;
    private Empleado empleado;

    public Factura() {
    }

    public Factura(int id_pk, double subtotal, Fecha fecha, double total, double iva, Cliente cliente, Empleado empleado) {
        this.id_pk = id_pk;
        this.subtotal = subtotal;
        this.fecha = fecha;
        this.total = total;
        this.iva = iva;
        this.cliente = cliente;
        this.empleado = empleado;
    }
    
    public double calcularIva(){
        return (this.subtotal * 19) / 100;
    }
    public double calcularTotal(){
        return this.subtotal - calcularIva();
    }

    // Getters

    public int getId_pk() {
        return id_pk;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public double getTotal() {
        return total;
    }

    public double getIva() {
        return iva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }
    
    // Setters

    public void setId_pk(int id_pk) {
        this.id_pk = id_pk;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    // To string

    @Override
    public String toString() {
        return "Factura{" + "id_pk=" + id_pk + ", subtotal=" + subtotal + ", fecha=" + fecha + ", total=" + total + ", iva=" + iva + ", cliente=" + cliente + ", empleado=" + empleado + '}';
    }
    
}
