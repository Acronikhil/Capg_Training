package daynine.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConcurrentHashMapTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcurrentHashMap<String, String> nameMap = new ConcurrentHashMap<String, String>();
		nameMap.put("Name:1 ", "Nikhil");
		nameMap.put("Name:2 ", "Gourav");
		nameMap.put("Name:3 ", "Aman");
		nameMap.put("Name:4 ", "Ananya");
		
		System.out.println("Name Map Before Adding: "+nameMap );
		
		// putIfAbsent
		System.out.println("Isko dekh:"+nameMap.putIfAbsent("Name:1 ", "Nikhil"));
		
		ConcurrentHashMap<String, String> nameMap2 = new ConcurrentHashMap<String, String>();
		nameMap2.put("Name:5", "Jyotika");
		nameMap2.put("Name:6", "Nikhar");
		nameMap2.put("Name:7", "Rohan");
		
		System.out.println("Rohan: "+nameMap2.contains("Rohan"));
		System.out.println(nameMap2.get("Name:6"));
		
		System.out.println("Hai kya: "+nameMap2.containsKey("Name:6"));
		
		System.out.println(nameMap2.contains("Name:6"));
//		
//		nameMap.putAll(nameMap2);
//		
//		System.out.println("Name Map: "+nameMap );
//		
//		System.out.println("---------------- Using Stream -----------------------");
//		
//		nameMap.keySet().stream().collect(Collectors.toSet()).forEach(System.out::println);
//		
//		// entrySet()
//		System.out.println(nameMap.entrySet());
//		
		
		
	}

}
