package com.threading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class OvalGameTest1 extends Frame 
{

	static int y1 = 400, y2 = 400, y3 = 400;
	public OvalGameTest1() 
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
	public void upwardMovement(int x) throws InterruptedException
	{
		OvalGameTest1 ogt=new OvalGameTest1();
		if (x==y1)
		{
			System.out.println("Hii1");
		for (int i = y1; i >25; i--) 
		 {
			y1=i;
			ogt.repaint();
			Thread.sleep(75);
		 }
		}
		else if (x==y2)
		{
			System.out.println("hello1");
		for (int i = y2; i >25; i--) 
		 {
			y2=i;
			ogt.repaint();
			Thread.sleep(50);
		 }
		}
		if (x==y3)
		{
			System.out.println("Byee1");
		for (int i = y3; i >25; i--) 
		 {
			y3=i;
			ogt.repaint();
			Thread.sleep(25);
		 }
		}
	}
	public  void downwardMovement(int x) throws InterruptedException
	{
		OvalGameTest1 ogt=new OvalGameTest1();
		if (x==y1)
		{
			 System.out.println("Hii");
		  for (int i = y1; i <400; i+=3)				
          {
			 
      	    y1=i;
      	    ogt.repaint();
      	  Thread.sleep(75);
          }
		}
		else if (x==y2)
		{
			System.out.println("Hello");
		  for (int i = y2; i <400; i+=3)				
          {
      	    y2=i;
      	    ogt.repaint();
      	  Thread.sleep(50);
          }
		}
		else if (x==y3)
		{
			System.out.println("Byee");
		  for (int i = y3; i <400; i+=3)				
          {
      	    y3=i;
      	    ogt.repaint();
      	  Thread.sleep(25);
          }
		}
	}
	public static void main(String[] args) throws InterruptedException 
	{
		Frame mf = new OvalGame();
		mf.setSize(500, 500);
		mf.setVisible(true);
		OvalGameTest1 ogt=new OvalGameTest1();
		
		Thread t1 =new Thread(new Runnable() 
		{
			@Override
			public void run() 
			{
				try
			   {
		          ogt.upwardMovement(y1);
				  
			   }
			  catch(InterruptedException e)
			    {
						e.printStackTrace();
				}
			 }
		});
		
		Thread t2 =new Thread(new Runnable() {
			@Override
			public void run() 
			{
				try
				   {
					
					  ogt.upwardMovement(y2);  
					
				   }
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
			}
		});
		
		Thread t3 =new Thread(new Runnable() {
			@Override
			public void run() 
			{
				try
				{
					ogt.upwardMovement(y3);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		});
	
		t1.start();
		t2.start();
		t3.start();
				
	}
	
}
