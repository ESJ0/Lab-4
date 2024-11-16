import java.util.List;

public class Usuario {
    private String nombre;
    private List<String> contactos;
    private List<String> listaReproduccionFavorita;
    private String ultimoContactoLlamado;
    private double ultimaEmisora;
    private int volumenPreferido;

    // Constructor
    public Usuario(String nombre, List<String> contactos, List<String> listaReproduccionFavorita) {
        this.nombre = nombre;
        this.contactos = contactos;
        this.listaReproduccionFavorita = listaReproduccionFavorita;
        this.volumenPreferido = 10; // Valor por defecto
    }

    // Métodos
    public String getNombre() {
        return nombre;
    }

    public List<String> getContactos() {
        return contactos;
    }

    public void agregarContacto(String contacto) {
        contactos.add(contacto);
    }

    public List<String> getListaReproduccionFavorita() {
        return listaReproduccionFavorita;
    }

    public String getUltimoContactoLlamado() {
        return ultimoContactoLlamado;
    }

    public void setUltimoContactoLlamado(String contacto) {
        this.ultimoContactoLlamado = contacto;
    }

    public double getUltimaEmisora() {
        return ultimaEmisora;
    }

    public void setUltimaEmisora(double frecuencia) {
        this.ultimaEmisora = frecuencia;
    }

    public int getVolumenPreferido() {
        return volumenPreferido;
    }

    public void setVolumenPreferido(int volumen) {
        this.volumenPreferido = volumen;
    }
}
