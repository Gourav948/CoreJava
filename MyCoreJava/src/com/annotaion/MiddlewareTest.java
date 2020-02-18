package com.annotaion;

import java.lang.reflect.*;

class StringOpr 
{
	public String getCapital(String name) 
	{
		return name.toUpperCase();
	}
}
class Middleware 
{

	public static Object invokeMethod(String className, String methodName, Class paramTypes[], Object paramValues[]) throws Exception
	{
	Class c =Class.forName(className);
	Object a=c.newInstance();
	Method b=c.getMethod(methodName,paramTypes);
	return b.invoke(a,paramValues);
	}
}
class MiddlewareTest {
	public static void main(String args[]) throws Exception 
	{
		Class paramTypes[] = new Class[1];
		paramTypes[0] = java.lang.String.class;
		Object paramValues[] = new Object[1];
		paramValues[0] = "iter";
		System.out.println((String)Middleware.invokeMethod("StringOpr", "getCapital", paramTypes, paramValues));
		
	}
}
/*
OUTPUT:
H:\IBM FullStack Training\COre java>javac MiddlewareTest.java
Note: MiddlewareTest.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
Note: MiddlewareTest.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

H:\IBM FullStack Training\COre java>java MiddlewareTest
ITER
*/