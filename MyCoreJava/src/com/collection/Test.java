package com.collection;

import java.util.HashMap; 
import java.util.Iterator; 
import java.util.Map; 
  
public class Test { 
    public static void main(String[] args) 
    { 
        Map<String, String> cityCode = new HashMap<String, String>(); 
       
        Thread t1 =new Thread ()
        {
 				@Override
 				public void run() 
 				{
 				cityCode.put("Delhi", "India"); 
 				cityCode.put("Moscow", "Russia"); 
 				cityCode.put("New York", "USA");
 				}
        };
  
        Thread t2 =new Thread ()
 	   {
 		@Override
 		public void run() 
 		{
        Iterator iterator = cityCode.keySet().iterator(); 
  
        while (iterator.hasNext()) { 
            System.out.println(cityCode.get(iterator.next())); 
  
            // adding an element to Map 
            // exception will be thrown on next call 
            // of next() method. 
            cityCode.put("Istanbul", "Turkey"); 
        }
 		}
 	   };
 	   t1.start();
 	   t2.start();
    } 
} 