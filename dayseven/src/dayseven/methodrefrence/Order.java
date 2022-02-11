package dayseven.methodrefrence;

import java.util.Currency;
import java.util.Objects;

public class Order {
	private String currency;
	private double amount;
	private double orderAmount;
	
	
	public Order(double a) {
		this.orderAmount = a;
	}

	public Order(String currency, double amount, double orderAmount) {
		super();
		this.currency = currency;
		this.amount = amount;
		this.orderAmount = orderAmount;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, currency);
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(currency, other.currency);
	}

	@Override
	public String toString() {
		return "Order [currency=" + currency + ", amount=" + amount + ", orderAmount=" + orderAmount + "]";
	}

	public Order(String currency, double amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	public static void displayCurrency() {
		System.out.println("Static Method siplay Currency");
	}
	
	public void displayAmount() {
		System.out.println("Display Amount");
	}
	
	public void showInfo() {
		System.out.println("Showing Info");
	}
//	public double getOrderAmount() {
//		return amount;
//	}
	
}
