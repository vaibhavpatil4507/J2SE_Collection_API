package com.file.methods;

import java.io.File;

public class FileConstructors {

	public static void main(String[] args) throws Exception {
		File f=new File("resume.doc");
		f.createNewFile();//here we are creating resume.docx file
		
		File f2=new File("Notes");
		f2.mkdir(); //here we are creating Notes folder/directory
		
		File f3=new File(f2,"core_java.txt");
		f3.createNewFile();//here we are creating core_java text file inside Noted directory
		
		File f4=new File("D:\\FileHandlingDemo","advance_java.txt");
		f4.createNewFile();//We creating advance_java file on different directory path
		
		
		
	}
}
