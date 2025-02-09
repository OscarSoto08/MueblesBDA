package config;

import config.ConexionBD;
import config.ContratoDAO;
import java.sql.*;

public abstract class DAO<T> implements ContratoDAO<T>{
    protected Connection cnn;
    protected ConexionBD instance;
    protected ResultSet rs;
    protected PreparedStatement st;
    protected String sql;
    protected String errorMessage;
    
    public DAO() {
        instance = ConexionBD.getInstance();
    }

    public Connection getCnn() {
        return instance.getCnn();
    }

    public void setCnn(Connection cnn) {
        this.cnn = cnn;
    }

    public ConexionBD getInstance() {
        return ConexionBD.getInstance();
    }

    public void setInstance(ConexionBD instance) {
        this.instance = instance;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public PreparedStatement getSt() {
        return st;
    }

    public void setSt(PreparedStatement st) {
        this.st = st;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
}
