package com.collection;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeTest 
{

  
	public static void main(String[] args) 
	{
		Map<Integer,Integer> arr=new HashMap<Integer,Integer>();
	  Scanner sc =new Scanner(System.in);
       
	  Thread t1 =new Thread ()
       {
				@Override
				public void run() 
				{
					
						for(int i=0;i<10;i++)
						{
							arr.put(i,i);
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					} 
				
    		   };
       Thread t2 =new Thread ()
	   {
		@Override
		public void run() 
		{
			Iterator a=arr.keySet().iterator();
				
					while(a.hasNext())
					{
					System.out.println(a.next());
					
					System.out.println(arr.get(a));
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
