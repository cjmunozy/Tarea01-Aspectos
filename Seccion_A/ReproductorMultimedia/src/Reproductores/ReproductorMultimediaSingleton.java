package Reproductores;

public class ReproductorMultimediaSingleton {
    private static ReproductorMultimediaSingleton instancia;
    private MediaAdapter mediaAdapter;  // Adaptador para reproducir medios

    private ReproductorMultimediaSingleton() {
        mediaAdapter = new MediaAdapter(new ReproductorDeMusica(), new ReproductorDeVideo());
    }

    public static ReproductorMultimediaSingleton getInstancia() {
        if (instancia == null) {
            instancia = new ReproductorMultimediaSingleton();
        }
        return instancia;
    }

    public void reproducir(String medio, TipoMedio tipo) {
        if (tipo == TipoMedio.MUSICA || tipo == TipoMedio.VIDEO) {
            mediaAdapter.reproducir(medio, tipo);
        } else {
            System.out.println("Tipo de medio no admitido");
        }
    }

    public void pausar() {
    }

    public void detener() {
    }
}