package daynine.hrms.app;

import java.util.Scanner;

import daynine.hrms.exceptions.EmployeeNotFoundException;
import daynine.hrms.exceptions.NoEmployeeFoundException;

public class HRMSAppMain {

	public static void main(String[] args) throws EmployeeNotFoundException {
		Scanner sc = new Scanner(System.in);
		Integer response = 0;
		boolean exit = false;

		EmpOps ops = new EmpOps();

		while (!exit) {
			System.out.println(
					"To search Employee press 1\nTo Add Employee press 2\nTo view all Employee 3\nTo exit press 4\n -> ");
			response = sc.nextInt();

			System.out.println();

			switch (response) {
			case 1: {
				ops.findEmp();
				
				break;
			}
			case 2: {
//				System.out.println("2");
				ops.addEmp();

				break;
			}
			case 3: {
//				System.out.println("3");
				try {
					ops.allEmp();
				} catch (NoEmployeeFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			}
			case 4: {
//				System.out.println("Thank You");
				exit = true;
				break;
			}

			default:
				System.out.println("Wrong Inp");

			}
		}

//		ops.findEmp();

	}

}
