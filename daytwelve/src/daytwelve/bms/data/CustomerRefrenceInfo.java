package daytwelve.bms.data;

import java.util.Objects;

public class CustomerRefrenceInfo {

	private String CUSTOMER_ID;
	private String REFERENCE_ACC_NAME;
	private Long REFERENCE_ACC_NO;

	public String getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}

	public void setCUSTOMER_ID(String cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}

	public String getREFERENCE_ACC_NAME() {
		return REFERENCE_ACC_NAME;
	}

	public void setREFERENCE_ACC_NAME(String rEFERENCE_ACC_NAME) {
		REFERENCE_ACC_NAME = rEFERENCE_ACC_NAME;
	}

	public Long getREFERENCE_ACC_NO() {
		return REFERENCE_ACC_NO;
	}

	public void setREFERENCE_ACC_NO(Long rEFERENCE_ACC_NO) {
		REFERENCE_ACC_NO = rEFERENCE_ACC_NO;
	}

	public String getREFERENCE_ACC_ADDRESS() {
		return REFERENCE_ACC_ADDRESS;
	}

	public void setREFERENCE_ACC_ADDRESS(String rEFERENCE_ACC_ADDRESS) {
		REFERENCE_ACC_ADDRESS = rEFERENCE_ACC_ADDRESS;
	}

	public String getRELATION() {
		return RELATION;
	}

	public void setRELATION(String rELATION) {
		RELATION = rELATION;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CUSTOMER_ID, REFERENCE_ACC_ADDRESS, REFERENCE_ACC_NAME, REFERENCE_ACC_NO, RELATION);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerRefrenceInfo other = (CustomerRefrenceInfo) obj;
		return Objects.equals(CUSTOMER_ID, other.CUSTOMER_ID)
				&& Objects.equals(REFERENCE_ACC_ADDRESS, other.REFERENCE_ACC_ADDRESS)
				&& Objects.equals(REFERENCE_ACC_NAME, other.REFERENCE_ACC_NAME)
				&& Objects.equals(REFERENCE_ACC_NO, other.REFERENCE_ACC_NO) && Objects.equals(RELATION, other.RELATION);
	}

	@Override
	public String toString() {
		return "CustomerRefrenceInfo [CUSTOMER_ID=" + CUSTOMER_ID + ", REFERENCE_ACC_NAME=" + REFERENCE_ACC_NAME
				+ ", REFERENCE_ACC_NO=" + REFERENCE_ACC_NO + ", REFERENCE_ACC_ADDRESS=" + REFERENCE_ACC_ADDRESS
				+ ", RELATION=" + RELATION + "]";
	}

	public CustomerRefrenceInfo(String cUSTOMER_ID, String rEFERENCE_ACC_NAME, Long rEFERENCE_ACC_NO,
			String rEFERENCE_ACC_ADDRESS, String rELATION) {
		super();
		CUSTOMER_ID = cUSTOMER_ID;
		REFERENCE_ACC_NAME = rEFERENCE_ACC_NAME;
		REFERENCE_ACC_NO = rEFERENCE_ACC_NO;
		REFERENCE_ACC_ADDRESS = rEFERENCE_ACC_ADDRESS;
		RELATION = rELATION;
	}

	public CustomerRefrenceInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String REFERENCE_ACC_ADDRESS;
	private String RELATION;

}
