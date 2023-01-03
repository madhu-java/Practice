package com.madhu.IO;

import java.io.File;
import java.io.IOException;

public class Createafile {

	public static void main(String[] args) throws IOException {
		String fileName= "abc.txt";
		File file = new File(fileName);
		System.out.println(file.exists());
		file.createNewFile();
		System.out.println(file.exists());
		String directoryName= "ABC.txt";
		
		File file1 = new File(directoryName);
		System.out.println(file1.exists());
		file1.mkdir();
		System.out.println(file1.exists());

	}

}
