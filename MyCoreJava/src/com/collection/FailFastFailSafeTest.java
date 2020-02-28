package com.collection;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafeTest 
{
 public static CopyOnWriteArrayList<Integer> arr=new CopyOnWriteArrayList<Integer>();
  
	public static void main(String[] args) 
	{
	  Scanner sc =new Scanner(System.in);
       
	  Thread t1 =new Thread ()
       {
				@Override
				public void run() 
				{
					try 
					{
					    arr.add(100);
						arr.add(200);
						arr.add(300);
						Thread.sleep(50);
					} 
				catch (InterruptedException e) 
				{
						e.printStackTrace();
					}
				}
    		   };
       Thread t2 =new Thread ()
	   {
		@Override
		public void run() 
		{
			for (Integer i:arr) 
			{
				try 
				{
					System.out.println(i);
					Thread.sleep(50);
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
/*
 * OUTPUT:
 * 
 * While using ArrayLis<Integer>
 * 
 * Exception in thread "Thread-1" java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
	at java.util.ArrayList$Itr.next(Unknown Source)
	at com.collection.FailFastFailSafeTest$2.run(FailFastFailSafeTest.java:39)

 */
