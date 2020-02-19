package com.exception;

import java.io.*;
class InsufficientBalanceException extends Exception
{
	private String message;
	InsufficientBalanceException ()
	{
		this.message="";
	}
	InsufficientBalanceException (String message)
	{
		this.message=message;
	}
	public String toString()
	{
		return "InsufficientBalance :"+message;
	}
}
class Account
{
	int balance ;
	Account ()
	{
		this.balance=0;
	}
	Account (int balance)
	{
		this.balance=balance;
	}
	public String withdraw(int amount) throws InsufficientBalanceException
	{
		if (balance<amount)
			throw new InsufficientBalanceException();
	   return "New balance"+balance;
	}
	
}
public class AccountTest {
	
	public static void main(String[] args) throws IOException
	{
		Account a =new Account (10000);
		Account b =new Account (5000);
		try {
			System.out.println(a.withdraw(6000));
			System.out.println(b.withdraw(10000));
		}
		catch( InsufficientBalanceException e)
		{
			e.printStackTrace();
		}
		finally
		{ 
			
			System.out.println("Exception handled");
			
		}

	}

}
