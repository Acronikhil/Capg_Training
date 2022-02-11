package dayseven.functionalinterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	
	public static void main(String[] args) {
		
		Consumer<String> display = x -> System.out.println(x);
		display.accept("Consumer Funcitonal Interface usage");
		
		
		List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5,6);
		
		
		
		Consumer<Integer> consumer = x-> System.out.println(x);
		listOfInteger.forEach(consumer);
		
		System.out.println("-----------------");
		
		listOfInteger.forEach((Integer x)-> System.out.println(x));
//		System.out.println(consumer);
	}
}
