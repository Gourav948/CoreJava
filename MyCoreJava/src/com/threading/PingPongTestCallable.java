package com.threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class PingPongTestCallable
{
    
	public static void main(String[] args) throws InterruptedException, ExecutionException 
	{
	Callable <Integer> callable =new  Callable <Integer>()
    {
	
	@Override
	public Integer call() throws Exception
	{
			for (int i=0;i<20;i++)
			{
				try
				{
				System.out.println("PING");
				Thread.sleep(500);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		
		
      return 1;
	}
    };
    
    Callable <Integer> callable1 =new  Callable <Integer>()
    {
	
	@Override
	public Integer call() throws Exception
	{
			for (int i=0;i<20;i++)
			{
				try
				{
				System.out.println("\tPONG");
				Thread.sleep(500);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		
		
      return 2;
	}
    };
    Callable <Integer> callable2 =new  Callable <Integer>()
    {
	
	@Override
	public Integer call() throws Exception
	{
			for (int i=0;i<20;i++)
			{
				try
				{
				System.out.println("\t\tTONG");
				Thread.sleep(500);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		
		
      return 3;
	}
    };
    
		ExecutorService executorservice= Executors.newFixedThreadPool(2);
		Future <Integer> f=executorservice.submit(callable);
		Future <Integer> f1=executorservice.submit(callable1);
		Future <Integer> f2=executorservice.submit(callable2);

		System.out.println(f.get());
		System.out.println(f1.get());
		System.out.println(f2.get());

		executorservice.shutdown();
	}
}