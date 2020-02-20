package com.filehandling;

import java.io.*;


public class FileTest {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		File file =new File("H:/IBM FullStack Training/COre java/File/abc.txt");
		FileInputStream fis= new FileInputStream(file);
		StringBuilder sb =new StringBuilder("");
		int i;
		do
		{
			 i=fis.read();
			if(i!=-1)
				sb.append((char)i);
		}while(i!=-1);
		fis.close();
		File file1 =new File("H:/IBM FullStack Training/COre java/File/pqr.txt");
		FileOutputStream fos= new FileOutputStream(file1,true);
		String s=sb.toString();
		fos.write(s.getBytes());
		fos.flush();
		fos.close();
	}

}
