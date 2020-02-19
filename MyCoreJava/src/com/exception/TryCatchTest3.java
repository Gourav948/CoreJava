package com.exception;

import java.io.*;

public class TryCatchTest3 {
	
	public static void main(String[] args) throws IOException
	{
		
		try {
			FileInputStream input = new FileInputStream("file.txt");
			int data = input.read();
			while(data != -1)
			{
			System.out.print((char) data);
			data = input.read();
			}
		}
		/*catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}*/
		finally
		{
			System.out.print("Exception Not handled File Closed");
			
		}

	}

}
