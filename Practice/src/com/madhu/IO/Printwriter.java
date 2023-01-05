package com.madhu.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Printwriter {

	public static void main(String[] args) throws IOException {

FileWriter fw= new FileWriter("file1.txt");
PrintWriter pr= new PrintWriter(fw);
pr.write(100);
pr.write("\n");
pr.println(100);
pr.println(200);
pr.println(300);



	}

}
