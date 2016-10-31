package com.ashishsrivastava.blog.nio;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FilePathInfo {

	public static void main(String[] args) throws IOException {

		File file = new File("/Users/debugfactory/json");
		
		System.out.println("Absolute path = " + file.getAbsolutePath());
		System.out.println("Canonical path = " + file.getCanonicalPath());
		System.out.println("File Name = " + file.getName());
		System.out.println("File Parent = " + file.getParent());
		System.out.println("File Path = " + file.getPath());
		System.out.println("Is File Absolute = " + file.isAbsolute());
		System.out.println("Is File Exists = " + file.exists());
		System.out.println("Is Directory = " + file.isDirectory());
		System.out.println("Is File = " + file.isFile());
		System.out.println("Is Hidden = " + file.isHidden());
		System.out.println("Last Modified = " + new Date(file.lastModified()));
		System.out.println("Length = " + file.length());
	}
}
