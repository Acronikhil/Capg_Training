package orderapp.data;

public class Order {

	private Integer orderId;
	private Integer customerId;
	private Integer productId;
	private Integer quantity;
	private Long orderAmount;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Long getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerId=" + customerId + ", productId=" + productId + ", quantity="
				+ quantity + ", orderAmount=" + orderAmount + "]";
	}

	public Order(Integer orderId, Integer customerId, Integer productId, Integer quantity, Long orderAmount) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.productId = productId;
		this.quantity = quantity;
		this.orderAmount = orderAmount;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

}
