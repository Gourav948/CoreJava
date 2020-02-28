package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OrderList {

	private static List<Order> orderList = new ArrayList<Order>();
	static {
		Random random = new Random();
		for(int i=0;i<40;i++) {
			String location = i%10==0 ?  "Pune":(i%2==0 ? "Banglore":"Mumbai" );
			int price = random.nextInt(30000);
			String status=i%5==0 ?  "ACCEPTED":(i%2==0 ? "REJECTED":"COMPLETED");
			Order order = new Order(location, price,status);
			orderList.add(order);
		}
	}
	public static List<Order> getOrders() {
		return orderList;
	}
}
