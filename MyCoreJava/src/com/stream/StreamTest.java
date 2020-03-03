package com.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamTest 
{
	public static void main(String[] args) 
	{
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("AYC");
		arrayList.add("PQR");
		arrayList.add("XYZ");
		arrayList.add("ABC");
		arrayList.add("ADC");
		arrayList.add("BDC");
		arrayList.add("SDC");
		
		arrayList.stream().filter((String str)->str.startsWith("A")).sorted(Comparable::compareTo).forEach(System.out::println);;

	}

}
