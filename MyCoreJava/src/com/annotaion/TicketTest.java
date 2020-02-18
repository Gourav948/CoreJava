package com.annotaion;

 class Ticket
{
  String from;
  String to;
  int seatno;
  int price=1000;
  public Ticket(String from,String to, int seatno)
  {
  	this.from=from;
  	this.to=to;
    this.seatno=seatno;
  }
}
class BusTicket extends Ticket
{
   public BusTicket(String from,String to, int seatno)
   {
   	super(from,to,seatno);
   }
   public int getPrice()
  {
  	return super.price;
  }
}
class RailwayTicket extends Ticket
{
   String seatType;
   public RailwayTicket(String from,String to, int seatno,String seatType)
   {
   	super(from,to,seatno);
   	this.seatType=seatType;
   }
   public int getPrice()
  {
  	return super.price;
  }
}
class FlightTicket extends Ticket
{
   int luggage;
   int p=super.price;//basic price
   double q=(0.01)*(super.price);//travel insurance
   double total;
   public FlightTicket(String from,String to, int seatno,int luggage)
   {
   	super(from,to,seatno);
   	this.luggage=luggage;
   }
   public double getPrice()
  {
  	
  	if (this.luggage>15)
  		total=p+((0.03)*p)+q;
  	else
  	    total=p+q; 
  	return total;       
       
  }
}

class TicketTest
{
	public static void main(String[] args) 
	{ 
	  BusTicket a =new BusTicket("BBS","Tata",35);
	  System.out.println(a.getPrice());	
	  BusTicket b =new BusTicket("BBS","Delhi",23);
	  System.out.println(b.getPrice());
	  FlightTicket c =new FlightTicket("BBS","Tata",35,23);
	  System.out.println(c.getPrice());	
	  FlightTicket d =new FlightTicket("BBS","Delhi",22,10);
	  System.out.println(d.getPrice());	
	  FlightTicket e =new FlightTicket("BBS","bng",35,45);
	  System.out.println(e.getPrice());	
	  FlightTicket f =new FlightTicket("BBS","Tata",35,12);
	  System.out.println(f.getPrice());	
	  FlightTicket g =new FlightTicket("BBS","Tata",35,15);
	  System.out.println(g.getPrice());	
	  RailwayTicket p =new RailwayTicket("BBS","Tata",35,"1AC");
	  System.out.println(p.getPrice());	
	   RailwayTicket q =new RailwayTicket("BBS","Tata",15,"2AC");
	  System.out.println(q.getPrice());
	   RailwayTicket r =new RailwayTicket("BBS","Tata",25,"3AC");
	  System.out.println(r.getPrice());
	}
}