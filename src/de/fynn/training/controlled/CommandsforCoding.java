package de.fynn.training.controlled;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CommandsforCoding{

	public static String getfirstline() throws IOException {
	    FileReader fr = new FileReader("D:\\Dev Projects\\Robot\\workspace robot\\Robot\\TextFiles\\IFS.txt");
	//	FileReader fr = new FileReader("C:\\Development\\Robot\\input.txt"); 
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		
		int i = 0;
		while((line = br.readLine()) != null) {
			i++;
			if( i == 1) {
				br.close();
				return line;
			}
			
		}
		
		br.close();
		return null;
	}
}
