package modelo;

public class Mueble {
    private int id_pk;
    private double precio;
    private Color color;
    private Tipo tipo;
    private Material material;

    public Mueble() {
    }

    public Mueble(int id_pk, double precio, Color color, Tipo tipo, Material material) {
        this.id_pk = id_pk;
        this.precio = precio;
        this.color = color;
        this.tipo = tipo;
        this.material = material;
    }

    public int getId_pk() {
        return id_pk;
    }

    public double getPrecio() {
        return precio;
    }

    public Color getColor() {
        return color;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Material getMaterial() {
        return material;
    }
    
    
    
    // Setters

    public void setId_pk(int id_pk) {
        this.id_pk = id_pk;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
    
    // ToString

    @Override
    public String toString() {
        return "Mueble{" + "id_pk=" + id_pk + ", precio=" + precio + ", color=" + color + ", tipo=" + tipo + ", material=" + material + '}';
    }
    
}
