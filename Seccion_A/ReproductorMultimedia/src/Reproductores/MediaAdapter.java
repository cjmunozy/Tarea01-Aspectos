package Reproductores;

public class MediaAdapter implements MediaPlayer {
    private ReproductorMusica reproductorMusica;
    private ReproductorVideo reproductorVideo;

    public MediaAdapter(ReproductorMusica reproductorMusica, ReproductorVideo reproductorVideo) {
        this.reproductorMusica = reproductorMusica;
        this.reproductorVideo = reproductorVideo;
    }

    @Override
    public void reproducir(String medio, TipoMedio tipo) {
        if (tipo == TipoMedio.MUSICA) {
            reproductorMusica.reproducirMusica(medio);
        } else if (tipo == TipoMedio.VIDEO) {
            reproductorVideo.reproducirVideo(medio);
        } else {
            System.out.println("Tipo de medio no admitido");
        }
    }

    @Override
    public void pausar() {
    }

    @Override
    public void detener() {
    }
}
