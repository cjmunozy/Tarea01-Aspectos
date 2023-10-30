package Reproductores;

public class ReproductorDeMusica implements ReproductorMusica {

    private boolean reproduciendo;
    private String cancionActual;

    public ReproductorDeMusica() {
        this.reproduciendo = false;
        this.cancionActual = null;
    }

    @Override
    public void reproducirMusica(String cancion) {
        if (!reproduciendo) {
            System.out.println("Reproduciendo la canción: " + cancion);
            reproduciendo = true;
            cancionActual = cancion;
        } else {
            System.out.println("Ya se está reproduciendo una canción. Detén la reproducción actual antes de reproducir una nueva.");
        }
    }

    @Override
    public void pausarMusica() {
        if (reproduciendo) {
            System.out.println("Pausando la canción: " + cancionActual);
            reproduciendo = false;
        } else {
            System.out.println("No hay una canción en reproducción para pausar.");
        }
    }

    @Override
    public void detenerMusica() {
        if (reproduciendo) {
            System.out.println("Deteniendo la canción: " + cancionActual);
            reproduciendo = false;
            cancionActual = null;
        } else {
            System.out.println("No hay una canción en reproducción para detener.");
        }
    }

    public boolean estaReproduciendo() {
        return reproduciendo;
    }
}