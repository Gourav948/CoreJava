package com.exception;

import java.io.*;

class CustomAutoClosable implements AutoCloseable
{ int value;
    void setValue(int value)
    {
    	if (value<0)
    		throw new ArrayIndexOutOfBoundsException();
    	else
    	this.value=value;
    }
    int getValue()
    {
    	return this.value;
    }
	@Override
	public void close() throws Exception {
		System.out.println("Resources Closed");
		
	}
	
}

public class TryResourceTest {

	public static void main(String[] args) throws Exception 
	{
		
		
		try(CustomAutoClosable a=new CustomAutoClosable())
		{
			a.setValue(-10);
			System.out.println("Value = "+a.getValue());
			
		}
		catch (ArithmeticException e)
		{
			System.out.println("handled by ArithmaticException");
			e.printStackTrace();
		}
		catch (Exception e)
		{
			System.out.println("handled by Exception");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally Executed");
		}

	}

}
