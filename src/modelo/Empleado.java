package modelo;

public class Empleado extends Persona{
    private double salario_bruto;
    private double salario_neto;
    private int id_tipo_usuario;
    private String clave;

    public Empleado() {
        super();
    }

    public Empleado(int id_pk, String nombre, String apellido, double salario_bruto, double salario_neto, String correo, String clave, int[] telefono, int id_tipo_usuario) {
        super(id_pk, nombre, apellido, correo, telefono);
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario_bruto = salario_bruto;
        this.salario_neto = salario_neto;
        this.correo = correo;
        this.clave = clave;
        this.id_tipo_usuario = id_tipo_usuario;
    }

    public Empleado(String nombre, String apellido, String correo, int[] telefono, String clave, double salario_neto, double salario_bruto, int id_tipo_usuario) {
        super(nombre, apellido, correo, telefono);
        this.salario_bruto = salario_bruto;
        this.salario_neto = salario_neto;
        this.clave = clave;
        this.id_tipo_usuario = id_tipo_usuario;
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

    public int getId_tipo_usuario() {
        return id_tipo_usuario;
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

    public void setId_tipo_usuario(int id_tipo_usuario) {
        this.id_tipo_usuario = id_tipo_usuario;
    }

    
    @Override
    public String toString() {
        return super.toString() + " salario_bruto=" + salario_bruto + ", salario_neto=" + salario_neto + ", clave=" + clave + ", id_tipo_usuario: " + id_tipo_usuario + '}';
    }
}
