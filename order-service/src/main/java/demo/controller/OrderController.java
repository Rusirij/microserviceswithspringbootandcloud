package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.common.*;
import demo.common.TransactionRequest;
import demo.service.OrderService;


//create RESTful web services using Spring MVC.
// This annotation is used at the class level and allows the class to handle the requests made by the client.
@RestController
//It is used to map web requests onto specific handler classes and/or handler methods.
@RequestMapping("/order")
public class OrderController 
{
	//This annotation is used to inject a dependency into our class. Here we are using order service to call saveOrder function.
	@Autowired
	private OrderService service;


	// This annotated methods handle the HTTP POST requests matched with the given URI expression.
	//A restful endpoint to book orders and save them in database
	@PostMapping("/bookOrder")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest request)
	{
		return service.saveOrder(request);
	}
}
