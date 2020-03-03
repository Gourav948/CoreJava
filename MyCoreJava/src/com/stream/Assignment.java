package com.stream;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
public class Assignment 
{
	public static void main(String args[])
	{
		//Assignment1
		
		
		System.out.println("\t\tFruit List in order Descending of Calories");
		List<String> fruitName=TestData.getAllFruits().stream().filter((Fruit fruit)->fruit.getCalories()<100).sorted(Comparator.comparing(Fruit::getCalories).reversed()).map(Fruit::getName).collect(Collectors.toList());
		for(String str:fruitName)
		{
			System.out.println(str);
		}
		System.out.println("\n\n");
		
		//Assignment2
		System.out.println("\t\tFruit List in colourWise");
		Map<String,List<Fruit>> colourWiseFruit= TestData.getAllFruits().stream().collect(groupingBy(Fruit::getColor));
		for(String str:colourWiseFruit.keySet())
		{
			System.out.print(str);
			System.out.println(colourWiseFruit.get(str));
		}
		System.out.println("\n\n");
		
		//Assignment3
		System.out.println("\t\tFruit List Red Sorted Price");
		TestData.getAllFruits().stream().filter((Fruit fruit)->fruit.getColor().equalsIgnoreCase("Red")).sorted(Comparator.comparing(Fruit::getPrice)).forEach(System.out::println);;
		System.out.println("\n\n");
		
		//Assignment4
		System.out.println("\t\tNews Id with Max Comments");
	    Optional<Object> max= TestData.getAllNews().stream().collect(groupingBy(News::getNewsId,counting())).entrySet().stream().max(Comparator.comparing(Entry::getValue)).map(Entry::getKey);
        System.out.println(max.get());
        System.out.println("\n\n");
        
       //Assignment5
        System.out.println("\t\tContains budget");
        CharSequence charSequence = "budget";
        Set<Entry<Integer, Long>> containsBudget= TestData.getAllNews().stream().filter((News n)->n.getComment().toLowerCase().contains(charSequence)).collect(groupingBy(News::getNewsId,counting())).entrySet();
        for(Entry<Integer, Long> str:containsBudget)
		{
			System.out.println(str.getKey()+" - "+str.getValue());
		}
        System.out.println("\n\n");
        
        //Assignment6
        System.out.println("\t\t'commentByUser' wise number of comments");
        Set<Entry<String, Long>> noOfComments=TestData.getAllNews().stream().collect(groupingBy(News::getCommentByUser,counting())).entrySet();
        for(Entry<String, Long> str:noOfComments)
		{
			System.out.println(str.getKey()+" - "+str.getValue());
		}
        System.out.println("\n\n");
        
        //Assignment7
        System.out.println("\t\tTransactions in the Year 2011");
        TestData.getAllTransactions().stream().filter((Transaction t)->t.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);
        System.out.println("\n\n");
        
        //Assignment8
        System.out.println("\t\tunique cities where the Trader Work");
        TestData.getAllTransactions().stream().map(Transaction::getTrader).map(Trader::getCity).distinct().forEach(System.out::println);;
        System.out.println("\n\n");
        
        //Assignment9
        System.out.println("\t\tTraders from Pune sorted by name");
        TestData.getAllTransactions().stream().filter((Transaction t)->t.getTrader().city.equalsIgnoreCase("Pune")).forEach(System.out::println);;
        System.out.println("\n\n");
        
        //Assignment10
        System.out.println("\t\tAll traders’ names sorted alphabetically");
        System.out.println(TestData.getAllTransactions().stream().map(Transaction::getTrader).map(Trader::getName).sorted().collect(joining(" ")));
        System.out.println("\n\n");
        
        //Assignment11
        System.out.println("\t\t Any Traders From Indore");
        System.out.println(TestData.getAllTransactions().stream().anyMatch((Transaction t)->t.getTrader().city.equalsIgnoreCase("Indore")));
        System.out.println("\n\n");
        
        //Assignment12
        System.out.println("\t\t Transaction Values of Traders in Delhi");
        TestData.getAllTransactions().stream().filter((Transaction t)->t.getTrader().city.equalsIgnoreCase("Delhi")).map(Transaction::getValue).forEach(System.out::println);;
        System.out.println("\n\n");
        
        //Assignment13
        System.out.println("\t\t Highest value of All Transactions");
        System.out.println(TestData.getAllTransactions().stream().mapToInt(Transaction::getValue).max().getAsInt());
        System.out.println("\n\n");
        
        //Assignment14
        System.out.println("\t\t Smallest Value Transaction");
        Optional<Object> min=TestData.getAllTransactions().stream().collect(groupingBy(Transaction::getValue,groupingBy(Transaction::toString))).entrySet().stream().min(Comparator.comparing(Entry::getKey)).map(Entry::getValue);
        System.out.println(min.get());
        System.out.println("\n\n");
        
        //Assignment14
        System.out.println("\t\t User Posting Max Comments");
        Optional<Object> maxComment=TestData.getAllNews().stream().collect(groupingBy(News::getPostedByUser,groupingBy(News::getPostedByUser))).entrySet().stream().max(Comparator.comparing(Entry::getKey)).map(Entry::getValue);
        System.out.println(maxComment.get());
        System.out.println("\n\n");
	}

}
