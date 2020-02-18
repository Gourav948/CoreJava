package com.annotaion;

class StackedArray
{
	private int [] ary= new int[5];
    int top=-1;
 	public void push(int n)
	{
		if (top<5)
		{
		top++;
		ary[top]=n;
	    }
	    else
	    {
	    	System.out.println("Overflow");
	    }
	}
	public int pop()
	{
		int data=0;
		if (top<0)
		{
          System.out.println("Underflow");
		}
		else
		{
		   data=ary[top];
           top--;
		}	
		return data;
	}
	public void show()
	{
		for (int i=0;i<=top;i++)
		{
			System.out.print(ary[i]+" ");
		}
		System.out.println();
	}
}
class StackedArrayTest
{
	public static void main(String[] args) 
	{
		
	
	StackedArray a=new StackedArray();
	a.push(10);
	a.show();
	a.push(20);
	a.show();
    a.push(30);
    a.show();
    System.out.println(a.pop()+" Value poped");
    a.show();
    a.push(40);
    a.show();
    a.push(50);
    a.show();
    System.out.println(a.pop()+" Value poped");
    a.show();
}
}
/*

OUTPUT

H:\IBM FullStack Training\COre java>javac StackedArrayTest.java

H:\IBM FullStack Training\COre java>java StackedArrayTest
10
10 20
10 20 30
30 Value poped
10 20
10 20 40
10 20 40 50
50 Value poped
10 20 40

*/