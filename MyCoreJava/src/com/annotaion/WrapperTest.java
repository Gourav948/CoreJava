package com.annotaion;

class WrapperTest
{
	public static void main(String[] args) 
	{
		int a[] =new int[args.length];
		for (int i=0;i<args.length ;i++ ) 
		{
			a[i]=Integer.parseInt(args[i]);
		}
		for (int i =0;i<a.length-1;i++ ) 
		{
		  for (int j=i+1;j<a.length ;j++) 
		  {
		  	if (a[i]>a[j]) 
		  	{
		  		int temp=a[i];
                a[i]=a[j];
              	a[j]=temp;	  		
		  	}
		  		
		  	}	
		}
		for (int i=0;i<a.length ;i++ ) 
		{
			System.out.print(a[i]+" ");
		}
		
	}
}


/*
OUTPUT:
H:\IBM FullStack Training\COre java>javac WrapperTest.java

H:\IBM FullStack Training\COre java>java WrapperTest 2 6 13 4 8 1 34
1 2 4 6 8 13 34

*/