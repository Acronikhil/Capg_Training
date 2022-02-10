package dayfive.datenumbercurrencyapi;

import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1= new Date();
		System.out.println("Our Date1 -----"+ date1);
		Date date2= new Date(999999L);
		System.out.println("Our Date1 -----"+ date2);
		Date date3= new Date(99999999999999L);
		System.out.println("Our Date1 -----"+ date3);
		
		if(date1.after(date2)) {
			System.out.println("Date 1 is after our second date");
		}
		if(date2.before(date3)) {
			System.out.println("Date 1 is after our second date");
		}
		
		
	}

}
