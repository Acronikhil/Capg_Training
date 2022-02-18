package orderapp.utils;

public interface ColumnNameMapper {

	final public static String[] ORDER_COLUMS = { "orderId", "customerId", "productId", "quantity", "orderAmount" };

	final public static String[] CUSTOMER_COLUMS = { "customerId", "customerName", "birthDate", "mobile", "email" };

	final public static String[] PRODUCT_COLUMS = { "productId", "productName", "description", "price" };

}
