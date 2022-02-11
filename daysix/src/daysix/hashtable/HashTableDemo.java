package daysix.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<String, Double> balance = new Hashtable<String, Double>();
		Enumeration names;
		String str;
		double bal;

		balance.put("Ram", 65.145);
		balance.put("Shyam", 345.145);
		balance.put("Baburao", 91.145);

		names = balance.keys();
		while (names.hasMoreElements()) {
			str = (String) names.nextElement();
			System.out.println(str + ":" + balance.get(str));
		}

		bal = balance.get("Ram").doubleValue();
		balance.put("Ram", bal + 1000);
		System.out.println("Ram new balance: " + balance.get("Ram"));

	}

}
