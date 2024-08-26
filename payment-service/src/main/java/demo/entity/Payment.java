package demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Specifies that the class is a table.
//This annotation can be applied on Class, Interface of Enums.
@Entity
//The @Table annotation allows you to specify the details of the table that will be used to persist the entity in the database.
@Table(name = "PAYMENT_TB")
// @Data for automatically adding getter setters to the application.
@Data
//AllArgsConstructor to generate a constructor for all class's fields
@AllArgsConstructor
//NoArgsConstructor to generate a default constructor
@NoArgsConstructor
public class Payment 
{
	//@Id specifies the column is a unique column in database. It is primary key
	@Id
	@GeneratedValue
	private int paymentId;
	private String paymentStatus;
	private String transactionId;
	private int orderId;
	private double amount;
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
	

	
}
