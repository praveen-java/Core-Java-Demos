package com.fileoperationsdemo;

import java.io.File;

public class ShowListOfFiles {

	public static void main(String[] args) {
		System.out.println("This is to list all files.");
		File file = new File("D:\\books");
		/*String[] stringList = file.list();
		for(String s : stringList){
			System.out.println(s);
		}*/
		File[]	listFiles = file.listFiles();
		for(File f:listFiles){
			System.out.println(f.getName());
		}
		
	}

}
