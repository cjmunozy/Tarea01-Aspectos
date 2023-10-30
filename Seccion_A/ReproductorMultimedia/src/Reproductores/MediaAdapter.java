package Reproductores;

public class MediaAdapter implements MediaPlayer {
    private ReproductorMusica reproductorMusica;
    private ReproductorVideo reproductorVideo;

    public MediaAdapter(ReproductorMusica reproductorMusica, ReproductorVideo reproductorVideo) {
        this.reproductorMusica = reproductorMusica;
        this.reproductorVideo = reproductorVideo;
    }

    @Override
    public void reproducir(String medio) {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void detener() {

    }
}
