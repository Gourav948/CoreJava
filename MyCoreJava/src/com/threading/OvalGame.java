package com.threading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class OvalGame extends Frame 
{

	int y1 = 400, y2 = 400, y3 = 400;
	public OvalGame() 
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

	public static void main(String[] args) 
	{
		Frame mf = new OvalGame();
		mf.setSize(500, 500);
		mf.setVisible(true);
		OvalTest ot=new OvalTest();
	}
	
}
class OvalTest extends OvalGame implements Runnable
{
    OvalTest()
    {
    	Thread t1 = new Thread(this);
		Thread t2 = new Thread(this);
		Thread t3=new Thread (this);
		t1.setName("RED");
		t2.setName("GREEN");
		t3.setName("BLUE");
		t1.start(); 
		t2.start(); 
		t3.start();
    	
    }

	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		if (currentThread.getName().equalsIgnoreCase("RED"))
		{
			try
		   {
			while(true)
			 {
	          for (int i = y1; i >25; i-=3)				
	          {
	        	  y1=i;
	        	  repaint();
	        	  Thread.sleep(70);
	          }
	          for (int i = y1; i <400; i+=3)				
	          {
	        	  y1=i;
	        	  repaint();
	        	  Thread.sleep(70);
	          }
			}
		   }
		  catch(InterruptedException e)
		    {
					e.printStackTrace();
			}
		 }
		
		if (currentThread.getName().equalsIgnoreCase("GREEN"))
		{
			try
			   {
				while(true)
				 {
		          for (int i = y2; i >25; i-=3)				
		          {
		        	  y2=i;
		        	  repaint();
		        	  Thread.sleep(50);
		          }
		          for (int i = y2; i <400; i+=3)				
		          {
		        	  y2=i;
		        	  repaint();
		        	  Thread.sleep(50);
		          }
				}
			   }
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		
		if (currentThread.getName().equalsIgnoreCase("BLUE"))
		{
				try
				{
					while(true)
					{
			     for (int i = y3; i >25; i-=3)				
			   {
			    y3=i;
				repaint();
				Thread.sleep(25);
				}
			     for (int i = y3; i <400; i+=3)				
				   {
				    y3=i;
					repaint();
					Thread.sleep(25);
					}
					}
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			
		}
	}
}