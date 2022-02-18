package daytwelve.bms.data;

import java.time.LocalDate;
import java.util.Objects;

public class CustomerPersonalInfo {

	private String CUSTOMER_ID;
	private String CUSTOMER_NAME;
	private LocalDate DATE_OF_BIRTH;
	private String GUARDIAN_NAME;
	private String ADDRESS;
	private Long CONTACT_NO;
	private String MAIL_ID;
	private String GENDER;
	private String MARITAL_STATUS;
	private String IDENTIFICATION_DOC_TYPE;
	private String ID_DOC_NO;

	@Override
	public int hashCode() {
		return Objects.hash(ADDRESS, CITIZENSHIP, CONTACT_NO, CUSTOMER_ID, CUSTOMER_NAME, DATE_OF_BIRTH, GENDER,
				GUARDIAN_NAME, IDENTIFICATION_DOC_TYPE, ID_DOC_NO, MAIL_ID, MARITAL_STATUS);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerPersonalInfo other = (CustomerPersonalInfo) obj;
		return Objects.equals(ADDRESS, other.ADDRESS) && Objects.equals(CITIZENSHIP, other.CITIZENSHIP)
				&& Objects.equals(CONTACT_NO, other.CONTACT_NO) && Objects.equals(CUSTOMER_ID, other.CUSTOMER_ID)
				&& Objects.equals(CUSTOMER_NAME, other.CUSTOMER_NAME)
				&& Objects.equals(DATE_OF_BIRTH, other.DATE_OF_BIRTH) && Objects.equals(GENDER, other.GENDER)
				&& Objects.equals(GUARDIAN_NAME, other.GUARDIAN_NAME)
				&& Objects.equals(IDENTIFICATION_DOC_TYPE, other.IDENTIFICATION_DOC_TYPE)
				&& Objects.equals(ID_DOC_NO, other.ID_DOC_NO) && Objects.equals(MAIL_ID, other.MAIL_ID)
				&& Objects.equals(MARITAL_STATUS, other.MARITAL_STATUS);
	}

	public String getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}

	public void setCUSTOMER_ID(String cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}

	public String getCUSTOMER_NAME() {
		return CUSTOMER_NAME;
	}

	public void setCUSTOMER_NAME(String cUSTOMER_NAME) {
		CUSTOMER_NAME = cUSTOMER_NAME;
	}

	public LocalDate getDATE_OF_BIRTH() {
		return DATE_OF_BIRTH;
	}

	public void setDATE_OF_BIRTH(LocalDate dATE_OF_BIRTH) {
		DATE_OF_BIRTH = dATE_OF_BIRTH;
	}

	public String getGUARDIAN_NAME() {
		return GUARDIAN_NAME;
	}

	public void setGUARDIAN_NAME(String gUARDIAN_NAME) {
		GUARDIAN_NAME = gUARDIAN_NAME;
	}

	public String getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}

	public Long getCONTACT_NO() {
		return CONTACT_NO;
	}

	public void setCONTACT_NO(Long cONTACT_NO) {
		CONTACT_NO = cONTACT_NO;
	}

	public String getMAIL_ID() {
		return MAIL_ID;
	}

	public void setMAIL_ID(String mAIL_ID) {
		MAIL_ID = mAIL_ID;
	}

	public String getGENDER() {
		return GENDER;
	}

	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}

	public String getMARITAL_STATUS() {
		return MARITAL_STATUS;
	}

	public void setMARITAL_STATUS(String mARITAL_STATUS) {
		MARITAL_STATUS = mARITAL_STATUS;
	}

	public String getIDENTIFICATION_DOC_TYPE() {
		return IDENTIFICATION_DOC_TYPE;
	}

	public void setIDENTIFICATION_DOC_TYPE(String iDENTIFICATION_DOC_TYPE) {
		IDENTIFICATION_DOC_TYPE = iDENTIFICATION_DOC_TYPE;
	}

	public String getID_DOC_NO() {
		return ID_DOC_NO;
	}

	public void setID_DOC_NO(String iD_DOC_NO) {
		ID_DOC_NO = iD_DOC_NO;
	}

	public String getCITIZENSHIP() {
		return CITIZENSHIP;
	}

	public void setCITIZENSHIP(String cITIZENSHIP) {
		CITIZENSHIP = cITIZENSHIP;
	}

	@Override
	public String toString() {
		return "CustomerPersonalInfo [CUSTOMER_ID=" + CUSTOMER_ID + ", CUSTOMER_NAME=" + CUSTOMER_NAME
				+ ", DATE_OF_BIRTH=" + DATE_OF_BIRTH + ", GUARDIAN_NAME=" + GUARDIAN_NAME + ", ADDRESS=" + ADDRESS
				+ ", CONTACT_NO=" + CONTACT_NO + ", MAIL_ID=" + MAIL_ID + ", GENDER=" + GENDER + ", MARITAL_STATUS="
				+ MARITAL_STATUS + ", IDENTIFICATION_DOC_TYPE=" + IDENTIFICATION_DOC_TYPE + ", ID_DOC_NO=" + ID_DOC_NO
				+ ", CITIZENSHIP=" + CITIZENSHIP + "]";
	}

	public CustomerPersonalInfo(String cUSTOMER_ID, String cUSTOMER_NAME, LocalDate dATE_OF_BIRTH, String gUARDIAN_NAME,
			String aDDRESS, Long cONTACT_NO, String mAIL_ID, String gENDER, String mARITAL_STATUS,
			String iDENTIFICATION_DOC_TYPE, String iD_DOC_NO, String cITIZENSHIP) {
		super();
		CUSTOMER_ID = cUSTOMER_ID;
		CUSTOMER_NAME = cUSTOMER_NAME;
		DATE_OF_BIRTH = dATE_OF_BIRTH;
		GUARDIAN_NAME = gUARDIAN_NAME;
		ADDRESS = aDDRESS;
		CONTACT_NO = cONTACT_NO;
		MAIL_ID = mAIL_ID;
		GENDER = gENDER;
		MARITAL_STATUS = mARITAL_STATUS;
		IDENTIFICATION_DOC_TYPE = iDENTIFICATION_DOC_TYPE;
		ID_DOC_NO = iD_DOC_NO;
		CITIZENSHIP = cITIZENSHIP;
	}

	public CustomerPersonalInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String CITIZENSHIP;

}
