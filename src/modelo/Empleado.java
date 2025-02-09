package modelo;

import java.util.List;

public class Empleado extends Persona{
    private double salario_bruto;
    private double salario_neto;
    private String clave;
    private Fecha fecha_contrato;
    private Fecha fecha_retiro;
    private TipoUsuario tipoUsuario;
    private List<Factura> facturas;
    
    public Empleado() {
    }

    public Empleado(double salario_bruto, double salario_neto, String clave, Fecha fecha_contrato, Fecha fecha_retiro, TipoUsuario tipoUsuario, int id_pk, String nombre, String apellido, String correo, List<Telefono> telefonos) {
        super(id_pk, nombre, apellido, correo, telefonos);
        this.salario_bruto = salario_bruto;
        this.salario_neto = salario_neto;
        this.clave = clave;
        this.fecha_contrato = fecha_contrato;
        this.fecha_retiro = fecha_retiro;
        this.tipoUsuario = tipoUsuario;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }
    public double getSalario_bruto() {
        return salario_bruto;
    }

    public double getSalario_neto() {
        return salario_neto;
    }

    public String getClave() {
        return clave;
    }

    public Fecha getFecha_contrato() {
        return fecha_contrato;
    }

    public Fecha getFecha_retiro() {
        return fecha_retiro;
    }

    
    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    //Setters

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
    
    public void setSalario_bruto(double salario_bruto) {
        this.salario_bruto = salario_bruto;
    }

    public void setSalario_neto(double salario_neto) {
        this.salario_neto = salario_neto;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setFecha_contrato(Fecha fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }

    public void setFecha_retiro(Fecha fecha_retiro) {
        this.fecha_retiro = fecha_retiro;
    }
    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return super.toString() + ", salario_bruto=" + salario_bruto + ", salario_neto=" + salario_neto + ", clave=" + clave + ", fecha_contrato=" + fecha_contrato + ", fercha_retiro=" + fecha_retiro + ", tipoUsuario=" + tipoUsuario + '}';
    }
}