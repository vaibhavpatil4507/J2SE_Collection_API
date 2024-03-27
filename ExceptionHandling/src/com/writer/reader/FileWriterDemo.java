package com.writer.reader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args)throws Exception {
		File file1=new File("javascript.txt");
		if(!file1.exists()) {
			file1.createNewFile();
		}
		FileWriter file=new FileWriter(file1,true);
		file.write("Hii Hello How are you!");
		file.write("\n");
		file.flush();
		file.close();
		
			
//		FileWriter f=new FileWriter("typescript.txt",true);
//		f.write('A');
//		f.write(66);
//		f.write("\n");
//		f.write("typscript is well typed language");
//		f.write("\n");
//		char[] ch= {'p','q','r','s','t','w'};
//		f.write(ch);
//		f.write("\n");
//		f.flush();
//		f.close();
		
//		FileReader fr=new FileReader("typescript.txt");
//		int ch1=fr.read();
//		while(ch1!=-1) {
//			System.out.print((char)ch1);
//			ch1=fr.read();
		//}fr.close}
		
		FileReader fr=new FileReader(file1);

		char[] data=new char[(int)file1.length()];
		fr.read(data);
		fr.close();
		
		for(char ch1:data) {
			System.out.print(ch1);
		}
	
		fr.close();
	}
}
