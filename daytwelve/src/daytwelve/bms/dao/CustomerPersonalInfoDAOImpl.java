package daytwelve.bms.dao;

import java.util.ArrayList;
import java.util.List;

import daytwelve.bms.data.CustomerPersonalInfo;

public class CustomerPersonalInfoDAOImpl implements CustomerPersonalInfoDAO {
//	CRUD

//	Retrive

	@Override
	public CustomerPersonalInfo getCustomerInfoById(Integer customerId) {
		CustomerPersonalInfo customerInfo = null;
		return customerInfo;
	}

	@Override
	public List<CustomerPersonalInfo> getAllCustomerInfo() {
		List<CustomerPersonalInfo> customerInfoList = new ArrayList<CustomerPersonalInfo>();
		return customerInfoList;
	}

//	Create
	@Override
	public Integer addCustomerInfo(CustomerPersonalInfo customerInfo) {
		int row = 0;

		return row;
	};

//	Update
	@Override
	public Integer updateCustomerInfo(CustomerPersonalInfo customerInfo) {
		int row = 0;

		return row;
	}

// Delete

	public Integer deleteCustomerInfo(Integer customerId) {
		int row = 0;

		return row;
	}

}
