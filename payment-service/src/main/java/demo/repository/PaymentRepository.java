package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.entity.*;

/* JpaRepository is a JPA (Java Persistence API) specific extension of Repository.
 It contains the full API of CrudRepository. It provides inbuilt operations for basic CRUD operations with database.
 Here it is repository for performing all operations associated with a payment.
 */
public interface PaymentRepository extends JpaRepository<Payment,Integer>
{

	//Defining a method for finding by order id. We just nned to call the method with order id and it will give us the payment info.
	Payment findByOrderId(int orderId);

}
