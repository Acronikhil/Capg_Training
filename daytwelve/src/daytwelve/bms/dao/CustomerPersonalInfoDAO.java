package daytwelve.bms.dao;

import java.util.List;

import daytwelve.bms.data.CustomerPersonalInfo;

public interface CustomerPersonalInfoDAO {

//	CRUD

//	Retrive
	public CustomerPersonalInfo getCustomerInfoById(Integer customerId);

	public List<CustomerPersonalInfo> getAllCustomerInfo();

//	Create

	public Integer addCustomerInfo(CustomerPersonalInfo customerInfo);

//	Update

	public Integer updateCustomerInfo(CustomerPersonalInfo customerInfo);

// Delete

	public Integer deleteCustomerInfo(Integer customerId);

}
