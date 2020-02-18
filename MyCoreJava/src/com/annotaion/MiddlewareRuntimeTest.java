package com.annotaion;

import java.lang.reflect.*;


class MiddlewareRuntimeTest {
	public static void main(String args[]) throws Exception 
	{
		Class paramTypes[] = new Class[1];
		//paramTypes[0] = args[0];
		Object paramValues[] = new Object[1];
		paramValues[0] = "iter";
		String capname =(String)Middleware.invokeMethod("StringOpr", "getCapital", paramTypes, paramValues);
		System.out.println(capname);
	}
}