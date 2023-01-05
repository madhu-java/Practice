package com.madhu.IO;

import java.io.DataOutput;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {

	public static void main(String[] args) throws IOException  {
		FileReader fileReader = new FileReader("C:\\Users\\madha\\Desktop\\JavaNeuro\\practice\\Practice\\file2.txt");
		int i = fileReader.read();
		while(i!=-1) {
			System.out.println((char)i+"==>");
			i=fileReader.read();
			System.out.println(i);
		}
		File f = new File("file2.txt");
		//System.out.println(i);
		FileReader fileReader2 = new FileReader(f);
		char[] charArray = new char[(int)f.length()];
		fileReader2.read(charArray);
		for( char ch:charArray ) {
			System.out.print(ch);
		}
		System.out.println(":over");
	}

}
