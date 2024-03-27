package com.file.methods;

import java.io.File;

public class FileMethods {

	public static void main(String[] args) throws Exception {
		String rootpath = "D:\\FileHandlingDemo";

		// 1]
		File f = new File("policeBaratiForm.pdf");
		if (!f.exists()) {
			f.createNewFile();
		} else {
			System.out.println("File is alredy exist");
		}

		// 2]
		System.out.println(f.isFile());

		// 3]
		System.out.println(f.isDirectory());

		// 4]
		File f1 = new File(rootpath);
		if (f1.exists() && f1.isDirectory()) {
			String[] data = f1.list();
			System.out.println("length of data=" + data.length);

//			if(data != null && data.length>0) {
//				for(String name:data) {
//					File file=new File(f1,name);
//					System.out.println(name+"  is file="+file.isFile());
//						
//				}
//			}

			for (String value : data) {
				System.out.println(value);
			}

			// 5]
			File f5 = new File("sample.txt");
			if (f5.exists()) {
				f5.delete();
			}

		}
	}
}
