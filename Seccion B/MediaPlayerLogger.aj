public aspect MediaPlayerLogger {
	pointcut reproducir():
		execution(void MediaPayer.reproducir(String ,TipoMedio));
	
	pointcut pausar():
		execution(void MediaPayer.pausar(..));
	
	pointcut detener():
		execution(void MediaPayer.detener(..));
	
}
