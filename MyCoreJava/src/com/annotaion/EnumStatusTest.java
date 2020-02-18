package com.annotaion;

enum Status
{
	NEW(1),REJECTED(2),ACCEPTED(3),COMPLETED(4);
	int value;
	Status (int value)
	{
		this.value=value;
	}
	public int getValue()
	{
		return this.value;
	}

}
class Order 
{
    int orderid;
    String name;
    int quantity;
    int price;
    int status =Status.REJECTED.getValue();
    public Order(int orderid ,String name, int quantity,int price)
    {
       this.orderid=orderid;
       this.name=name;
       this.quantity=quantity;
       this.price=price;
    }
	public static void main(String[] args) 
	{
	   	Order s = new Order(123,"Gourav",12,500);
	   	System.out.println(s.status);
	}
}