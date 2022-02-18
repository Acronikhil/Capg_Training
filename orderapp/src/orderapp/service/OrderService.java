package orderapp.service;

import java.util.List;

import orderapp.data.Order;

public interface OrderService {
	
//	CRUD
	
//	READ
	public Order getOrderById(Integer orderId);
	public List<Order> getAllOrders();
	
//	Create 
	public Integer addOrder(Order orderInfo);
	
//	Update 
	public Integer updateOrder(Order updatedOrderInfo);
	
// Delete
	public Integer deleteOrderById(Integer orderId);

}
