package com.lambda;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;

public class ThreadPrint 
{

	public static void main(String[] args) 
	{
		Random random = new Random();
		ArrayList<Integer> arr =new ArrayList<Integer>(); 
		for(int i=0;i<20;i++) 
		{
			arr.add(random.nextInt(200));
		}
		Consumer<ArrayList<Integer>> c=(ArrayList<Integer> i)-> { 
			for(Integer n:i)
				System.out.println(n);
		};
		
		Runnable run =()->{c.accept(arr);};
		new Thread(run).start();
	}

}


/*
 *
OUTPUT:
113
21
11
132
96
51
84
132
57
117
34
173
97
15
132
178
78
36
181
42
 * 
 */