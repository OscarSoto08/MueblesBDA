package modelo;

public class Telefono {
    private int id_persona;
    private String numero;

    public Telefono() {
    }

    public Telefono(int id_persona, String numero) {
        this.id_persona = id_persona;
        this.numero = numero;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefono{" + "id_persona=" + id_persona + ", numero=" + numero + '}';
    }
}
