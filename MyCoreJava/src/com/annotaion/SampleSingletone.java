package com.annotaion;

class SampleSingletone
{
	private static SampleSingletone ref = null;
	private SampleSingletone()
	{

	}
	public static SampleSingletone getInstance()
	{
		if (ref == null)
			ref=new SampleSingletone();
		return ref;
	}
}
