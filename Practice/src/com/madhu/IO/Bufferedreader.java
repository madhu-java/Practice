package com.madhu.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferedreader {

	public static void main(String[] args) throws IOException {
		FileReader fr= new FileReader("file2.txt");
		BufferedReader br= new BufferedReader(fr);
		String lineString = br.readLine();
		while(lineString!=null) {
			System.out.println(lineString);
			lineString = br.readLine();
		}
		br.close();

	}

}
