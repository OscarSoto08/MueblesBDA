package config;

import java.util.List;
public interface ContratoDAO <Objeto> {
    public boolean insertar(Objeto nuevo);
    public boolean eliminar(int id);
    public List<Objeto> leerTodos();
    public Objeto leer(int id);
    public boolean editar(Objeto editado);
}
