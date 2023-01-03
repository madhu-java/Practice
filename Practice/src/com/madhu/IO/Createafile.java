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
		File f1= new File("Dir");
		f1.mkdir();
		System.out.println("is f1 a directoty:"+f1.isDirectory());
		//creating a file in a directory
		File f2 = new File(f1,"fil12.txt");
		System.out.println("is f1 a directoty:"+f2.isDirectory());
		

	}

}
