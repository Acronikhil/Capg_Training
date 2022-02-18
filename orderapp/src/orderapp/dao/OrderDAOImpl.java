package orderapp.dao;

import java.util.ArrayList;
import java.util.List;

import orderapp.data.Order;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public Order getOrderById(Integer orderId) {
		Order order = null;
		return order;
	}

	@Override
	public List<Order> getAllOrders() {
		List<Order> orderList = new ArrayList<Order>();
		return orderList;
	}

	@Override
	public Integer addOrder(Order orderInfo) {
		Integer row = 0;
		return row;
	}

	@Override
	public Integer updateOrder(Order updatedOrderInfo) {
		Integer row = 0;
		return row;
	}

	@Override
	public Integer deleteOrderById(Integer orderId) {
		Integer row = 0;
		return row;
	}

}
