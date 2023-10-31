public class ReproductorMultimedia {
    private static ReproductorMultimedia instancia;  // Variable estática para almacenar la instancia única
    private MediaAdapter mediaAdapter;

    private ReproductorMultimedia() {
        mediaAdapter = new MediaAdapter(new ReproductorDeMusica(), new ReproductorDeVideo());
    }

    public static ReproductorMultimedia getInstancia() {
        if (instancia == null) {
            instancia = new ReproductorMultimedia();
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
        mediaAdapter.pausar();
    }

    public void detener() {
        mediaAdapter.detener();
    }
}


