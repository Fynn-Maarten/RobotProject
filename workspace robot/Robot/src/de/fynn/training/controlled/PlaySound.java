package de.fynn.training.controlled;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class PlaySound {

	static int var = 0;
	static String path = "";
	@SuppressWarnings("deprecation")
	public static void sound(String path) {
		Thread t = new Thread() {
			
	public void run() {
		//"E:\\RobotProject\\Music\\unknown - Harry Potter Soundtrack for Studying Sleeping Rela.mp3";// find sound on yt which is like kinda loud ...
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
	};
	t.start();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	t.stop();
	}
}
