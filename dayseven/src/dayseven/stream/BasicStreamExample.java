package dayseven.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicStreamExample {
	public static void main(String[] args) {
		List<Integer> listOfInteger = Arrays.asList(15,11,10,9,12,13,54,68,4);
		
		listOfInteger.stream()//source of stream
			.filter(num->num>3)//operation
			.limit(5)// restricting stream processing for the first 5 elements
			.forEach(System.out::println);
	
		System.out.println("---------------------------------");
	
		Stream<Integer> streams = listOfInteger.stream();
		Stream<Integer> filteredStream =  streams.filter(num->num>10);
//		Stream<Integer> limitedStream = filteredStream.limit(5);
		
		
//		Stream<Integer> skipedStream = filteredStream.skip(5);// stream processing skips first  5 elements
		
//		streams.forEach(System.out::println);
		System.out.println("-------------------");
//		filteredStream.forEach(System.out::println);
//		System.out.println("--------------------");
//		limitedStream.forEach(System.out::println);
//		skipedStream.forEach(System.out::println);
		
		System.out.println("------------- Example of map-------------------------");
		
		List<String> words = Arrays.asList("Hello","How", "Are","You");
		words.stream().map(str->str.length()).forEach(System.out::println);
		
		List<Integer> counts = words.stream().map(str->str.length()).collect(Collectors.toList());
				counts.forEach(System.out::println);
		System.out.println(counts);
		
		
	}
	

}
