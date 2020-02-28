package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;



class User implements Comparable<User>
{
   private String name;
   private String userid;
   private String password;
   boolean loggedIn =false;
   
   public String getName() 
   {
	return name;
   	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getUserid() 
	{
		return userid;
	}
	public void setUserid(String userid) 
	{
		this.userid = userid;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
public User()
   {
	   super();
   }
   public User(String name, String userid,String password) 
   {
	super();
	this.name = name;
	this.userid = userid;
	this.password=password;
  }


public boolean loginUser(String user,String password)
   {
	 if(user.equals(password))
		 loggedIn=true;
	 return loggedIn;
   }
@Override
public int compareTo(User u) 
{ 
	return this.userid.compareTo(u.userid);		
}
@Override
public String toString() {
	return "User [name=" + name + ", userid=" + userid + "]\n";
}

   
}
public class ChatApplication 
{
	private static HashMap<String,TreeSet<User>> hmapUsers =new HashMap<String,TreeSet<User>>();
	private static HashMap<String,ArrayList<String>> hmapMessages =new HashMap<String,ArrayList<String>>();

	private static ArrayList<String> activeUsers =new ArrayList<String>();
	
	public static void main (String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		int i;
      do
      {
    	System.out.println("\t\tWelcome to Chat Application Enter your Choice:\t\t");
    	System.out.println("1 To Create a Chat Room");
    	System.out.println("2 To Add user");
    	System.out.println("3 To login");
    	System.out.println("4 to Send a message");
    	System.out.println("5 to List all messages of a Particular Chat Room");
    	System.out.println("6 To List all the User for a specific Chat Room");
    	System.out.println("7 to Logout");
    	System.out.println("8 to Delete user");
    	System.out.println("9 to Delete chat Room");
    	int choice=sc.nextInt();
    	String chatRoom;
    	switch (choice)
    	{
    	case 1:
    		System.out.println("Enter The name of Chatroom");
    		 chatRoom=sc.next();
    			if (hmapUsers.containsKey(chatRoom))
    			{
    				System.out.println("Chatroom Already Exists");
    			}
    			else
    			{
    				hmapUsers.put(chatRoom, new TreeSet<User>());
    				hmapMessages.put(chatRoom, new ArrayList<String>());
    				System.out.println("Room Created!! Let's nachoo");
    			}
 
    		break;
    	case 2:
    		System.out.println("Enter details of User Name id ");
    		String name=sc.next();
    		String userid=sc.next();
    		String password=sc.next();
    		User newUser =new User(name,userid,password);
    		System.out.println("Enter name of the Chatroom ");
    		chatRoom=sc.next();
    		if (hmapUsers.containsKey(chatRoom))
			{
    			TreeSet<User> ts=hmapUsers.get(chatRoom);
    			ts.add(newUser);
    			hmapUsers.put(chatRoom, ts);
    			System.out.println("user Added");
			}
			else
			{
				System.out.println("Chatroom Doesn't Exists");
			}
    		break;
    	case 3:
    		System.out.println("Enter ChatRoom");
    		chatRoom=sc.next();
    		if (hmapUsers.containsKey(chatRoom))
			{
    			System.out.println("Enter login id and password ");
        		String id=sc.next();
        		String pass=sc.next();
    			TreeSet<User> ts=hmapUsers.get(chatRoom);
    			boolean userLogin=false;
    			for (User u :ts)
    			{
    				if(u.getUserid().equals(id))
    					if(u.getPassword().equals(pass))
    					{
    						userLogin=true;
    						activeUsers.add(u.getName());
    						break;
    					}
    				
    			}
    			if (userLogin)
    			{
    				System.out.println("Logged in SuccessFully");
    			}
    			else
    			{
    				System.out.println("Mismatch of Data Either User not Exists or Password Incorrect");
    			}
			}
			else
			{
				System.out.println("Chatroom Doesn't Exists");
			}
    		
    		break;
    	case 4:
    		System.out.println("Enter ChatRoom");
    		chatRoom=sc.next();
    		if (hmapMessages.containsKey(chatRoom))
			{
    			System.out.println("Enter Message ");
    			String msg=sc.next();
    			ArrayList<String> arr =hmapMessages.get(chatRoom);
    			arr.add(msg);
    		    hmapMessages.put(chatRoom, arr);
    		    System.out.println("message Updated");
			}
    		else
				System.out.println("Chatroom Doesn't Exists");
    		break;
    	case 5:
    		System.out.println("Enter ChatRoom");
    		chatRoom=sc.next();
    		if (hmapMessages.containsKey(chatRoom))
			{
    			if (hmapMessages.containsKey(chatRoom))
    			{
        			System.out.println(hmapMessages.get(chatRoom));
    			}
			}
    		else
				System.out.println("Chatroom Doesn't Exists");
    		break;
    	case 6:
    		System.out.println("Enter name of the Chatroom ");
  		  	chatRoom=sc.next();
    		if (hmapUsers.containsKey(chatRoom))
			{
    			System.out.println(hmapUsers.get(chatRoom));
			}
    		break;
    	case 7:
    		System.out.println("Enter ChatRoom");
    		chatRoom=sc.next();
    		if (hmapUsers.containsKey(chatRoom))
			{
    			System.out.println("Enter login id");
    			String str=sc.next();
    			TreeSet<User> ts=hmapUsers.get(chatRoom);
    			for(User u :ts)
    			{
    				if (u.getUserid().equals(str))
    				{
    					str=u.getName();
    					break;
    				}
    			}
    			activeUsers.remove(str);
    			System.out.println("User Loggedout");
			}
    		break;
    	case 8:
    		System.out.println("Enter ChatRoom");
    		chatRoom=sc.next();
    		if (hmapUsers.containsKey(chatRoom))
			{
    			System.out.println("Enter login id");
    			String str=sc.next();
    			TreeSet<User> ts=hmapUsers.get(chatRoom);
    			for(User u :ts)
    			{
    				if (u.getUserid().equals(str))
    				{
    					ts.remove(u);
    					System.out.print("User Deleted");
    					break;
    				}
    			}
   			}
    		break;
    	case 9:
    		System.out.println("Enter ChatRoom");
    		chatRoom=sc.next();
    		if (hmapUsers.containsKey(chatRoom))
			{
    			hmapUsers.remove(chatRoom);
    			System.out.println("Removed chatroom from user Type");
			}
    		if(hmapMessages.containsKey(chatRoom))
    		{
    			hmapMessages.remove(chatRoom);
    			System.out.println("Removed chatroom from message Type");
    		}
    		break;		
    	}
    		System.out.println("Enter 0 if you want to Continue Else any other no");
    		i=sc.nextInt();
      }while(i==0);
      
      System.out.println("Currently Active Users");
      for(String name : activeUsers)
      {
    	  System.out.println(name);
      }
	}
}
