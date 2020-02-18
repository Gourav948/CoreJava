package com.annotaion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class OrderTitleComparator implements Comparator<Order1> {

	@Override
	public int compare(Order1 o1, Order1 o2) {
		return o1.title.compareTo(o2.title)*-1;
	}
}

class OrderPriceComparator implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {
		if(o1.price > o2.price) {
			return -1;
		}
		else if(o1.price < o2.price) {
			return 1;
		}
		return 0;
	}
}

class Order1 implements Comparable<Order1> {

	String title;
	double price;
	
	public Order1(String title, double price) {
		this.title = title;
		this.price = price;
	}
	
	public String toString() {
		return title + " - " + price;
	}

	//@Override
	public int compareTo(Order1 o) {
		if(this.price > o.price) {
			return -1;
		}
		else if(this.price < o.price) {
			return 1;
		}
		return 0;
	}
}
public class ComparableMain {

	public static void main(String[] args) {
		Order1 order1 = new Order1("Chair purchase", 12000);
		Order1 order2 = new Order1("Table purchase", 15000);
		Order1 order3 = new Order1("Furniture Sale", 12000);
		
		List<Order1> list = new ArrayList<Order1>();
		list.add(order1);
		list.add(order2);
		list.add(order3);
		
		//Collections.sort(list); //calls Comparable
        Collections.sort(list, new OrderTitleComparator()); //calls Comparator
		
		for(Order1 order: list) {
			System.out.println(order);
		}
	}

}