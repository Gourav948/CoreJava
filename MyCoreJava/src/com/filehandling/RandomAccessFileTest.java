package com.filehandling;

import java.io.*;

import com.filehandling.SerializationExample.Account;

@SuppressWarnings("serial")
class AccountRecord extends Account
{
	public static final int SIZE =
		      Integer.BYTES + (2 * (Character.BYTES * 5))+Double.BYTES ;
		   public AccountRecord() 
		   {
		      this("",0,0D,"");
		   }
		   public AccountRecord(String name, int id,double balance, String accType) 
		   {
		      super(name, id, balance, accType);
		   }

		   public void readFromFile(RandomAccessFile file)
		      throws IOException {
			  setName(readString(file));
		      setId(file.readInt());
		      setBalance(file.readInt());
		   }

		   public void writeToFile(RandomAccessFile file)
		      throws IOException {
			   writeString(file,getName());
		      file.writeInt(getId());
		      file.writeDouble(getBalance());
		      
		   }
		   private String readString(RandomAccessFile file)throws IOException 
		   {     char[] s = new char[5];
				      for (int i = 0; i < s.length-1; i++)
				         s[i] = file.readChar();
				      return new String(s).replace('\0',' ');
		   }
		   private void writeString(RandomAccessFile file, String s) throws IOException 
		   {
				      StringBuffer buffer = null;
				      if (s != null)
				         buffer = new StringBuffer(s);
				      else
				         buffer = new StringBuffer(15);
				         buffer.setLength(15);
				         file.writeChars(buffer.toString());
				  }

		   
		   @Override
		   public String toString()
		   {
			   return super.toString();
		   }
}
 class FileDatabase 
 {
	   RandomAccessFile file;
       public FileDatabase(String fileString) throws IOException 
          {
    	      file = new RandomAccessFile(fileString, "rw");
    	   }

	   public void close() throws IOException 
	   {
	      if (file != null)
	         file.close();
	   }

	   public AccountRecord getRecord(int id) throws IOException {
		   AccountRecord record = new AccountRecord();
	      if (id < 1)
	         throw new IllegalArgumentException("invalid ID!!");
	         file.seek((id - 1) * AccountRecord.SIZE);
	         record.readFromFile(file);
	         return record;
	   }

	   public void insertRecord(AccountRecord record)
	         throws IllegalArgumentException, IOException {
	      if (getRecord(record.getId()).getId() != 0)
	         System.out.println("Cannot add new Record already exists.");
	      else
	      {
	         file.seek((record.getId() - 1) * AccountRecord.SIZE);
	         record.writeToFile(file);
	      }
	   }

	   public void updateRecord(AccountRecord record)
	         throws IllegalArgumentException, IOException {
	      if (getRecord(record.getId()).getId() == 0)
	         System.out.println("Cannot update Record does not exist.");
	      else {
	         file.seek((record.getId() - 1) * AccountRecord.SIZE);
	         record.writeToFile(file);
	      }
	   }

	   public void deleteRecord(AccountRecord record)
	         throws IllegalArgumentException, IOException {
	      if (getRecord(record.getId()).getId() == 0)
	         System.out.println("Cannot delete Record does not exist.");
	      else {
	         file.seek((record.getId() - 1) * AccountRecord.SIZE);
	         record = new AccountRecord();
	         record.writeToFile(file);
	      }
	   }

	   public void showAllRecords() 
	   {
		   AccountRecord record = new AccountRecord();
	      try 
	      {
	         file.seek(0);
	         while (true)
	        {
	            do 
	            {
	               record.readFromFile(file);
	            } while (record.getId() == 0);
	            System.out.println(record.toString());
	        }
	      } 
	      catch (EOFException ex1)
	      {
	         return;
	      } 
	      catch (IOException ex2) 
	      {
	         System.err.println("error reading file");
	      }
	   }
	}
public class RandomAccessFileTest 
{
	public static void main(String[] args) throws IOException
	{
		FileDatabase fe = new FileDatabase ("H:\\IBM FullStack Training\\Account Record.txt");
		  fe.insertRecord(new AccountRecord("Goura",101,10000,"Savin"));
		  fe.insertRecord(new AccountRecord("Suren",501,50000,"Savin"));
		  fe.insertRecord(new AccountRecord("Snigd",301,25000,"Curre"));
		  fe.insertRecord(new AccountRecord("Nikhi",201,99000,"Savin"));
		  fe.insertRecord(new AccountRecord("Ajay",901,60000,"Curre"));
		  fe.showAllRecords();
		  fe.updateRecord(new AccountRecord("Vijay",901,90000,"Savin"));
		  fe.showAllRecords();
		  fe.deleteRecord(new AccountRecord("Snigd",301,25000,"Curre"));
		  fe.showAllRecords();
	      fe.close();
	}

}
