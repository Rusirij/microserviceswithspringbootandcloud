package demo.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.entity.Payment;
import demo.repository.PaymentRepository;


//@Service annotation is used to create a bean/object in spring based applications.
// The business logic resides within the service layer, so we use the @Service Annotation to indicate that a class belongs to that layer
@Service
public class PaymentService 
{

//Here we are using payment repository to deal with operations performed on payment object.
	@Autowired
	private PaymentRepository repository;

	//Method to deal with payment for a order. We are setting payment status and transaction id and then saving the payment in
	// in-memory database
	public Payment doPayment(Payment payment)
	{
		payment.setPaymentStatus(paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString());
		return repository.save(payment);
	}

	// Method to mark payment either true or false
	public String paymentProcessing()
	{
		// for others payment
		return new Random().nextBoolean()?"success":"false";
	}

	// Method to find a payment object associated with a order. We call jpa repository to get the payment details for a order.
	public Payment findPaymentHistoryByOrderId(int orderId) {
		
		// TODO Auto-generated method stub
		return repository.findByOrderId(orderId);
	}
}
