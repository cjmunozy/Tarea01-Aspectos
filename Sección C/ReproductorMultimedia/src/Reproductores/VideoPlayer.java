package Reproductores;

public class VideoPlayer implements MediaPlayer{
	private static VideoPlayer instance;
	private String file;
	
	private VideoPlayer(String file){
		this.file = file;
	}
	
	public static VideoPlayer getInstance(String file) {
		if(instance == null)
			instance = new VideoPlayer(file);
		return instance;
	}

	public void play() {
		System.out.println("Playing video: " + file);
	}

	public void pause() {
		System.out.println("Video Paused");
	}

	public void stop() {
		System.out.println("End of file");
	}

}
