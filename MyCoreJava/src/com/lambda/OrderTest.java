package com.lambda;

import java.util.*;
import java.util.function.*;

public class OrderTest 
{
	public static void filterOrder(List <Order> orderprice,Predicate <Order> p)
	{
		for(Order o:orderprice)
		{
			if (p.test(o))
			{
				System.out.println(o);
			}
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("As Per OREDER price");
		Predicate <Order> p=(Order o)->o.getPrice()>10000;
		filterOrder(OrderList.getOrders(),p);
		System.out.println("\n\n");
		System.out.println("As Per OREDER STATUS Accepeted or Completed");
		System.out.println("\n\n");
		Predicate <Order> pp=(Order o)->o.getStatus().equalsIgnoreCase("accepted")||o.getStatus().equalsIgnoreCase("completed");
		filterOrder(OrderList.getOrders(),pp);
	}

}

/*
 * As Per OREDER price
Order -- location=Banglore, price=29771, status=REJECTED
Order -- location=Banglore, price=28710, status=REJECTED
Order -- location=Mumbai, price=15661, status=COMPLETED
Order -- location=Banglore, price=27039, status=REJECTED
Order -- location=Mumbai, price=27322, status=COMPLETED
Order -- location=Mumbai, price=12019, status=ACCEPTED
Order -- location=Banglore, price=11446, status=REJECTED
Order -- location=Mumbai, price=29018, status=COMPLETED
Order -- location=Banglore, price=24611, status=REJECTED
Order -- location=Mumbai, price=12958, status=COMPLETED
Order -- location=Banglore, price=17301, status=REJECTED
Order -- location=Banglore, price=29792, status=REJECTED
Order -- location=Mumbai, price=13649, status=ACCEPTED
Order -- location=Banglore, price=27851, status=REJECTED
Order -- location=Mumbai, price=16183, status=COMPLETED
Order -- location=Mumbai, price=23400, status=COMPLETED
Order -- location=Mumbai, price=12051, status=COMPLETED
Order -- location=Banglore, price=28959, status=REJECTED
Order -- location=Mumbai, price=11013, status=ACCEPTED
Order -- location=Banglore, price=22312, status=REJECTED
Order -- location=Banglore, price=20124, status=REJECTED



As Per OREDER STATUS Accepeted or Completed



Order -- location=Pune, price=9886, status=ACCEPTED
Order -- location=Mumbai, price=1891, status=COMPLETED
Order -- location=Mumbai, price=7386, status=COMPLETED
Order -- location=Mumbai, price=6872, status=ACCEPTED
Order -- location=Mumbai, price=4953, status=COMPLETED
Order -- location=Mumbai, price=15661, status=COMPLETED
Order -- location=Pune, price=2457, status=ACCEPTED
Order -- location=Mumbai, price=8102, status=COMPLETED
Order -- location=Mumbai, price=27322, status=COMPLETED
Order -- location=Mumbai, price=12019, status=ACCEPTED
Order -- location=Mumbai, price=29018, status=COMPLETED
Order -- location=Mumbai, price=12958, status=COMPLETED
Order -- location=Pune, price=9304, status=ACCEPTED
Order -- location=Mumbai, price=6715, status=COMPLETED
Order -- location=Mumbai, price=1630, status=COMPLETED
Order -- location=Mumbai, price=13649, status=ACCEPTED
Order -- location=Mumbai, price=8367, status=COMPLETED
Order -- location=Mumbai, price=16183, status=COMPLETED
Order -- location=Pune, price=6376, status=ACCEPTED
Order -- location=Mumbai, price=23400, status=COMPLETED
Order -- location=Mumbai, price=12051, status=COMPLETED
Order -- location=Mumbai, price=11013, status=ACCEPTED
Order -- location=Mumbai, price=1173, status=COMPLETED
Order -- location=Mumbai, price=4326, status=COMPLETED

 * 
 * */
 