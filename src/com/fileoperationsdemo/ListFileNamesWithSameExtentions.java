package com.fileoperationsdemo;

import java.io.File;
import java.io.FilenameFilter;

public class ListFileNamesWithSameExtentions {

	public static void main(String[] args) {
		File file = new File("D:/books/");

		String[] listFiles = file.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				if (name.toLowerCase().endsWith(".pdf"))
					return true;
				else
					return false;
			}
		});
		for(String s : listFiles){
			System.out.println(s);
		}
	}

}
