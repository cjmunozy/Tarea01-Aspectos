package Reproductores;

public class ReproductorMusicaAdapter implements MediaPlayer {
    private ReproductorMusica reproductorMusica;

    public ReproductorMusicaAdapter(ReproductorMusica reproductorMusica) {
        this.reproductorMusica = reproductorMusica;
    }

    @Override
    public void reproducir(String medio) {
        reproductorMusica.reproducirMusica(medio);
    }

    @Override
    public void pausar() {
        reproductorMusica.pausarMusica();
    }

    @Override
    public void detener() {
        reproductorMusica.detenerMusica();
    }
}
