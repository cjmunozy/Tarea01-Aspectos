package Reproductores;

public class AudioPlayer implements MediaPlayer{
	private static AudioPlayer instance;
	private String file;
	
	private AudioPlayer(String file){
		this.file = file;
	}
	
	public static AudioPlayer getInstance(String file) {
		if(instance == null)
			instance = new AudioPlayer(file);
		return instance;
	}

	public void play() {
		System.out.println("Playing audio: " + file);
	}

	public void pause() {
		System.out.println("Audio Paused");
	}

	public void stop() {
		System.out.println("End of file");
	}

}
