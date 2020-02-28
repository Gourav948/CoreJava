package com.threading;


public class PingPongTest4  
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread ()
	{
			@Override
			public void run() 
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
	  };
	  Thread t2 = new Thread ()
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

	t1.start();
	t2.start();
				
	}

	

}

