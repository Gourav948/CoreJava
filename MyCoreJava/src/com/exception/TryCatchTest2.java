package com.exception;

import java.util.Scanner;

public class TryCatchTest2 {
	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter values a string");
	    String x=sc.nextLine();
	 
		try {
			int a=Integer.parseInt(x);
		}
		catch(NumberFormatException e)
		{
			System.out.println("handled by NumberFoormatException");
			e.printStackTrace();
		}
		catch (Exception e)
		{
			System.out.println("handled by Exception");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Has to Execute");
		}

	}

}
