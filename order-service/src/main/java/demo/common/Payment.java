package demo.common;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* This class represents Payment object that has a id, status, transaction id and is associated with an order */

// @Data for automatically adding getter setters to the application.
@Data
//AllArgsConstructor to generate a constructor for all class's fields
@AllArgsConstructor
//NoArgsConstructor to generate a default constructor
@NoArgsConstructor
public class Payment 
{	
	private int paymentId;
	private String paymentStatus;
	private String transactionId;
	private int orderId;
	private double amount;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	
}
