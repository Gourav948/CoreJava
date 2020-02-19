package com.exception;

import java.util.Scanner;

public class TryCatchTest {
	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter values of x and y");
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    int a[]=new int[5];
		try {
			int i=x/y;
			System.out.println("Divison :"+i);
			 a[6]=10;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}*/
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
