package com.madhu.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFilesLinebyLine {

	public static void main(String[] args) throws IOException {

PrintWriter printWriter = new PrintWriter("file5.txt");

BufferedReader bReader= new BufferedReader(new FileReader("file2.txt"));
String line1= bReader.readLine();

BufferedReader bReader2= new BufferedReader(new FileReader("file3.txt"));
String line2= bReader2.readLine();
while(line1!=null || line2!=null) {
	if(line1!=null) {
		printWriter.println(line1);
		line1 = bReader.readLine();
		
	}
	if(line2!=null) {
		printWriter.println(line2);
		line2 = bReader2.readLine();
		
	}
}
System.out.println("copied");
	}

}
