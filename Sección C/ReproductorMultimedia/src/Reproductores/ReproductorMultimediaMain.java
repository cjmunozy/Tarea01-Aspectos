package Reproductores;

import java.util.Scanner;

public class ReproductorMultimediaMain {
	private static String file;
	private static Scanner input = new Scanner(System.in);
	private static MediaPlayer mp;
	
    public static void main(String[] args) {
    	int option = 0;
    	while(option != 3)
    		option = menu();
    }
    
    public static String readConsole(String message) {
    	System.out.println(message);
    	String inputText = input.nextLine();
    	return inputText;
    }
    
    public static int menu() {
    	System.out.println("Media Player");
    	System.out.println("Please enter an option");
    	System.out.println("1 - Play Audio");
    	System.out.println("2 - Play Video");
    	System.out.println("3 - Exit");
    	int option = (Integer.valueOf(readConsole("Option"))).intValue();
    	switch(option) {
    		case 1:
    			file = readConsole("Enter audio name");
    			mp = AudioPlayer.getInstance(file);
    			status(mp);
    			break;
    		case 2:
    			file = readConsole("Enter video name");
    			mp = VideoPlayer.getInstance(file);
    			status(mp);
    			break;
    		case 3:
    			break;
    		default:
    			System.out.println("Incorrect option");
    			break;
    	}
    	return option;
    }
    
    public static int commands(MediaPlayer mp, int action) {
    	String option;
    	if(action == 1) {
    		System.out.println("Enter P if you want to pause");
    	} else {
    		System.out.println("Enter P if you want to resume");
    	}
    	System.out.println("Else enter S if you want to stop");
    	option = readConsole("Option").toUpperCase();
    	switch(option) {
    		case "P":
    			if(action == 1) {
    				mp.pause();
    				action = 2;
    			} else {
    				mp.play();
    				action = 1;
    			}
    			break;
    		case "S":
    			mp.stop();
    			action = 3;
    			break;
    		default:
    			System.out.println("Incorrect option");
    			break;
    	}
    	return action;
    }
    
    public static void status(MediaPlayer mp) {
    	mp.play();
		int action = 1;
		while(action != 3)
			action = commands(mp, action);
    }
}
