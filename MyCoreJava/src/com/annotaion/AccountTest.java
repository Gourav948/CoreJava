package com.annotaion;

class Account1
{

  private int bal;
  private String accName;
  private int accId;

  public Account1()
  {
    this.bal=0;	
  }
  public Account1(int bal,String accName, int accId)
  {
  	this.bal=bal;
  	this.accName=accName;
  	this.accId=accId;
  }
  public void accDeposit (int n)
  {
  	this.bal+=n;
  }
  public void accWithdraw(int n)
  {
  	if (this.bal>n)
  	{
  		this.bal-=n;
  		System.out.println("Withdraw Successful");
  	}
  	else
  	{
  		System.out.println("not enough balance");
  	}
  }
  public void printDetails()
  {
  	System.out.println("Account Name ="+this.accName);
  	System.out.println("Account Id ="+this.accId);
  	System.out.println("Account balance ="+this.bal);

  }

}
class AccountTest
{
	public static void main(String[] args) 
	{
		Account1 a=new Account1(100000,"Gourav",111);
		Account1 b= new Account1(20000,"Surendra",101);
		Account1 c= new Account1(0,"Nikhil",201);
		a.accDeposit(5000);
		a.accDeposit(10000);
		a.accWithdraw(20000);
		a.printDetails();
		b.accWithdraw(10000);
		b.accDeposit(300000);
		b.printDetails();
		c.accWithdraw(10000);
		c.accDeposit(100000);
		c.printDetails();
	}
}

/*

OUTPUT:

H:\IBM FullStack Training\COre java>javac StackedArrayTest.java

H:\IBM FullStack Training\COre java>java AccountTest
Withdraw Successful
Account Name =Gourav
Account Id =111
Account balance =95000
Withdraw Successful
Account Name =Surendra
Account Id =101
Account balance =310000
not enough balance
Account Name =Nikhil
Account Id =201
Account balance =100000

*/
