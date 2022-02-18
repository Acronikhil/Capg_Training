package daytwelve.bms.dao;

import java.util.ArrayList;
import java.util.List;

import daytwelve.bms.data.CustomerRefrenceInfo;

public class CustomerRefrenceInfoDAOImpl implements CustomerRefrenceInfoDAO {

	@Override
	public CustomerRefrenceInfo getcustomerRefInfoById(Integer customerId) {
		CustomerRefrenceInfo customerRefInfo = null;
		return customerRefInfo;
	}

	@Override
	public List<CustomerRefrenceInfo> getAllCustomerRefInfo() {
		List<CustomerRefrenceInfo> customerRefInfoList = new ArrayList<CustomerRefrenceInfo>();
		return customerRefInfoList;
	}

	@Override
	public Integer addCustomerRefInfo(CustomerRefrenceInfo customerRefInfo) {
		Integer row = 0;
		return row;
	}

	@Override
	public Integer updateCustomerRefInfo(CustomerRefrenceInfo customerRefInfo) {
		Integer row = 0;
		return row;
	}

	@Override
	public Integer deleteCustomerRefInfo(Integer customerId) {
		Integer row = 0;
		return row;
	}

}
