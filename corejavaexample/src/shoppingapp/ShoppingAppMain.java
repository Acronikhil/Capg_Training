package shoppingapp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ShoppingAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(1L,"Nikhil Dubey",1);
		Product product = new Product(1L, "IPhone 13", "Mobile Phones", 150542.20);
		Product productOne = new Product(2L, "IPhone X", "Mobile Phones", 95542.20);
		
//		Create a  list of Product using java collection List and ArrayList
		List<Product> productList = new ArrayList<>();
		productList.add(productOne);
		productList.add(product);
		
		Order order = new Order();
		order.setCustomer(customer);
		order.setDeliveryDate(LocalDate.now());
		order.setId(1L);
		order.setStatus("In Transit");
		order.setProduct(productList);
		
		Order orderOne = new Order();
		orderOne.setCustomer(customer);
		orderOne.setDeliveryDate(LocalDate.now());
		orderOne.setId(2L);
		orderOne.setStatus("Out for delivery");
		orderOne.setProduct(productList);
		
		List<Order> orders = new ArrayList<>();
		orders.add(orderOne);
		orders.add(order);
		
//		List down the orders with status in Transit
//		Write the logic to fing order whose status is in Transit
		
		

	}

}
