package com.date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.util.Locale;
import java.util.TimeZone;

public class DateTest {

	public static void main(String[] args) 
	{
		//Assignment 1
		LocalDate currentLocalDate=LocalDate.now();
		System.out.println("next Working Date -"+currentLocalDate.plusDays(15));//Using plusDays
		System.out.println("next Working Date -"+ currentLocalDate.with((Temporal temporal)-> temporal.plus(15, ChronoUnit.DAYS)));// Using TemporalAdjuster
		System.out.println("\n");
		
		/* Assignment 2
		LocalDateTime currentDateTime=LocalDateTime.of(2020, 10, 12, 11, 30);
		System.out.println(""+currentDateTime);
		Duration d1;
		if (currentDateTime.getHour()>12)
		{
			d1 = Duration.between(LocalDateTime.of(currentDateTime.toLocalDate(),LocalTime.of(12, 0,0)).plusHours(24),currentDateTime);
		}
		else 
		{
			d1 = Duration.between(currentDateTime, LocalTime.of(12,0,0));
		}
		
		System.out.println((float)d1.getSeconds()/3600+" hours");
		System.out.println("\n");
		*/
		// Assignment 3
		LocalDate currentDate=LocalDate.of(2024, 2, 23);
		Period p1=null;
		if (currentDate.isLeapYear())
		{
			if(currentDate.getMonthValue()>2)
			{
				p1=Period.between(currentDate,currentDate.of(currentDate.getYear(), 2, 29).plusYears(4));
			}
			else
			{
				p1=Period.between(currentDate,currentDate.of(currentDate.getYear(),2,29));
			}
		}
		else
		{
			p1=Period.between(currentDate,currentDate.of(currentDate.getYear(), 2, 28).plusYears((4-currentDate.getYear()%4)));
		}
		System.out.println(p1.getYears()+" Yrs "+p1.getMonths()+" Month "+p1.getDays()+" Days ");
		System.out.println("\n");
		 
		// Assignment 4
		ZoneId romeZone= ZoneId.of("Europe/Madrid");
		LocalTime localTime = LocalTime.now(romeZone);
		System.out.println("Spain "+localTime);
		
		ZoneId romeZone1= ZoneId.of("Australia/Melbourne");
		LocalTime localTime_1 = LocalTime.now(romeZone1);
		System.out.println("Australia "+localTime_1);
		
		ZoneId romeZone2= ZoneId.of("America/Argentina/Buenos_Aires");
		LocalTime localTime_2 = LocalTime.now(romeZone2);
		System.out.println("Argentina "+localTime_2);
		
		ZoneId romeZone3= ZoneId.of("America/Los_Angeles");
		LocalTime localTime_3 = LocalTime.now(romeZone3);
		System.out.println("Los Angeles "+localTime_3);
		
		ZoneId romeZone4= ZoneId.of("Asia/Istanbul");
		LocalTime localTime_4 = LocalTime.now(romeZone4);
		System.out.println("Istanbul "+localTime_4);

		ZoneId romeZone5= ZoneId.of("Antarctica/South_Pole");
		LocalTime localTime_5 = LocalTime.now(romeZone5);
		System.out.println("South Pole "+localTime_5);
		System.out.println("\n");
		
		
		// Assignment 5
		
		DateTimeFormatter italianFormatter=DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.ITALIAN);
		LocalDate date = LocalDate.of(2014, 3, 18);
		String formattedDate = date.format(italianFormatter);
		System.out.println("Italian Format "+formattedDate);
		
		DateTimeFormatter italianFormatter1=DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.FRENCH);
		LocalDate date1 = LocalDate.of(2014, 3, 18);
		String formattedDate1 = date1.format(italianFormatter1);
		System.out.println("French Format "+formattedDate1);
		System.out.println("\n");
		
		//Assignment 6
		
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");
		  System.out.println(LocalDateTime.now().format(formatter));
		
		  DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
		  System.out.println(LocalDateTime.now().format(formatter1));
		
		  
		  //Assignment7
		  System.out.println(currentLocalDate.getDayOfWeek());
	}
	

}
