package com.annotaion;

import java.lang.reflect.*;
import java.util.*;

class Sample {

private String messageTxt= "Welcome";
private void methodTest()
{
	System.out.println("In private Method");
}
}
class Privatetest 
{
	@SuppressWarnings("checked")  
	public static void main(String[] args) throws Exception
	{
       		Class c =Class.forName("Sample");
       		Object o=c.newInstance();
       		Field msg = c.getDeclaredField("messageTxt");
       		Method mth = c.getDeclaredMethod("methodTest");
            msg.setAccessible(true);
            mth.setAccessible(true);
            System.out.println("Mssg field text ="+msg.get(new Sample()));
            System.out.println("Method field text ="+mth.invoke(o,null));

	}
}

/*
OUTPUT:
wITHOUT 
H:\IBM FullStack Training\COre java>javac Privatetest.java
Note: Privatetest.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

H:\IBM FullStack Training\COre java>java Privatetest
Exception in thread "main" java.lang.IllegalAccessException: class Privatetest cannot access a member of class Sample with modifiers "private"
        at java.base/jdk.internal.reflect.Reflection.newIllegalAccessException(Unknown Source)
        at java.base/java.lang.reflect.AccessibleObject.checkAccess(Unknown Source)
        at java.base/java.lang.reflect.Field.checkAccess(Unknown Source)
        at java.base/java.lang.reflect.Field.get(Unknown Source)
        at Privatetest.main(Privatetest.java:19)


After Setting Accessible true

H:\IBM FullStack Training\COre java>javac Privatetest.java
Note: Privatetest.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

H:\IBM FullStack Training\COre java>java Privatetest
Mssg field text =Welcome

H:\IBM FullStack Training\COre java>javac Privatetest.java
Privatetest.java:23: warning: non-varargs call of varargs method with inexact argument type for last parameter;
            System.out.println("Method field text ="+mth.invoke(o,null));
                                                                  ^
  cast to Object for a varargs call
  cast to Object[] for a non-varargs call and to suppress this warning
Note: Privatetest.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
Note: Privatetest.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 warning

H:\IBM FullStack Training\COre java>java Privatetest
Mssg field text =Welcome
In private Method
Method field text =null

*/