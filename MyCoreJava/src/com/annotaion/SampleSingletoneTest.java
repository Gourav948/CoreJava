package com.annotaion;

class SampleSingletone1
{
	private static SampleSingletone1 ref = null;
	private SampleSingletone1()
	{

	}
	public static SampleSingletone1 getInstance()
	{
		if (ref == null)
			ref=new SampleSingletone1();
		return ref;
	}
}
class SampleSingletoneTest
{
	public static void main(String[] args) 
	{
	   SampleSingletone a= SampleSingletone.getInstance();
	   System.out.println(a);
	    SampleSingletone b= SampleSingletone.getInstance();
	   System.out.println(b);
	    SampleSingletone c= SampleSingletone.getInstance();
	   System.out.println(c);
	    SampleSingletone d= SampleSingletone.getInstance();
	   System.out.println(d);

	}
}
/* 


output:
H:\IBM FullStack Training\COre java>java SampleSingletoneTest
SampleSingletone@7c53a9eb
SampleSingletone@7c53a9eb
SampleSingletone@7c53a9eb
SampleSingletone@7c53a9eb

class Simple extends SampleSingletone // Cant extend Singletone Class
{

}
H:\IBM FullStack Training\COre java>javac SampleSingletoneTest.java
SampleSingletoneTest.java:30: error: SampleSingletone() has private access in SampleSingletone
class Simple extends SampleSingletone
^
1 error


*/