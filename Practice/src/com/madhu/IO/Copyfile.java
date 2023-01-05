package com.madhu.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Copyfile {

	public static void main(String[] args) throws IOException {
		//create a new file
		/*File file = new File("file4.txt");
		file.createNewFile();
		//we need to ite inti the new file
		PrintWriter printWriter = new PrintWriter(file);
		//read from file1
		FileReader file1 = new FileReader("file2.txt");
		BufferedReader bReader = new BufferedReader(file1);
		//read from file2
		FileReader file2 = new FileReader("file3.txt");
		BufferedReader bReader2 =new BufferedReader(file2);
		String line = bReader.readLine();
		while(line!=null) {
			printWriter.write(line);
			line = bReader.readLine();
		}
		
		line = bReader2.readLine();
		while(line!=null) {
			printWriter.write(line);
			line = bReader.readLine();
		}*/
		PrintWriter printWriter  = new PrintWriter("file4.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader("file2.txt"));
		String line = bufferedReader.readLine();
		while(line!=null) {
			printWriter.println(line);
			line = bufferedReader.readLine();
		}
		bufferedReader = new BufferedReader(new FileReader("file3.txt"));
		line = bufferedReader.readLine();
		while(line!=null) {
			printWriter.println(line);
			line = bufferedReader.readLine();
		}
		printWriter.flush();
		bufferedReader.close();
		printWriter.close();
		System.out.println("open file4.txt");

	}

}
