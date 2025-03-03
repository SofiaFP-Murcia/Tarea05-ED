public class Cliente {
    private boolean esVip;
    private String nombre;
    private int id;

    public Cliente(boolean vip, String nombre, int id) {
        this.setEsVip(vip);
        this.setNombre(nombre);
        this.setId(id);
    }

    public boolean isEsVip() {
        return esVip;
    }

    public void setEsVip(boolean esVip) {
        this.esVip = esVip;
    }

    public java.lang.String getNombre() {
        return nombre;
    }

    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
