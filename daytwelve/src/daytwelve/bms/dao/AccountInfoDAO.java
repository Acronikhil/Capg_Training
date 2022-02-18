package daytwelve.bms.dao;

import daytwelve.bms.data.AccountInfo;

public interface AccountInfoDAO {
//	CRUD
	
//	Read
	public AccountInfo getAccountInfoByAccountNo(Integer accountNo);
	public AccountInfo getAllAccountInfo();
	
//	Create
	public Integer addAccountInfo(AccountInfo accountInfo);
	
//	Update
	public Integer UpdateAccountInfo(AccountInfo accountInfo);
	
//	Delete
	public Integer DeleteAccountInfo(Integer accountNo);
	

}
