package com.fileoperationsdemo;

import java.io.File;

public class FileIODemo {

	public static void main(String[] args) {
		System.out.println("This is to demo file operations.");
		
		try {
			File file = new File("MyNewFile.txt");
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.createNewFile());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.lastModified());
			System.out.println(file.length());
			System.out.println(file.exists());
			System.out.println(file.isFile());
			System.out.println(file.isDirectory());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getCanonicalPath());
			System.out.println(file.delete());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
