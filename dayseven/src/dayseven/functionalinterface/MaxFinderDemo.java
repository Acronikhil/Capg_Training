package dayseven.functionalinterface;

public class MaxFinderDemo {


	public static void main(String[] args) {
		MaxFinder mf = (num1, num2) -> num1 > num2 ? num1 : num2;
		int max = mf.find(10, 20);
		System.out.println(max);
	}

}
