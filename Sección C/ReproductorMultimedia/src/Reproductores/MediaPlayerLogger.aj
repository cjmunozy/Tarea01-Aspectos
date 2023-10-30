package Reproductores;

public aspect MediaPlayerLogger {
	
	pointcut playStatus():
		execution(void MediaPlayer.play(..));
	
	pointcut pauseStatus():
		execution(void MediaPlayer.pause(..));
	
	pointcut stopStatus():
		execution(void MediaPlayer.stop(..));
	
	before(): playStatus(){
		System.out.println("Starting");
	}
	
	before(): pauseStatus(){
		System.out.println("Pausing");
	}
	
	before(): stopStatus(){
		System.out.println("Stoping");
	}
}
