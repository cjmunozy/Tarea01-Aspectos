package Reproductores;

public interface MediaPlayer {
    void reproducir(String medio, TipoMedio tipo);
    void pausar();
    void detener();
}

