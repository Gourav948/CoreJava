package com.threading;


public class DaemonTest  
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
		  Thread t3 = new Thread ()
			{
					@Override
					public void run() 
					{
						for ( ;;)
							{
								try
								{
								System.out.println("\t\tTONG");
								Thread.sleep(100);
								}
								catch(InterruptedException e)
								{
									e.printStackTrace();
								}
							}
					}
			  };
    t3.setDaemon(true);
	t1.start();
	t2.start();
	t3.start();
				
	}

	

}

