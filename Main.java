import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Inicializamos los contactos y listas del usuario
        List<String> contactos = new ArrayList<>();
        contactos.add("Juan Pérez");
        contactos.add("María López");
        contactos.add("Carlos Gómez");

        List<String> listaReproduccion = new ArrayList<>();
        listaReproduccion.add("Pop Hits");
        listaReproduccion.add("Rock Classics");
        listaReproduccion.add("Jazz Essentials");

        // Crear el usuario
        Usuario usuario = new Usuario("Ana Martínez", contactos, listaReproduccion);

        // Crear el radio modelo B
        RadioModeloB radio = new RadioModeloB();

        // Crear el gestor del radio
        RadioManager gestor = new RadioManager(radio, usuario);

        // Simulaciones
        System.out.println("==== Simulación del Radio ====");
        
        // Encender el radio
        gestor.encenderRadio();

        // Cambiar volumen
        gestor.cambiarVolumen(1); // Subir volumen
        gestor.cambiarVolumen(-2); // Bajar volumen

        // Modo Radio
        radio.cambiarBanda(); // Cambiar a AM
        radio.cambiarEmisora(0.5); // Subir frecuencia
        radio.guardarEmisora(101.5); // Guardar emisora
        radio.cargarEmisora(0); // Cargar la emisora guardada

        // Modo Reproducción
        radio.seleccionarListaReproduccion("Rock Classics");
        radio.cambiarCancion(1); // Cambiar a la siguiente canción
        radio.escucharCancion(); // Escuchar la canción actual

        // Modo Teléfono
        radio.conectarTelefono();
        radio.mostrarContactos();
        radio.llamarContacto("María López");
        radio.finalizarLlamada();

        // Funcionalidades específicas del modelo B
        radio.verTarjetasPresentacion();
        radio.llamarUltimoContacto();

        // Apagar el radio
        gestor.apagarRadio();

        System.out.println("==== Fin de la Simulación ====");
    }
}

