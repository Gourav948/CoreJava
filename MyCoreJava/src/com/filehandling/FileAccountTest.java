package com.filehandling;

import java.io.*;

public class FileAccountTest {

	public static void main(String[] args) throws IOException 
	{
		File  file =new File("H:\\IBM FullStack Training\\COre java\\File\\Account.txt");
		FileOutputStream fos= new FileOutputStream(file,true);
		DataOutputStream dos =new DataOutputStream(fos);
		dos.writeInt(101);
		dos.writeDouble(1000.50);
		dos.writeUTF("Gourav");
		dos.writeInt(103);
		dos.writeDouble(100000.98);
		dos.writeUTF("Surendra");
		dos.writeInt(201);
		dos.writeDouble(2000.78);
		dos.writeUTF("Nikhil");
		dos.flush();
		fos.flush();
		dos.close();
		fos.close();
		FileInputStream fis= new FileInputStream(file);
		DataInputStream dis =new DataInputStream(fis);
		for(int i=0;i<3;i++)
		{
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
		System.out.println();
		}
		
		
	}

}
