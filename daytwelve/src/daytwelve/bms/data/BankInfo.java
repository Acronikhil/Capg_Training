package daytwelve.bms.data;

import java.util.Objects;

public class BankInfo {

	private String IFSC_CODE;
	private String BANK_NAME;
	private String BRANCH_NAME;

	public String getIFSC_CODE() {
		return IFSC_CODE;
	}

	public void setIFSC_CODE(String iFSC_CODE) {
		IFSC_CODE = iFSC_CODE;
	}

	public String getBANK_NAME() {
		return BANK_NAME;
	}

	public void setBANK_NAME(String bANK_NAME) {
		BANK_NAME = bANK_NAME;
	}

	public String getBRANCH_NAME() {
		return BRANCH_NAME;
	}

	public void setBRANCH_NAME(String bRANCH_NAME) {
		BRANCH_NAME = bRANCH_NAME;
	}

	@Override
	public int hashCode() {
		return Objects.hash(BANK_NAME, BRANCH_NAME, IFSC_CODE);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankInfo other = (BankInfo) obj;
		return Objects.equals(BANK_NAME, other.BANK_NAME) && Objects.equals(BRANCH_NAME, other.BRANCH_NAME)
				&& Objects.equals(IFSC_CODE, other.IFSC_CODE);
	}

	@Override
	public String toString() {
		return "BankInfo [IFSC_CODE=" + IFSC_CODE + ", BANK_NAME=" + BANK_NAME + ", BRANCH_NAME=" + BRANCH_NAME + "]";
	}

	public BankInfo(String iFSC_CODE, String bANK_NAME, String bRANCH_NAME) {
		super();
		IFSC_CODE = iFSC_CODE;
		BANK_NAME = bANK_NAME;
		BRANCH_NAME = bRANCH_NAME;
	}

	public BankInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
