package dayeleven.jdbcapp.data;

import java.time.LocalDate;
import java.util.Objects;

public class Customer {
	private Integer customerId;
	private String customerName;
	private LocalDate birthDate;
	private Long mobile;
	private String email;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer customerId, String customerName, LocalDate birthDate, Long mobile, String email) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.birthDate = birthDate;
		this.mobile = mobile;
		this.email = email;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthDate, customerId, customerName, email, mobile);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(birthDate, other.birthDate) && Objects.equals(customerId, other.customerId)
				&& Objects.equals(customerName, other.customerName) && Objects.equals(email, other.email)
				&& Objects.equals(mobile, other.mobile);
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", birthDate=" + birthDate
				+ ", mobile=" + mobile + ", email=" + email + "]";
	}

}
