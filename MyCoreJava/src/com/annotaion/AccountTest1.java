package com.annotaion;

class Account
{
	private int id;
	private String name;
	private int balance;
	public Account(int id, String name, int balance)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public int getBalance()
	{
		return this.balance;
	}
	public String toString()
	{
		return this.id +"-"+this.name+"-"+this.balance;
	}
}
class SavingAccount extends Account
{
private int fixedDeposit;
public SavingAccount(int id, String name,int balance, int fixedDeposit)
{
	super(id,name,balance);
	this.fixedDeposit=fixedDeposit;
}
public int getBalance()
	{
		return super.getBalance()+this.fixedDeposit;
	}
public String toString()
	{
		return super.toString()+"-"+this.fixedDeposit;
	}
}
class CurrentAccount extends Account
{
	private int cashCredit;
	public CurrentAccount(int id, String name,int balance, int cashCredit)
{
	super(id,name,balance);
	this.cashCredit=cashCredit;
}
public int getBalance()
	{
		return super.getBalance()+this.cashCredit;
	}
public String toString()
	{
		return super.toString()+"-"+this.cashCredit;
	}
}
class AccountTest1
{
	public static void main(String[] args) 
	{
		Account a[]=new Account[4];
		a[0] = new SavingAccount(8009,"Gourav",250000,10000);
		a[1] = new SavingAccount(8776,"Surendra",200000,20000);
		a[2] = new CurrentAccount(3445,"Nikhil",25000,5000);
		a[3] = new CurrentAccount(1111,"Snigdha",70000,12000);
		System.out.println("Total Cash in bank ="+AccountTest1.totalCash(a));
	}
	public static int totalCash(Account a[])
	{
		int cash=0;
		for (int i=0;i<a.length ;i++ ) 
		{
			cash+=a[i].getBalance();
			System.out.println(a[i]);
		}
		return cash;
	}
}