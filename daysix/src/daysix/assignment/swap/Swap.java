package daysix.assignment.swap;

public class Swap<T> {
	public static <T> T[]swap(T[] list, int firstPos, int secondPos){
		
		T tempVar;
		tempVar = list[firstPos];
		list[firstPos] = list[secondPos];
		list[secondPos] = tempVar;
		
		
		return list;
		
	}

}
