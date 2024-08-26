package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.entity.Order;

/* JpaRepository is a JPA (Java Persistence API) specific extension of Repository.
 It contains the full API of CrudRepository. It provides inbuilt operations for basic CRUD operations with database.
 Here it is repository for performing all operations associated with an order.
 */

public interface OrderRepository extends JpaRepository<Order,Integer> 
{

}
