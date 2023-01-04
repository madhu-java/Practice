package com.madhu.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {

	public static void main(String[] args) throws IOException {

FileWriter f1= new FileWriter("file1.txt");
File f2= new File("file2.txt");
FileWriter f3 = new FileWriter(f2);
f3.write(97);
f3.write("hello how are you?");
char[] ch = {'M','A','D','h','U'};
f3.write(ch);
System.out.println("open the file and see");

	}

}
