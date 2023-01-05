package com.madhu.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferedwriter {

	public static void main(String[] args) throws IOException {
	
		FileWriter fw=new FileWriter("file2.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(105);
		char[] ch = {'A','M'};
		bw.newLine();
		bw.write(ch);
		bw.newLine();
		bw.write("Hello");
		bw.newLine();
		bw.flush();
		bw.close();
		
	}

}
