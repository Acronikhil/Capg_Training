package assissment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public boolean saveEmployeeDetails(int id, String name, String address, int salary) {
		
		int row = 0;
		
		String ADD_EMPLOYEE = "INSERT INTO	employee(id, name, address, salary) VALUES(?,?,?,?)";
		
		String url = "jdbc:mysql://localhost:3306/demodb";
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, "postgres", "root");
			PreparedStatement preparedStatement = conn.prepareStatement(ADD_EMPLOYEE);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, address);
			preparedStatement.setInt(4, salary);
			row = preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(row == 1) {
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		if(d.saveEmployeeDetails(2, "Nikhil", "DEWAS", 60000)) {
			System.out.println("Saved Successfully!");
		}
		else {
			System.out.println("Not Saved in database");
		}
		
		List<Integer> listOfInteger = new ArrayList<Integer>();
		listOfInteger.add(1);
		listOfInteger.add(2);
		listOfInteger.add(3);
		listOfInteger.add(4);
		listOfInteger.add(5);
		Collections.reverse(listOfInteger);
		for(Integer li: listOfInteger) {
			System.out.println(li);
		}
		
		
		listOfInteger.forEach(System.out::println);
		
			
	}

}
