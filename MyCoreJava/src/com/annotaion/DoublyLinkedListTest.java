package com.annotaion;

import java.util.*;
class Node
{
	private Node prev;
	private Node next;
	private int data;

	public void setPrev(Node prev)
	{
		this.prev=prev;
	}

	public void setNext(Node next)
	{
		this.next=next;
	}

	public void setData(int data)
	{
		this.data=data;
	}
	public Node getPrev()
	{
		return this.prev;
	}
	public Node getNext()
	{
		return this.next;
	}
	public int getData()
	{
		return this.data;
	}
}
class DoublyLinkedList
{ 
	Scanner sc =new Scanner(System.in);
	Node start =null;

public void createDll(int  n)
{
	Node nn =new Node();

	nn.setNext(null);
	nn.setPrev(start);
	System.out.println("Enter First Element");
	nn.setData(sc.nextInt());

	start=nn;

	for(int i=1;i<n;i++)
	{
		Node nn1=new Node();
		nn1.setPrev(nn);
		nn1.setNext(null);
		System.out.println("Enter "+(i+1)+" Element");
		nn1.setData(sc.nextInt());
		nn.setNext(nn1);
		nn=nn1;
	}
}
public void displayDll()
{
	Node temp =start;
	while(temp!=null)
	{
		System.out.print(temp.getData()+ " ");
		temp=temp.getNext();
	}
	System.out.println();
}
public void insertNode(int x)
{
	Node nn =new Node();
	System.out.println("Enter Data to be inserted");
	nn.setData(sc.nextInt());
	if (x==1)
	{
      nn.setNext(start);
      start.setPrev(nn);
      start=nn;
	}
	else if(x==this.countDll())
	{
		Node temp =start;
		while (temp.getNext()!=null) 
		{
			temp=temp.getNext();
		}
		temp.setNext(nn);
		nn.setPrev(temp);
	}
	else
	{
		Node temp=start;
		Node temp1=null;
       for (int i=0;i<x-1;i++) 
       {
       	temp1=temp;
       	temp=temp.getNext();
       }
      nn.setPrev(temp1);
      nn.setNext(temp);
      temp1.setNext(nn);
      temp.setPrev(nn);
	}

}
public void deleteNode(int x)
{
	if (x==1)
	{
      Node temp=start;
      start=start.getNext();
      start.setPrev(null);
      temp.setNext(null);
	}
	else if(x==this.countDll())
	{
		Node temp =start;
		Node temp1=null;
		while (temp.getNext()!=null) 
		{
			temp=temp.getNext();
			temp1=temp.getPrev();
		}
		temp1.setNext(null);
		temp.setPrev(null);
	}
	else
	{
		Node temp=start;
		Node temp1=null;
		Node temp2=null;
       for (int i=0;i<x-1;i++) 
       {
       	temp1=temp;
       	temp=temp1.getNext();
       	temp2=temp.getNext();
       }
      temp1.setNext(temp2);
      temp2.setPrev(temp1);
      temp.setNext(null);
      temp.setPrev(null);
	}

}
public int countDll()
{
	Node temp =start;
	int n=0;
	while(temp!=null)
	{
		n++;
		temp=temp.getNext();
	}
	return n;
}
}
class DoublyLinkedListTest
{
	public static void main(String[] args) 
	{
		DoublyLinkedList a= new DoublyLinkedList();
		a.createDll(6);
		a.displayDll();
		a.insertNode(1);
		a.displayDll();
		a.insertNode(6);
		System.out.println("No of nodes ="+a.countDll());
		a.displayDll();
        a.insertNode(8);
        a.displayDll();
        System.out.println("No of nodes ="+a.countDll());
        a.deleteNode(1);
        a.displayDll();
        a.deleteNode(6);
        a.displayDll();
        a.deleteNode(7);
        a.displayDll();
        System.out.println("No of nodes ="+a.countDll());
	}
}
/*
OUTPUT

H:\IBM FullStack Training\COre java>java DoublyLinkedListTest
Enter First Element
1
Enter 2 Element
2
Enter 3 Element
3
Enter 4 Element
4
Enter 5 Element
5
Enter 6 Element
6
1 2 3 4 5 6
Enter Data to be inserted
7
7 1 2 3 4 5 6
Enter Data to be inserted
8
No of nodes =8
7 1 2 3 4 8 5 6
Enter Data to be inserted
9
7 1 2 3 4 8 5 6 9
No of nodes =9
1 2 3 4 8 5 6 9
1 2 3 4 8 6 9
1 2 3 4 8 6
No of nodes =6*/