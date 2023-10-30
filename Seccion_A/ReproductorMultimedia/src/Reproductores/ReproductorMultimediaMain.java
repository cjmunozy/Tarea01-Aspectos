package Reproductores;

public class ReproductorMultimediaMain {
    public static void main(String[] args) {
        ReproductorMusica reproductorDeMusica = new ReproductorDeMusica();

        ReproductorMusicaAdapter adaptadorDeMusica = new ReproductorMusicaAdapter(reproductorDeMusica);

        ReproductorMultimedia reproductorMultimedia = new ReproductorMultimedia();

        reproductorMultimedia.reproducir( "Canción1");
    }
}
