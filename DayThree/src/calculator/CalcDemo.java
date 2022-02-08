package calculator;

import java.util.Scanner;

public class CalcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char operator;
		int num1, num2;
		int result=0;
		System.out.println("Choose an operator: +, -, *, /");
		
		Scanner sc = new Scanner(System.in);
		operator = sc.next().charAt(0);
		
		System.out.println("Enter the first number");
		num1 = sc.nextInt();
		
		System.out.println("Enter the second number");
		num2 = sc.nextInt();
		
		switch (operator) {
		case '+': {
			Addition a = new Addition();
			result = a.add(num1, num2);
			break;
		}
		case '-': {
			Subtraction s = new Subtraction();
			result = s.sub(num1, num2);
			
			break;
		}
		case '*': {
			Multiplication m = new Multiplication();
			result = m.mul(num1, num2);
			
			break;
		}
		case '/': {
			Division d = new Division();
			result = d.div(num1, num2);

			break;
		}
		default:
			System.out.println("Wrong Input");
		}
		
		System.out.println(num1+""+operator+""+num2+":"+result);
		
		
		sc.close();
	}

}
