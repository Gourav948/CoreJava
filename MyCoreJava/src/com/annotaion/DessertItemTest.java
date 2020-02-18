package com.annotaion;

import java.util.*;

abstract class DessertItem
{
	 int price;
	 int item;
	abstract int getCost();
	abstract int getItem();
}
class Candy extends DessertItem
{
    public Candy(int price)
	{
	this.price=price;
    }
	public int getCost()
	{
		return (this.price)*60;
	}
	public int getItem()
	{
		return this.item;
	}
		
}
class Cookie extends DessertItem
{
	public Cookie(int price)
	{
	this.price=price;
    }
	public int getCost()
	{
		return (this.price)*70;
	}
	public int getItem()
	{
		return this.item;
	}
	

}
class IceCream extends DessertItem
{
	public IceCream(int price)
	{
	this.price=price;
    }
	public int getCost()
	{
		return this.price;
	}
	public int getItem()
	{
		return this.item;
	}
}
class DessertItemTest
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		DessertItem d [] =new DessertItem[3];
			d[0]= new Candy(2);  // initialising with Price of each item
			d[1]=new Cookie(3);
			d[2]=new IceCream(50);
        int m=0;
        while (m==0)
        {
			System.out.println("Enter 0 for Owner 1 for Customer");
			int n=sc.nextInt();
			if (n==0)
			{	
				
				System.out.println("Enter no Of Candies bought");
				d[0].item+=(sc.nextInt());
				System.out.println("Enter no Of Cookies bought");
				d[1].item+=(sc.nextInt());
				System.out.println("Enter no Of IceCreams bought");
				d[2].item+=(sc.nextInt());    

				
				System.out.println("Updated List:");
				System.out.println("No Of Candy ="+d[0].getItem());
				System.out.println("No Of Cookies ="+d[1].getItem());
				System.out.println("No Of IceCreams ="+d[2].getItem());

			}
			else if (n==1)
			{
				int bill=0;
			    double gst=0.04;
                int i=0;
				while(i==0)
				{
					System.out.println("Enter 1 for Candy 2 for Cookie or 3 for IceCream");
			        int sw=sc.nextInt();
			        switch(sw)
			        {
	        			case 1:
			        			System.out.println("Enter No of Candies");
			        			int a=sc.nextInt();
			        			if (a<=d[0].getItem())
			        			{
			                       bill+=(d[0].getCost()*a);
			                       d[0].item-=a;//Reducing the amount
			        			}
			        			else
			        			{
			        				System.out.println("Sorry! Not in Stock");
			        			}
			        			break;   
	        			case 2:
			        			System.out.println("Enter No of Cookies");
			        			int b=sc.nextInt();
			        			if (b<=d[1].getItem())
			        			{
			                       bill+=(d[1].getCost()*b);
			                       d[1].item-=b;//Reducing the amount
			        			}
			        			else
			        			{
			        				System.out.println("Sorry! Not in Stock");
			        			}
			        			break;  
			        	case 3:
			        			System.out.println("Enter No of IceCreams");
			        			int c=sc.nextInt();
			        			if (c<=d[2].getItem())
			        			{
			                       bill+=(d[2].getCost()*c);
			                       d[2].item-=c;//Reducing the amount
			        			}
			        			else
			        			{
			        				System.out.println("Sorry! Not in Stock");
			        			}
			        			break;
			        	default:
			        	       System.out.println("Wrong Choice of item");
			        	       break;		
	  		        }
					System.out.println("Enter 0 is you want to purchase More Else any other to exit");
					i=sc.nextInt();
				}
				System.out.println("Total Bill with GST = Rs"+ (bill+gst*bill));
				System.out.println("First Pay then Eat");

				System.out.println("Updated List:");
				System.out.println("No Of Candy ="+d[0].getItem());
				System.out.println("No Of Cookies ="+d[1].getItem());
				System.out.println("No Of IceCreams ="+d[2].getItem());
			}
			else
			{
				System.out.println("Wrong Choice");
			}
			System.out.println("If you have to place an order or add the Item press 0 to continue else exit");
			m=sc.nextInt();
		}
	}
}

/*
OUTPUT:
H:\IBM FullStack Training\COre java>javac DessertItemTest.java

H:\IBM FullStack Training\COre java>java DessertItemTest
Enter 0 for Owner 1 for Customer
0
Enter no Of Candies bought
7
Enter no Of Cookies bought
3
Enter no Of IceCreams bought
8
Updated List:
No Of Candy =7
No Of Cookies =3
No Of IceCreams =8
If you have to place an order or add the Item press 0 to continue else exit
0
Enter 0 for Owner 1 for Customer
0
Enter no Of Candies bought
3
Enter no Of Cookies bought
0
Enter no Of IceCreams bought
9
Updated List:
No Of Candy =10
No Of Cookies =3
No Of IceCreams =17
If you have to place an order or add the Item press 0 to continue else exit
0
Enter 0 for Owner 1 for Customer
1
Enter 1 for Candy 2 for Cookie or 3 for IceCream
2
Enter No of Cookies
4
Sorry! Not in Stock
Enter 0 is you want to purchase More Else any other to exit
0
Enter 1 for Candy 2 for Cookie or 3 for IceCream
2
Enter No of Cookies
2
Enter 0 is you want to purchase More Else any other to exit
0
Enter 1 for Candy 2 for Cookie or 3 for IceCream
1
Enter No of Candies
5
Enter 0 is you want to purchase More Else any other to exit
0
Enter 1 for Candy 2 for Cookie or 3 for IceCream
3
Enter No of IceCreams
2
Enter 0 is you want to purchase More Else any other to exit
9
Total Bill with GST = Rs1164.8
First Pay then Eat
Updated List:
No Of Candy =5
No Of Cookies =1
No Of IceCreams =15
If you have to place an order or add the Item press 0 to continue else exit
8

*/