package com.filehandling;

import java.io.*;
import java.util.*;


public class FileSequenceTest {

	@SuppressWarnings({"rawtypes","unchecked"})
	public static void main(String[] args) throws IOException 
	{
		File  file =new File("H:\\IBM FullStack Training\\COre java\\File\\abc.txt");
		FileInputStream fis= new FileInputStream(file);
		
		File  file1 =new File("H:\\IBM FullStack Training\\COre java\\File\\pqr.txt");
		FileInputStream fis1= new FileInputStream(file1);
		
		File  file2=new File("H:\\IBM FullStack Training\\COre java\\File\\account.txt");
		FileInputStream fis2= new FileInputStream(file2);
		
		Vector v = new Vector();
		v.add(fis);
		v.add(fis1);
		v.add(fis2);
		
		Enumeration e =v.elements();
		
		SequenceInputStream sis=new SequenceInputStream(e);
		
		int i;
		while((i=sis.read())!=-1)
		{
		   System.out.print((char)i);
		}
		sis.close();
		fis.close();
		fis1.close();
		fis2.close();
	}

}
