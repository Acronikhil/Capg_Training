package dayfive.datenumbercurrencyapi;

import java.util.Currency;
import java.util.Locale;

public class CurencyApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale locale = Locale.getDefault();
		System.out.println(locale);
//		System.out.println(locale.getAvailableLocales());
		
		Currency c = Currency.getInstance(locale.US);
		System.out.println(c.getCurrencyCode());
		System.out.println(c.getDisplayName());
		System.out.println(c.getSymbol());
		
		
	}

}
