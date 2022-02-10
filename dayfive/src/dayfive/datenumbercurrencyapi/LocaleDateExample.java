package dayfive.datenumbercurrencyapi;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocaleDateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(LocalDate.now());
		
		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomorrow = date.plusDays(1);
		
//		System.out.println(yesterday);
//		System.out.println(tomorrow);
//		System.out.println(LocalDate.now().isLeapYear());
		LocalDate dateToCheckLeapYear = LocalDate.of(2016, 1, 31);
//		System.out.println(dateToCheckLeapYear.isLeapYear());
		
		LocalDate dateTime = LocalDate.of(2021, 1, 20);
//		System.out.println(dateTime);
		LocalDateTime dateWithTime = dateTime.atTime(1, 50, 9);
//		System.out.println(dateWithTime);

		//Get current Date
		LocalDate currentDate = LocalDate.now();
		String strDate = currentDate.format(DateTimeFormatter.ISO_DATE);
		
//		System.out.println(strDate);
		
		LocalDate cDate = LocalDate.of(2050, 1, 20);
//		System.out.println(cDate.format(DateTimeFormatter.ISO_DATE));
		
	/*
	 * Converting String inot local date
	 * 
	 * */
		
		String dateString = "2022-02-10";
		LocalDate d1 = LocalDate.parse(dateString);
		System.out.println(d1);
	
//		System.out.println(d1.getDayOfMonth());
//		System.out.println(d1.getDayOfYear());
//		System.out.println(d1.getMonthValue());
//		System.out.println(d1.getMonth());
		
		LocalDate d2 = LocalDate.now();
		Date dt = new Date();
		SimpleDateFormat formate = new SimpleDateFormat("dd/MM/yyyy");
		String strDatee = formate.format(dt);
		System.out.println(strDatee);
		
			// Custom format using Local Date and Time
		LocalDate d3 = LocalDate.now() ;
		String dstr = d3.format(DateTimeFormatter.ofPattern("dd/MMM/yyyy"));
		System.out.println(dstr);
		
		
	
		
/*															End of file														*/
	
	}

}
