package com.filehandling;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class FileDetailTest {

	public static void main(String[] args) 
	{
		File  file =new File("H:\\IBM FullStack Training\\COre java\\File");
		File [] filelist =file.listFiles();
		DateFormat df = new SimpleDateFormat("dd:MM:yy   HH:mm:ss");
		for (int i=0;i<filelist.length;i++)
		{
			System.out.println("Name :"+filelist[i].getName());
			System.out.println("Date last modified :"+df.format(filelist[i].lastModified()));
			System.out.println("Total Size :"+filelist[i].length());
			System.out.println("File Permissions :");
			System.out.println("Can Read :"+filelist[i].canRead());
			System.out.println("Can Write :"+filelist[i].canWrite());
			System.out.println("File hidden :"+filelist[i].isHidden());
			System.out.println();
			System.out.println("Is Directory :"+filelist[i].isDirectory());
			System.out.println("Is File :"+filelist[i].isFile());
			System.out.println();
			System.out.println();
			
		}

	}

}
