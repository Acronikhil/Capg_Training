package dayeleven.jdbcapp.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import dayeleven.jdbcapp.data.Customer;
import dayeleven.jdbcapp.exceptions.CustomerAlreadyExistsException;
import dayeleven.jdbcapp.exceptions.CustomerNotFoundException;
import dayeleven.jdbcapp.util.DBConnectionUtils;
import dayeleven.jdbcapp.util.QuerryMapper;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerNotFoundException, CustomerAlreadyExistsException {

		String[] strArr = { "customerID", "customerName", "birthDate", "mobile", "email" };
		Customer customer = new Customer();

		try {
			PreparedStatement preparedStatement = DBConnectionUtils.getDBConnection()
					.prepareStatement(QuerryMapper.GET_CUSTOMER_By_Id);
			preparedStatement.setInt(1, customerId);
			ResultSet result = preparedStatement.executeQuery();
			
			
			while (result.next()) {

				customer.setCustomerId(result.getInt(strArr[0]));
				customer.setCustomerName(result.getString(strArr[1]));
				customer.setBirthDate(result.getDate(strArr[2]).toLocalDate());
				customer.setMobile(result.getLong(strArr[3]));
				customer.setEmail(result.getString(strArr[4]));
				return customer;
			}
			
			if(result.getRow() == 0) {
				throw new CustomerNotFoundException("Customer Not Found With This Id");
			}
			
		}
		catch (SQLIntegrityConstraintViolationException sicve) {
			throw new CustomerAlreadyExistsException("Customer Already Exists");
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return customer;
	}

//	@Test
//	public void getCustomerTest() {
//		Customer cust = new Customer();
//		cust.getCustomerId()
//	}
	
	
	@Override
	public List<Customer> getAllCustomers() throws CustomerNotFoundException {

		String[] strArr = { "customerID", "customerName", "birthDate", "mobile", "email" };
		List<Customer> customerList = new ArrayList<Customer>();

		try {
			Statement statement = DBConnectionUtils.getDBConnection().createStatement();
			ResultSet result = statement.executeQuery(QuerryMapper.GET_ALL_CUSTOMER);

			while (result.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(result.getInt(strArr[0]));
				customer.setCustomerName(result.getString(strArr[1]));
				customer.setBirthDate(result.getDate(strArr[2]).toLocalDate());
				customer.setMobile(result.getLong(strArr[3]));
				customer.setEmail(result.getString(strArr[4]));

				customerList.add(customer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		
			if(customerList.isEmpty())
			{
				throw new CustomerNotFoundException("Customer Not Found No Recors Exists");
			}
		
		
		return customerList;
	}

	@Override
	public Integer addCustomer(Customer customer) {

		int row = 0;
		try {
			

			PreparedStatement preparedStatement = DBConnectionUtils.getDBConnection()
					.prepareStatement(QuerryMapper.ADD_CUSTOMER);
			preparedStatement.setInt(1, customer.getCustomerId());
			preparedStatement.setString(2, customer.getCustomerName());
			preparedStatement.setDate(3, Date.valueOf(customer.getBirthDate()));
			preparedStatement.setLong(4, customer.getMobile());
			preparedStatement.setString(5, customer.getEmail());
			row = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return row;
	}

	@Override
	public Integer updateCustomer(Customer customer) {

		int row = 0;

		try {
			PreparedStatement preparedStatement = DBConnectionUtils.getDBConnection()
					.prepareStatement(QuerryMapper.UPDATE_CUSTOMER);
			preparedStatement.setString(1, "Aditya Patel");
			preparedStatement.setString(2, customer.getCustomerName());
			row = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public Integer deleteCustomer(Integer customerId) {

		int row = 0;

		try {

			PreparedStatement preparedStatement = DBConnectionUtils.getDBConnection()
					.prepareStatement(QuerryMapper.DELETE_CUSTOMER);
			preparedStatement.setInt(1, customerId);
			row = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}

}
