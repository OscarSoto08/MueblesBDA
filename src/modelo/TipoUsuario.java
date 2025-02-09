package modelo;

public enum TipoUsuario {
    Administrador(1),
    Empleado(2);
    
    private final int id_tipo_usuario;
    
    private TipoUsuario(int id_tipo_usuario){
        this.id_tipo_usuario = id_tipo_usuario;
    }
    
    public int getId_tipo_usuario(){
        return this.id_tipo_usuario;
    }
}
