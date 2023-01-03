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
		System.out.println("is f1 a File:"+f1.isFile());
		//creating a file in a directory
		File f2 = new File(f1,"fil12.txt");
		f2.createNewFile();
		System.out.println("is f2 a directoty:"+f2.isDirectory());
		System.out.println("is f2 a File:"+f2.isFile());
		
		//crete  a directory at a specified location
		String location = "C:\\Users\\madha\\Desktop\\JAVAT\\Basics\\files";
		File f3 = new File(location);
		f3.mkdir();
		File f4= new File(f3,"java.txt");
		f4.createNewFile();
		
		

	}

}
