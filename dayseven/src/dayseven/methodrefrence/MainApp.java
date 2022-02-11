package dayseven.methodrefrence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp {

	public static void main(String[] args) {
		Order order1 = new Order("AUD", 15000);
		Order order2 = new Order("INR", 35400);
		Order order3 = new Order("EUR", 89721);
		Order order4 = new Order("INR", 95400);
		Order order5 = new Order("USD", 5346);

		List<Order> orderList = new ArrayList<Order>();
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		orderList.add(order4);
		orderList.add(order5);

		System.out.println(orderList);
		// Sort order list on the basis of order amount
		Collections.sort(orderList, new AmountComparator());
		System.out.println(orderList);

		Collections.sort(orderList, Comparator.comparing(Order::getAmount));
		Collections.reverse(orderList);
//
//		System.out.println(orderList);
//		orderList.forEach(System.out::println);
//
//		Collections.sort(orderList, Comparator.comparing(Order::getCurrency));
//
//		System.out.println(orderList);
//		orderList.forEach(System.out::println);
//		
//		// Static method refrence example
//		DisplayInformation displ = Order::displayCurrency;
//		displ.display();
//		
//		// Refrence to instance method
//		DisplayInformation displayInfo = order1::displayAmount;
//		displayInfo.display();
//		
//		DisplayInformation anyInfo = order1::showInfo;
//		anyInfo.display();
//		
//		OrderAmount orderAmount = Order::new;
//		System.out.println(orderAmount.getOrderAmount(4760.83));
//		
//		SetOrder setOrder = Order::new;
//		System.out.println(setOrder.setOrder("INR",541.13, 8450.648));
	}

}
