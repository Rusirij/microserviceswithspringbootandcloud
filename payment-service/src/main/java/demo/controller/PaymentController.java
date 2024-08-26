package demo.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import demo.entity.Payment;
import demo.service.PaymentService;

//create RESTful web services using Spring MVC.
// This annotation is used at the class level and allows the class to handle the requests made by the client.
@RestController
//It is used to map web requests onto specific handler classes and/or handler methods.
@RequestMapping("/payment")
//Slf4j for enabling and using logs
@Slf4j
public class PaymentController
{

	//This annotation is used to inject a dependency into our class.
	@Autowired
	private PaymentService service;

	// This annotated methods handle the HTTP POST requests matched with the given URI expression.
	//Controller mapping called by order service to get the payment response for a order
	@PostMapping("/doPayment")
	public Payment doPayment(@RequestBody Payment payment)
	{
		log.info("In payment service :::");
		return service.doPayment(payment);
	}

	// This annotated methods handle the HTTP GET requests matched with the given URI expression.
	//Controller mapping to get the payment associated with a order
	@GetMapping("/{orderId}")
	public Payment findPaymentHistoryByOrderId(@PathVariable Integer orderId)
	{
		return service.findPaymentHistoryByOrderId(orderId);
	}
	
}
