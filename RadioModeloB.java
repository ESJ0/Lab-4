import java.util.ArrayList;
import java.util.List;

public class RadioModeloB implements InterfazB {
    private boolean encendido;
    private int volumen;
    private String banda; // "AM" o "FM"
    private double frecuencia;
    private List<Double> emisorasGuardadas;
    private List<String> listaReproduccion;
    private String ultimoContactoLlamado;

    // Constructor
    public RadioModeloB() {
        this.encendido = false;
        this.volumen = 10; 
        this.banda = "FM";
        this.frecuencia = 88.0;
        this.emisorasGuardadas = new ArrayList<>();
        this.listaReproduccion = new ArrayList<>();
    }

    // Métodos generales
    public void encender() {
        this.encendido = true;
        System.out.println("El radio está encendido.");
    }

    public void apagar() {
        this.encendido = false;
        System.out.println("El radio está apagado.");
    }

    public void cambiarVolumen(int cambio) {
        if (encendido) {
            this.volumen = Math.max(0, this.volumen + cambio);
            System.out.println("Volumen ajustado a: " + this.volumen);
        } else {
            System.out.println("Error: El radio está apagado.");
        }
    }

    // Implementación de ModoRadio
    @Override
    public void cambiarBanda() {
        if (encendido) {
            this.banda = this.banda.equals("FM") ? "AM" : "FM";
            System.out.println("Banda cambiada a: " + this.banda);
        } else {
            System.out.println("Error: El radio está apagado.");
        }
    }

    @Override
    public void cambiarEmisora(double frecuencia) {
        if (encendido) {
            this.frecuencia += frecuencia;
            System.out.println("Frecuencia actual: " + this.frecuencia + " " + this.banda);
        } else {
            System.out.println("Error: El radio está apagado.");
        }
    }

    @Override
    public void guardarEmisora(double frecuencia) {
        if (encendido) {
            if (emisorasGuardadas.size() < 50) {
                emisorasGuardadas.add(frecuencia);
                System.out.println("Emisora " + frecuencia + " guardada.");
            } else {
                System.out.println("Error: No se pueden guardar más emisoras.");
            }
        } else {
            System.out.println("Error: El radio está apagado.");
        }
    }

    @Override
    public void cargarEmisora(int posicion) {
        if (encendido) {
            if (posicion >= 0 && posicion < emisorasGuardadas.size()) {
                this.frecuencia = emisorasGuardadas.get(posicion);
                System.out.println("Cargando emisora guardada: " + this.frecuencia);
            } else {
                System.out.println("Error: Posición inválida.");
            }
        } else {
            System.out.println("Error: El radio está apagado.");
        }
    }

    // Implementación de ModoReproduccion
    @Override
    public void seleccionarListaReproduccion(String lista) {
        listaReproduccion.add(lista);
        System.out.println("Lista de reproducción seleccionada: " + lista);
    }

    @Override
    public void cambiarCancion(int direccion) {
        System.out.println("Cambiando canción...");
    }

    @Override
    public void escucharCancion() {
        System.out.println("Reproduciendo canción...");
    }

    // Implementación de ModoTelefono
    @Override
    public void conectarTelefono() {
        System.out.println("Teléfono conectado.");
    }

    @Override
    public void desconectarTelefono() {
        System.out.println("Teléfono desconectado.");
    }

    @Override
    public void mostrarContactos() {
        System.out.println("Mostrando contactos...");
    }

    @Override
    public void llamarContacto(String contacto) {
        System.out.println("Llamando a " + contacto + "...");
    }

    @Override
    public void finalizarLlamada() {
        System.out.println("Llamada finalizada.");
    }

    // Funciones específicas de Clase B
    @Override
    public void llamarUltimoContacto() {
        System.out.println("Llamando al último contacto: " + ultimoContactoLlamado);
    }

    @Override
    public void verTarjetasPresentacion() {
        System.out.println("Mostrando tarjetas de presentación...");
    }
}
