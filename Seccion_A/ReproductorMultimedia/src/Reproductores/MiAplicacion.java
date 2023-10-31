package Reproductores;

public class MiAplicacion {
    public static void main(String[] args) {
        ReproductorMultimediaSingleton reproductor = ReproductorMultimediaSingleton.getInstancia();

        reproductor.reproducir("Canción1", TipoMedio.MUSICA);

        reproductor.reproducir("Video1", TipoMedio.VIDEO);

    }
}

