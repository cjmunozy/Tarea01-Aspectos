package Reproductores;

public class ReproductorDeVideo implements ReproductorVideo {

    private boolean reproduciendo;
    private String videoActual;

    public ReproductorDeVideo() {
        this.reproduciendo = false;
        this.videoActual = null;
    }

    @Override
    public void reproducirVideo(String video) {
        if (!reproduciendo) {
            System.out.println("Reproduciendo el video: " + video);
            reproduciendo = true;
            videoActual = video;
        } else {
            System.out.println("Ya se está reproduciendo un video. Detén la reproducción actual antes de reproducir uno nuevo.");
        }
    }

    @Override
    public void pausarVideo() {
        if (reproduciendo) {
            System.out.println("Pausando el video: " + videoActual);
            reproduciendo = false;
        } else {
            System.out.println("No hay un video en reproducción para pausar.");
        }
    }

    @Override
    public void detenerVideo() {
        if (reproduciendo) {
            System.out.println("Deteniendo el video: " + videoActual);
            reproduciendo = false;
            videoActual = null;
        } else {
            System.out.println("No hay un video en reproducción para detener.");
        }
    }

    public boolean estaReproduciendoVideo() {
        return reproduciendo;
    }
}
