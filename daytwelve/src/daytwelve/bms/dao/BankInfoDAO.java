package daytwelve.bms.dao;

import daytwelve.bms.data.BankInfo;

public interface BankInfoDAO {
	
//	CRUD
	
//	Read
	public BankInfo getBankInfoByIFSCNo(String IFSCNo);
	public BankInfo getAllBankInfo();
	
//	Create
	public Integer addBankInfo(String IFSCNo);
	
//	Update
	public Integer UpdateBankInfo(String IFSCInfo);
	
//	Delete
	public Integer DeleteBankInfo(String IFSCNo);
	
	

}
