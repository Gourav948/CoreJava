package com.threading;

public class PingPongTest implements Runnable 
{
	
	@Override
	public void run() 
	{
		Thread currentThread = Thread.currentThread();
		if (currentThread.getName().equalsIgnoreCase("Ping"))
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
		}
		else if (currentThread.getName().equalsIgnoreCase("Pong"))
		{
			for (int i=0;i<20;i++)
			{
				try
				{
				System.out.println("\tPONG");
				Thread.sleep(200);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
		
	}

	public static void main(String[] args) 
	{
		Thread t1 = new Thread (new PingPongTest());
		Thread t2 = new Thread (new PingPongTest());
		t1.setName("PING");
		t2.setName("PONG");
        t1.start();
        t2.start();
	}

	

}
