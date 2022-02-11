package daysix.list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	// TreeMap will give you a sorted output

	public static void main(String[] args) {

		HashMap<String, Double> hm = new HashMap<String, Double>();
		hm.put("John", 123.1);
		hm.put("Cena", 453.7);
		hm.put("Brown Stroman", null);
		hm.put("Brock Lesnar", 983.211);
		hm.put("Randy Orton", 12.0);
		hm.put(null, 123.1);
		hm.put(null, null);
		hm.put(null, 9023.1);
		hm.put("Nikhil", null);

		hm.put("John", 123.1);
		hm.put("Cena", 453.7);
		hm.put("Brown Stroman", 894.12);
		hm.put("Brock Lesnar", 983.211);
		hm.put("Randy Orton", 12.0);
		hm.put("Roman", 123.1);
		hm.put("Dolph", 121.45);
		hm.put("Batista", 9023.1);
		hm.put("Kevin", 654.03);

		System.out.println(hm);

		Set set = hm.entrySet();// Get a set of the entries in map.
		System.out.println(set);
		System.out.println(hm.keySet());
		System.out.println(hm.get("John"));

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
//			Map.Entry<String, Double> me = (Map.Entry<String, Double>)itr.next();
//			System.out.println(me);
			System.out.println(itr.next());

			System.out.println(hm.keySet());
			System.out.println(hm.values());

		}
	}

}
