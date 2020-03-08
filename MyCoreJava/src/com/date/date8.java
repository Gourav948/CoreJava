package com.date;

import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class date8 {
	public static void main(String[] args) 
	{
	int year = 2018;
	LocalDate myLocalDate = LocalDate.of(year, 3, 1);
	
	LocalDate firstDayOfYearDate = LocalDate.of(myLocalDate.getYear(),1, 1);
	int count=0;	
	 while(firstDayOfYearDate.getYear()==year)
		{
			
			
			if ( firstDayOfYearDate.getDayOfWeek() == DayOfWeek.SUNDAY )
			{
				count++;
				
			}
			if(firstDayOfYearDate.equals(firstDayOfYearDate.with(lastDayOfMonth()))) 
			{
			
				if(count==5)
				{
					System.out.println(firstDayOfYearDate.getMonth());
				}
				count=0;
			}
		
			firstDayOfYearDate = firstDayOfYearDate.plusDays(1);
			
		}
	}
}
