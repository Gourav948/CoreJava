package com.lambda;

public class Order {
	private String location;
	private int price;
	private String status;
	
	public Order() {}

	public Order(String location, int price,String status) {
		this.location = location;
		this.price = price;
		this.status=status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order -- location=" + location + ", price=" + price + ", status=" + status ;
	}
	

}