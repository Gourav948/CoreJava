package com.threading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.awt.event.WindowAdapter;

@SuppressWarnings("serial")
public class OvalGameTest extends Frame 
{
	static int counter=0;
	static int y1 = 400, y2 = 400, y3 = 400;
	public OvalGameTest() 
	{
		super("Oval game");
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e) 
			{
				System.exit(0);
			}
		});
	}
		
	public void paint(Graphics g) 
	{
		g.setColor(Color.RED);
		g.fillOval(100, y1, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(200, y2, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(300, y3, 50, 50);
	}

	public static void main(String[] args) throws InterruptedException 
	{
		Frame mf = new OvalGame();
		mf.setSize(500, 500);
		mf.setVisible(true);
		OvalGameTest ogt=new OvalGameTest();
		boolean flag=false;
		boolean flag1=false;
		Thread t1;
		Thread t2;
		Thread t3;
		
		t1 =new Thread(new Runnable() {
			@Override
			public void run() 
			{
				while(true)
				{
				try
			   {
		          for (int i = y1; i >25; i-=3)				
		          {
		        	  y1=i;
		        	  ogt.repaint();
		        	  Thread.sleep(70);
		          }
		          counter++;
		          ogt.checkCounter();
		          for (int i = y1; i <400; i+=3)				
		          {
		        	  y1=i;
		        	  ogt.repaint();
		        	  Thread.sleep(70);
		          }
		          counter++;
		          ogt.checkCounter();
			   }
			  catch(InterruptedException e)
			    {
						e.printStackTrace();
				}
				}
			 }
		});
		
		 t2 =new Thread(new Runnable() {
			@Override
			public void run() 
			{
				while(true)
				{
				try
				   {
				   for (int i = y2; i >25; i-=3)				
			          {
			        	  y2=i;
			        	  ogt.repaint();
			        	  Thread.sleep(50);
			          }
				      counter++;
			          ogt.checkCounter();
				   
			          for (int i = y2; i <400; i+=3)				
			          {
			        	  y2=i;
			        	  ogt.repaint();
			        	  Thread.sleep(50);
			          }
			          counter++;
			          ogt.checkCounter();
				   }
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
		});
		
	 t3 =new Thread(new Runnable() {
			@Override
			public void run() 
			{
				while(true)
				{
				try
				{
					for (int i = y3; i >25; i-=3)				
						{
					       y3=i;
						   ogt.repaint();
						   Thread.sleep(25);
						}
					counter++;
			          ogt.checkCounter();
						
				     for (int i = y3; i <400; i+=3)				
					   {
				    	 y3=i;
				    	 ogt.repaint();
				    	 Thread.sleep(25);
					   }
				     counter++;
				     ogt.checkCounter();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				
				}
			}
		});
	
		t1.start();
		t2.start();
		t3.start();
				
	}
	
	/*synchronized void checkCounter()
	{
		if (counter ==3)
		{
			this.notifyAll();
			counter=0;
		}
		else
		{
			try
			{
			this.wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
	}*/
	
	ReentrantLock lock =new ReentrantLock();
	Condition condition= lock.newCondition();
	public void checkCounter()
	{
		
		lock.lock();
		try 
		{
			if (counter ==3)
			{
				condition.signalAll();
				counter=0;
			}
			else
			{
				try
				{
				condition.await();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				
			}
		}
		finally
		{
			lock.unlock();
		}
	}
	
}
