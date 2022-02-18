package daytwelve.bms.data;

import java.time.LocalDate;
import java.util.Objects;

public class AccountInfo {

	private Long ACCOUNT_NO;
	private String CUSTOMER_ID;
	private String ACCOUNT_TYPE;
	private LocalDate REGISTRATION_DATE;
	private LocalDate ACTIVATION_DATE;

	public Long getACCOUNT_NO() {
		return ACCOUNT_NO;
	}

	public void setACCOUNT_NO(Long aCCOUNT_NO) {
		ACCOUNT_NO = aCCOUNT_NO;
	}

	public String getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}

	public void setCUSTOMER_ID(String cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}

	public String getACCOUNT_TYPE() {
		return ACCOUNT_TYPE;
	}

	public void setACCOUNT_TYPE(String aCCOUNT_TYPE) {
		ACCOUNT_TYPE = aCCOUNT_TYPE;
	}

	public LocalDate getREGISTRATION_DATE() {
		return REGISTRATION_DATE;
	}

	public void setREGISTRATION_DATE(LocalDate rEGISTRATION_DATE) {
		REGISTRATION_DATE = rEGISTRATION_DATE;
	}

	public LocalDate getACTIVATION_DATE() {
		return ACTIVATION_DATE;
	}

	public void setACTIVATION_DATE(LocalDate aCTIVATION_DATE) {
		ACTIVATION_DATE = aCTIVATION_DATE;
	}

	public String getIFSC_CODE() {
		return IFSC_CODE;
	}

	public void setIFSC_CODE(String iFSC_CODE) {
		IFSC_CODE = iFSC_CODE;
	}

	public Double getINTEREST() {
		return INTEREST;
	}

	public void setINTEREST(Double iNTEREST) {
		INTEREST = iNTEREST;
	}

	public Long getINITIAL_DEPOSIT() {
		return INITIAL_DEPOSIT;
	}

	public void setINITIAL_DEPOSIT(Long iNITIAL_DEPOSIT) {
		INITIAL_DEPOSIT = iNITIAL_DEPOSIT;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ACCOUNT_NO, ACCOUNT_TYPE, ACTIVATION_DATE, CUSTOMER_ID, IFSC_CODE, INITIAL_DEPOSIT,
				INTEREST, REGISTRATION_DATE);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountInfo other = (AccountInfo) obj;
		return Objects.equals(ACCOUNT_NO, other.ACCOUNT_NO) && Objects.equals(ACCOUNT_TYPE, other.ACCOUNT_TYPE)
				&& Objects.equals(ACTIVATION_DATE, other.ACTIVATION_DATE)
				&& Objects.equals(CUSTOMER_ID, other.CUSTOMER_ID) && Objects.equals(IFSC_CODE, other.IFSC_CODE)
				&& Objects.equals(INITIAL_DEPOSIT, other.INITIAL_DEPOSIT) && Objects.equals(INTEREST, other.INTEREST)
				&& Objects.equals(REGISTRATION_DATE, other.REGISTRATION_DATE);
	}

	@Override
	public String toString() {
		return "AccountInfo [ACCOUNT_NO=" + ACCOUNT_NO + ", CUSTOMER_ID=" + CUSTOMER_ID + ", ACCOUNT_TYPE="
				+ ACCOUNT_TYPE + ", REGISTRATION_DATE=" + REGISTRATION_DATE + ", ACTIVATION_DATE=" + ACTIVATION_DATE
				+ ", IFSC_CODE=" + IFSC_CODE + ", INTEREST=" + INTEREST + ", INITIAL_DEPOSIT=" + INITIAL_DEPOSIT + "]";
	}

	public AccountInfo(Long aCCOUNT_NO, String cUSTOMER_ID, String aCCOUNT_TYPE, LocalDate rEGISTRATION_DATE,
			LocalDate aCTIVATION_DATE, String iFSC_CODE, Double iNTEREST, Long iNITIAL_DEPOSIT) {
		super();
		ACCOUNT_NO = aCCOUNT_NO;
		CUSTOMER_ID = cUSTOMER_ID;
		ACCOUNT_TYPE = aCCOUNT_TYPE;
		REGISTRATION_DATE = rEGISTRATION_DATE;
		ACTIVATION_DATE = aCTIVATION_DATE;
		IFSC_CODE = iFSC_CODE;
		INTEREST = iNTEREST;
		INITIAL_DEPOSIT = iNITIAL_DEPOSIT;
	}

	public AccountInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String IFSC_CODE;
	private Double INTEREST;
	private Long INITIAL_DEPOSIT;

}
