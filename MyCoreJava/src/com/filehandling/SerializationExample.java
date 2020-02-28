package com.filehandling;

import java.io.*;

public class SerializationExample 
{
	
	public static class Date implements Serializable
	{
		private static final long serialVersionUID= 1L;
		private int day;
		private int month;
		private int year;
		public Date(int day, int month, int year) 
		{
			super();
			this.day = day;
			this.month = month;
			this.year = year;
		}
		public Date() 
		{
			this.day = 10;
			this.month = 4;
			this.year = 2020;
		}
		@Override
		public String toString()
		{
			return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
		}
	}

    public static class Account implements Serializable 
    {
    	private static final long serialVersionUID= 1L;
    	
        public Account(String name, int id, double balance, String accType) {
			super();
			this.name = name;
			this.id = id;
			this.balance = balance;
			this.accType = accType;
		}
        

		public Account() 
		{
			super();
		}
		
		public String name              = null;
        public int    id                =    0;
        public transient double balance =    0;
        public String accType           ="";
        public Date date                = new Date(6,8,2020);
        
        @Override
        public String toString()
        {
			return this.name +"-"+this.id +/*"-"+this.accType+*/"-"+this.balance/* +"-" +this.date*/;
        	
        }


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public double getBalance() {
			return balance;
		}


		public void setBalance(double balance) {
			this.balance = balance;
		}


		/*public String getAccType() {
			return accType;
		}


		public void setAccType(String accType) {
			this.accType = accType;
		}*/
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException 
    {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("H:/IBM FullStack Training/COre java/File/Sonu.txt"));

        Account acc = new Account();
        acc.name   = "A.Gourav";
        acc.id     = 401;
        acc.balance= 10000;
        acc.accType="Savings";
        //acc.date=new Date(20,02,2020);

        Account acc1 = new Account();
        acc1.name   = "Surendra";
        acc1.id     = 201;
        acc1.balance= 20000.89;
        acc1.accType="Current";
        //acc.date=new Date(19,05,2020);

        objectOutputStream.writeObject(acc);
        objectOutputStream.writeObject(acc1);
        objectOutputStream.close();


       /* ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("H:/IBM FullStack Training/COre java/File/Sonu.txt"));
         
        for (int i=0;i<2 ;i++ ) 
        {
             
        System.out.println((Account) objectInputStream.readObject());
   
   
        }
        objectInputStream.close();*/
    }
}


/*
 * ERROR THROW WHEN DATE NOT SERIALIZED
 * (like Shallow Copy we have to  Serialize date Also)
 * 
 * Exception in thread "main" java.io.NotSerializableException: com.filehandling.SerializationExample$Date
	at java.io.ObjectOutputStream.writeObject0(Unknown Source)
	at java.io.ObjectOutputStream.defaultWriteFields(Unknown Source)
	at java.io.ObjectOutputStream.writeSerialData(Unknown Source)
	at java.io.ObjectOutputStream.writeOrdinaryObject(Unknown Source)
	at java.io.ObjectOutputStream.writeObject0(Unknown Source)
	at java.io.ObjectOutputStream.writeObject(Unknown Source)
	at com.filehandling.SerializationExample.main(SerializationExample.java:64)

 */
