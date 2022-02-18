package dayeleven.jdbcapp.util;

public interface QuerryMapper {
	
	public final String GET_CUSTOMER_By_Id = "SELECT * from customer where customerId =?";
	public final String GET_ALL_CUSTOMER = "SELECT * from customer";
	public final String ADD_CUSTOMER = "INSERT INTO CUSTOMER(customerId, customerName, birthDate, mobile, email) VALUES (?,?,?,?,?) ";
	public final String DELETE_CUSTOMER = "DELETE from customer where customerId =?";
	public final String UPDATE_CUSTOMER = "UPDATE CUSTOMER SET customerName=? WHERE customerName = ?";
}
