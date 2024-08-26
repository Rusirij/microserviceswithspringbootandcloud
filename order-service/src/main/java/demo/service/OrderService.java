package demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import demo.common.Payment;
import demo.common.TransactionRequest;
import demo.common.TransactionResponse;
import demo.common.*;
import demo.entity.Order;
import demo.repository.OrderRepository;

//@Service annotation is used to create a bean/object in spring based applications.
// The business logic resides within the service layer, so we use the @Service Annotation to indicate that a class belongs to that layer
@Service
public class OrderService 
{
	//Here we are using order repository to deal with operations performed on order object.
	@Autowired
	private OrderRepository repository;

	//Rest template is used to call RESTful api's via code. we need to autowire RestTemplate here to get response from restful api
	@Autowired
	private RestTemplate template;

	/* Service method representing saving a order and returning the response to the client.
	Method operations:
	1. Receiving order object from Request object
	2. Calling PAYMENT-SERVICE using eureka server to get the payment response for this order.
	3. Saving the order in the database.
	4. Creating TransactionResponse from order and payment object and returning back to client.
	* */
	public TransactionResponse saveOrder(TransactionRequest request)
	{
		String response = "";
		Order order = request.getOrder();
		Payment payment = request.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice());
		
		Payment paymentResponse = template.postForObject("http://PAYMENT-SERVICE/payment/doPayment",payment,Payment.class);
		
		response = paymentResponse.getPaymentStatus().equals("success")?"payment processing successful":"there is a failure";
		
		repository.save(order);
		
		return new TransactionResponse(order, paymentResponse.getTransactionId(), paymentResponse.getAmount(), response);
		//return TransactionResponse();	
		}
}
