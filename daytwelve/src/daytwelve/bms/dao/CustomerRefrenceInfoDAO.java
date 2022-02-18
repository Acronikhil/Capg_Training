package daytwelve.bms.dao;

import java.util.List;

import daytwelve.bms.data.CustomerRefrenceInfo;

public interface CustomerRefrenceInfoDAO {
//	CRUD

//	Retrive
	public CustomerRefrenceInfo getcustomerRefInfoById(Integer customerId);

	public List<CustomerRefrenceInfo> getAllCustomerRefInfo();

//	Create

	public Integer addCustomerRefInfo(CustomerRefrenceInfo customerRefInfo);

//	Update

	public Integer updateCustomerRefInfo(CustomerRefrenceInfo customerRefInfo);

// Delete

	public Integer deleteCustomerRefInfo(Integer customerId);

}
