package com.threading;

public class ThreadGroupTest {

	public static void main(String[] args)
	{
		 ThreadGroup threadGroup= new ThreadGroup("GouravThreads");
		Thread t1 = new Thread (threadGroup,"PING")
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
		  Thread t2 = new Thread (threadGroup,"PONG")
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
			  Thread t3 = new Thread (threadGroup,"TONG")
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
		System.out.println("Thread Group Name: "+threadGroup.getName());  
		threadGroup.list();
		

	}

}
