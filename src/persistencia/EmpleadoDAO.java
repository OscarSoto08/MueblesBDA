package persistencia;

import config.DAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;
import modelo.Fecha;
import modelo.TipoUsuario;

/**
 *
 * @author oscar
 */
public class EmpleadoDAO extends DAO<Empleado> {

    @Override
    public boolean insertar(Empleado nuevo) {
        sql = "INSERT INTO `empleado`(`nombre`, `apellido`, `salario_bruto`, `salario_neto`, `correo`, `tipo_usuario`, `clave`, `fecha_contrato`, `fecha_retiro`) VALUES (?,?,?,?,?,?,?,?,?)";
        boolean resultado = true;
        try {
            st = getCnn().prepareStatement(sql);
            st.setString(1, nuevo.getNombre());
            st.setString(2, nuevo.getApellido());
            st.setDouble(3, nuevo.getSalario_bruto());
            st.setDouble(4, nuevo.getSalario_neto());
            st.setString(5, nuevo.getCorreo());
            st.setInt(6, nuevo.getTipoUsuario().getId_tipo_usuario());
            st.setString(7, nuevo.getClave());
            st.setString(8, nuevo.getFecha_contrato().toString());
            st.setString(9, nuevo.getFecha_retiro() != null ? nuevo.getFecha_retiro().toString() : null);
            
            resultado = st.executeUpdate() > 0; // Cambié a executeUpdate para un INSERT
        } catch (SQLException ex) {
            errorMessage = "Error al insertar un nuevo empleado, mensaje: " + ex.getMessage();
            System.err.println(errorMessage);
            resultado = false;
        } finally {
            instance.cerrarConexion();
        }
        return resultado;
    }

    @Override
    public boolean eliminar(int id_pk) {
        sql = "DELETE FROM `empleado` WHERE `id_pk` = ?";
        boolean resultado = true;
        try {
            st = getCnn().prepareStatement(sql);
            st.setInt(1, id_pk);
            
            resultado = st.executeUpdate() > 0; // Cambié a executeUpdate para un DELETE
        } catch (SQLException ex) {
            errorMessage = "Error al eliminar el empleado con id_pk: " + id_pk + ", mensaje: " + ex.getMessage();
            System.err.println(errorMessage);
            resultado = false;
        } finally {
            instance.cerrarConexion();
        }
        return resultado;
    }

    @Override
    public List<Empleado> leerTodos() {
        List<Empleado> empleados = new ArrayList<>();
        sql = "SELECT * FROM `empleado`";
        
        try {
            st = getCnn().prepareStatement(sql);
            rs = st.executeQuery();
            
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setId_pk(rs.getInt("id_pk"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellido(rs.getString("apellido"));
                empleado.setSalario_bruto(rs.getDouble("salario_bruto"));
                empleado.setSalario_neto(rs.getDouble("salario_neto"));
                empleado.setCorreo(rs.getString("correo"));
                // Se obtiene el tipo de usuario del enum
                empleado.setTipoUsuario(TipoUsuario.values()[rs.getInt("tipo_usuario") - 1]);
                empleado.setClave(rs.getString("clave"));
                
                // Convertir las fechas de la base de datos a la clase Fecha
                String fechaContratoStr = rs.getString("fecha_contrato");
                String[] fechaContratoParts = fechaContratoStr.split("/");
                empleado.setFecha_contrato(new Fecha(Integer.parseInt(fechaContratoParts[0]), Integer.parseInt(fechaContratoParts[1]), Integer.parseInt(fechaContratoParts[2])));
                
                String fechaRetiroStr = rs.getString("fecha_retiro");
                if (fechaRetiroStr != null) {
                    String[] fechaRetiroParts = fechaRetiroStr.split("/");
                    empleado.setFecha_retiro(new Fecha(Integer.parseInt(fechaRetiroParts[0]), Integer.parseInt(fechaRetiroParts[1]), Integer.parseInt(fechaRetiroParts[2])));
                }
                
                empleados.add(empleado);
            }
        } catch (SQLException ex) {
            errorMessage = "Error al leer todos los empleados, mensaje: " + ex.getMessage();
            System.err.println(errorMessage);
        } finally {
            instance.cerrarConexion();
        }
        
        return empleados;
    }

    @Override
    public Empleado leer(int id_pk) {
        Empleado empleado = null;
        sql = "SELECT * FROM `empleado` WHERE `id_pk` = ?";
        
        try {
            st = getCnn().prepareStatement(sql);
            st.setInt(1, id_pk);
            rs = st.executeQuery();
            
            if (rs.next()) {
                empleado = new Empleado();
                empleado.setId_pk(rs.getInt("id_pk"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellido(rs.getString("apellido"));
                empleado.setSalario_bruto(rs.getDouble("salario_bruto"));
                empleado.setSalario_neto(rs.getDouble("salario_neto"));
                empleado.setCorreo(rs.getString("correo"));
                empleado.setTipoUsuario(TipoUsuario.values()[rs.getInt("tipo_usuario") - 1]);
                empleado.setClave(rs.getString("clave"));
                
                // Convertir las fechas de la base de datos a la clase Fecha
                String fechaContratoStr = rs.getString("fecha_contrato");
                String[] fechaContratoParts = fechaContratoStr.split("/");
                empleado.setFecha_contrato(new Fecha(Integer.parseInt(fechaContratoParts[0]), Integer.parseInt(fechaContratoParts[1]), Integer.parseInt(fechaContratoParts[2])));
                
                String fechaRetiroStr = rs.getString("fecha_retiro");
                if (fechaRetiroStr != null) {
                    String[] fechaRetiroParts = fechaRetiroStr.split("/");
                    empleado.setFecha_retiro(new Fecha(Integer.parseInt(fechaRetiroParts[0]), Integer.parseInt(fechaRetiroParts[1]), Integer.parseInt(fechaRetiroParts[2])));
                }
            }
        } catch (SQLException ex) {
            errorMessage = "Error al leer el empleado con id_pk: " + id_pk + ", mensaje: " + ex.getMessage();
            System.err.println(errorMessage);
        } finally {
            instance.cerrarConexion();
        }
        
        return empleado;
    }

    @Override
    public boolean editar(Empleado editado) {
        sql = "UPDATE `empleado` SET `nombre` = ?, `apellido` = ?, `salario_bruto` = ?, `salario_neto` = ?, `correo` = ?, `tipo_usuario` = ?, `clave` = ?, `fecha_contrato` = ?, `fecha_retiro` = ? WHERE `id_pk` = ?";
        boolean resultado = true;
        
        try {
            st = getCnn().prepareStatement(sql);
            st.setString(1, editado.getNombre());
            st.setString(2, editado.getApellido());
            st.setDouble(3, editado.getSalario_bruto());
            st.setDouble(4, editado.getSalario_neto());
            st.setString(5, editado.getCorreo());
            st.setInt(6, editado.getTipoUsuario().getId_tipo_usuario());
            st.setString(7, editado.getClave());
            st.setString(8, editado.getFecha_contrato().toString());
            st.setString(9, editado.getFecha_retiro() != null ? editado.getFecha_retiro().toString() : null);
            st.setInt(10, editado.getId_pk());
            
            resultado = st.executeUpdate() > 0; // Cambié a executeUpdate para un UPDATE
        } catch (SQLException ex) {
            errorMessage = "Error al editar el empleado con id_pk: " + editado.getId_pk() + ", mensaje: " + ex.getMessage();
            System.err.println(errorMessage);
            resultado = false;
        } finally {
            instance.cerrarConexion();
        }
        
        return resultado;
    }
}
