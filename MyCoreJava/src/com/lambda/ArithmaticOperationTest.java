package com.lambda;

@FunctionalInterface
interface ArithmaticOperation
{
	int operation(int no1, int no2);
}

public class ArithmaticOperationTest 
{
	public static void main(String[] args) 
	{
		ArithmaticOperation add = (a,b)->a+b;
		ArithmaticOperation subtract = (a,b)->a>b?a-b:b-a;
		ArithmaticOperation multiply = (a,b)->a*b;
		ArithmaticOperation divide = (a,b)->a>b? a/b:b/a;
		
		System.out.println(add.operation(10, 20));
		System.out.println(subtract.operation(10, 20));
		System.out.println(subtract.operation(40, 20));
		System.out.println(multiply.operation(10, 20));
		System.out.println(divide.operation(10, 20));
		System.out.println(divide.operation(40, 20));
	}

}
