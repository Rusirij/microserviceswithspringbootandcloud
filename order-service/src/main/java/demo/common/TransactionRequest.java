package demo.common;

import demo.entity.Order;

//TransactionRequest object here represents the request object sent by the client in request while booking an order.
// OrderController expects this object in the request
public class TransactionRequest 
{
	private Order order;
	private Payment payment;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	
}
