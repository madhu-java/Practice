package com.madhu.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.sound.midi.Soundbank;

public class CopyUniqvaluetoaFile {

	public static void main(String[] args) throws IOException {
		PrintWriter printWriter = new PrintWriter("file7.txt");
		
   BufferedReader bufferedReader = new BufferedReader(new FileReader("file6.txt"));
   String target = bufferedReader.readLine();
   boolean targetExists = false;
   while(target!=null) {
	   BufferedReader bufferedReader2 = new BufferedReader(new FileReader("file7.txt"));
	   String lineString = bufferedReader2.readLine();
	   System.out.println(lineString);
	   while(lineString!=null) {
	   if(target==lineString) {
		   targetExists= true;
		   break;
	   }
	   lineString =bufferedReader2.readLine();
	   }
	   if(targetExists==false) {
		   printWriter.println(target);
	   }
	   target = bufferedReader.readLine();
   }
		
	}

}
