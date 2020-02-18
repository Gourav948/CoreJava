package com.annotaion;

class QueuedArray
{
	int ary [] =new int[5];
	int f=-1;
	int r=-1;
	public void push(int n)
	{
		if (r==4)
		{
			System.out.println("Overflow");
		}
		else if (r==-1)
		{
          r++;
          f++;
          ary[r]=n;
		}
		else
		{
			r++;
			ary[r]=n;
		}
	}
	public int pop()
	{
		int data=0;
		if (r==-1 & f==-1)
		{
			System.out.println("Underflow");
		}
		else if(r==f)
		{
			data= ary[r];
            r=-1;
            f=-1;
		}
		else
		{
			data=ary[f];
			f++;
		}
     return data;
	}
	public void show()
	{
		if (r==-1)
			System.out.println("Underflow");
		else
		{
			for (int i=f;i<=r ;i++ ) 
			{

				System.out.print(ary[i]+" ");
			}
			System.out.println();
		}
	}

}
class QueuedArrayTest
{
	public static void main(String[] args) 
	{
		QueuedArray a =new QueuedArray();
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
OUTPUT:
H:\IBM FullStack Training\COre java>javac QueuedArrayTest.java

H:\IBM FullStack Training\COre java>java QueuedArrayTest
10
10 20
10 20 30
10 Value poped
20 30
20 30 40
20 30 40 50
20 Value poped
30 40 50
*/