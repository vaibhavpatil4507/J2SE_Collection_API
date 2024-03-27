package com.file.methods;

import java.io.File;
import java.io.IOException;

public class Test {

public static void main(String[] args) throws IOException {
	File f=new File("sample.txt");
	System.out.println(f.createNewFile());
	
	File f2=new File("Demo");
	f2.mkdir();
	
	File f3=new File(f2,"demo1.pdf");
	f3.createNewFile();
	
	File f5=new File("D:\\FileHandlingDemo","test.txt");
	f5.createNewFile();
}
}
