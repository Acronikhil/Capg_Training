package daysix.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
	// TreeMap will give you a sorted output
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Key, String> cityMap = new HashMap<Key, String>();
		cityMap.put(new Key(1, "dws"), "Dewas");
		cityMap.put(new Key(2, "INDR"), "Indore");
		cityMap.put(new Key(3, "UJ"), "Ujjain");
		cityMap.put(new Key(4, "BPL"), "Bhopal");

		System.out.println("size: --" + cityMap.size());

		Iterator itr = cityMap.keySet().iterator();
		while (itr.hasNext()) {
			System.out.println(cityMap.get(itr.next()));
		}

		System.out.println("Size after iteration: " + cityMap.size());

	}

}
