package linkedlist;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

//Tree ->when we have to access the file hierarcy it have root
public class LinkedListEx 
{
	int a = 10;
    public static void main(String[] args) 
    {
    	String word ="1234567890";
    	int msisdn_length=9;
    	String substr = word.substring(word.length() - msisdn_length);
    	System.out.println(substr);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-DD");

		String date = "2017-03-08 12:30:54";
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.parse(date, format);
		
		String dateAfter = "2020-04-26 00:18:34";
		DateTimeFormatter dateAfterformat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime dateAfterformatdateTime = LocalDateTime.parse(dateAfter, dateAfterformat);
		 
		 
		//calculating number of days in between
		long noOfDaysBetween = ChronoUnit.DAYS.between(dateTime, dateAfterformatdateTime);
			
		//displaying the number of days
		System.out.println(noOfDaysBetween);
		
		
	}
}
