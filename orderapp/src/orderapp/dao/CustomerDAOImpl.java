package orderapp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import orderapp.data.Customer;
import orderapp.exceptions.CustomerNotFoundException;
import orderapp.utils.ColumnNameMapper;
import orderapp.utils.DBConnectionUtils;
import orderapp.utils.QuerryMapper;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerNotFoundException {
		Customer customer = null;
		
		try {
			PreparedStatement preparedStatement = DBConnectionUtils.getDBConnection().prepareStatement(QuerryMapper.GET_CUSTOMER_BY_ID);
			preparedStatement.setInt(1, 1);
			ResultSet rs = preparedStatement.executeQuery();
			
			if(rs.next()) {
				customer.setCustomerId(rs.getInt(ColumnNameMapper.CUSTOMER_COLUMS[0]));
				customer.setCustomerName(rs.getString(ColumnNameMapper.CUSTOMER_COLUMS[1]));
				customer.setBirthDate(rs.getDate(ColumnNameMapper.CUSTOMER_COLUMS[2]).toLocalDate());
				customer.setEmail(rs.getString(ColumnNameMapper.CUSTOMER_COLUMS[4]));
				customer.setMobile(rs.getLong(ColumnNameMapper.CUSTOMER_COLUMS[3]));
				
				return customer;
			}
			else {
				throw new CustomerNotFoundException("Customer Not Found Please Confirm The ID provided.");
			}
			
			
		} catch (SQLException e) {
			throw new CustomerNotFoundException("Customer Not Found Please Confirm The ID provided.");
		}
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customerList = new ArrayList<Customer>();
		return customerList;
	}

	@Override
	public Integer addCustomer(Customer customerInfo) {
		Integer row = 0;
		return row;
	}

	@Override
	public Integer updateCustomer(Customer updatedCustomerInfo) {
		Integer row = 0;
		return row;
	}

	@Override
	public Integer deleteCustomerById(Integer customerId) {
		Integer row = 0;
		return row;
	}

}
