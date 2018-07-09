package de.fynn.training.controlled;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class AlarmClockSound {
    static String choosensound; // = get sound out of personaldata.txt
	public static void sound() {
		String path = choosensound;
		try {
			FileInputStream fis = new FileInputStream(path);
			Player pl = new Player(fis);
			pl.play();
		}catch(JavaLayerException jle) {
			jle.printStackTrace();
		}catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		
	}
}
