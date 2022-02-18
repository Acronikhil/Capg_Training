package orderapp.service;

import java.util.List;

import orderapp.dao.OrderDAO;
import orderapp.dao.OrderDAOImpl;
import orderapp.data.Order;

public class OrderServiceImpl implements OrderService {

	private OrderDAO orderDAO = new OrderDAOImpl();
	
	@Override
	public Order getOrderById(Integer orderId) {
		return orderDAO.getOrderById(orderId);
	}

	@Override
	public List<Order> getAllOrders() {
		return orderDAO.getAllOrders();
	}

	@Override
	public Integer addOrder(Order orderInfo) {
		return orderDAO.addOrder(orderInfo);
	}

	@Override
	public Integer updateOrder(Order updatedOrderInfo) {
		return orderDAO.updateOrder(updatedOrderInfo);
	}

	@Override
	public Integer deleteOrderById(Integer orderId) {
		return orderDAO.deleteOrderById(orderId);
	}

}
