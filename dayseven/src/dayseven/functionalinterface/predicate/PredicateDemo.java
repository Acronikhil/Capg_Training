package dayseven.functionalinterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateDemo {
	public static void main(String[] args) {
		List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5,6,8,9,10,11,12,13,14,15,16,17,18,19,20);
		
		List<Integer> collect = listOfInteger.stream().filter(x->x>5).collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
