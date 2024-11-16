public interface ModoReproduccion {
    void seleccionarListaReproduccion(String lista);
    void cambiarCancion(int direccion); // 1 para adelante, -1 para atrás
    void escucharCancion();
}
