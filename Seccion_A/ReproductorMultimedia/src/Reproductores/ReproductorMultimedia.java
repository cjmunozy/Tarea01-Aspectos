package Reproductores;

public class ReproductorMultimedia implements MediaPlayer{
    @Override
    public void reproducir(String medio) {
        System.out.println("Reproduciendo medio: " + medio);
    }

    @Override
    public void pausar() {
        System.out.println("Reproducción en pausa");
    }

    @Override
    public void detener() {
        System.out.println("Reproducción detenida");
    }
}
