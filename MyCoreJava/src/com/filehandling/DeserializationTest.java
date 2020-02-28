package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.filehandling.SerializationExample.Account;

public class DeserializationTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("H:/IBM FullStack Training/COre java/File/Sonu.txt"));
        
        for (int i=0;i<2 ;i++ ) 
        {
             
        System.out.println((Account) objectInputStream.readObject());
   
   
        }
        objectInputStream.close();
	}

}
/*
 * When Changed Class Description Changed in serialVersion
 * 
 * Exception in thread "main" java.io.InvalidClassException: com.filehandling.SerializationExample$Account; local class incompatible: stream classdesc serialVersionUID = 1, local class serialVersionUID = 2
	at java.io.ObjectStreamClass.initNonProxy(Unknown Source)
	at java.io.ObjectInputStream.readNonProxyDesc(Unknown Source)
	at java.io.ObjectInputStream.readClassDesc(Unknown Source)
	at java.io.ObjectInputStream.readOrdinaryObject(Unknown Source)
	at java.io.ObjectInputStream.readObject0(Unknown Source)
	at java.io.ObjectInputStream.readObject(Unknown Source)
	at com.filehandling.DeserializationTest.main(DeserializationTest.java:19)
	
	When Changed Class Description
	
	A.Gourav-401-null-0.0-Date [day=19, month=5, year=2020]
    Surendra-201-null-0.0-Date [day=6, month=8, year=2020]
    
    Displays null value in the The Updated field

	
 */
