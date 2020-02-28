package com.threading;


public class PingPongTest3  
{
	
	

	public static void main(String[] args) 
	{
		Runnable runnable = new Runnable ()
	   {    @Override
			public void run() 
			{
		   for (int i=0;i<20;i++)
			{
				try
				{
				System.out.println("PING");
				Thread.sleep(200);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			}
	    };
	  Runnable runnable1 = new Runnable ()
		{
				@Override
				public void run() 
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
		  };
	Thread t1= new Thread(runnable);
	Thread t2= new Thread(runnable1);
	t1.start();
	t2.start();
				
	}

	

}

