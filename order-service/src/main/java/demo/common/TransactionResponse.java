package demo.common;

import demo.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//TransactionResponse object here represents the Response object sent to the client while booking an order.
// OrderController sends this object in response, which contains order information along with the payment, transaction id and amount.
@Data
// @Data for automatically adding getter setters to the application.
@AllArgsConstructor
//AllArgsConstructor to generate a constructor for all class's fields
@NoArgsConstructor
//NoArgsConstructor to generate a default constructor
public class TransactionResponse 
{
	private Order order;
	private String transactionId;
	private double amount;
	private String message;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

}
