public class RadioManager {
    private RadioModeloB radio;
    private Usuario usuario;

    public RadioManager(RadioModeloB radio, Usuario usuario) {
        this.radio = radio;
        this.usuario = usuario;
    }

    public void encenderRadio() {
        radio.encender();
    }

    public void apagarRadio() {
        radio.apagar();
    }

    public void cambiarVolumen(int cambio) {
        radio.cambiarVolumen(cambio);
    }

    public void mostrarContactosUsuario() {
        usuario.getContactos().forEach(System.out::println);
    }
}

