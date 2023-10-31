package Reproductores;

public class MiAplicacion {
    public static void main(String[] args) {
        // Acceder a la instancia única del reproductor multimedia a través del Singleton
        ReproductorMultimediaSingleton reproductor = ReproductorMultimediaSingleton.getInstancia();

        // Utilizar el reproductor para reproducir música
        reproductor.reproducir("Canción1", TipoMedio.MUSICA);

        // Utilizar el reproductor para reproducir video
        reproductor.reproducir("Video1", TipoMedio.VIDEO);

    }
}

