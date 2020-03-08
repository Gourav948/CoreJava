package com.date;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class date {
	public static List<LocalDate> sundayList = new ArrayList<>();
	public static void main(String[] args) 
	{
	int year = 2016;
	LocalDate myLocalDate = LocalDate.of(year, 3, 1);
	
	LocalDate firstDayOfYearDate = LocalDate.of(myLocalDate.getYear(),1, 1);
		while(firstDayOfYearDate.getYear()==year)
		{
			
			if ( firstDayOfYearDate.getDayOfWeek() == DayOfWeek.SUNDAY )
			{
				sundayList.add(firstDayOfYearDate);
				
			}
			firstDayOfYearDate = firstDayOfYearDate.plusDays(1);
			
		}
		sundayList.stream().forEach(System.out::println);
	}
}
