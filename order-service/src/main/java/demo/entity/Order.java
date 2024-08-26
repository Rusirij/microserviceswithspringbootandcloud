package demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/* Order represents here the table in in-memory database with id, name, qty and price */

//Specifies that the class is a table.
//This annotation can be applied on Class, Interface of Enums.
@Entity
//The @Table annotation allows you to specify the details of the table that will be used to persist the entity in the database.
@Table(name = "ORDER_TB")
// @Data for automatically adding getter setters to the application.
@Data
//AllArgsConstructor to generate a constructor for all class's fields
@AllArgsConstructor
//NoArgsConstructor to generate a default constructor
@NoArgsConstructor
public class Order 
{
	//@Id specifies the column is a unique column in database. It is primary key
	@Id
    private int id;
    private String name;
    private int qty;
    private double price;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
