package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;


//@SpringBootApplication specifies that this application is a spring boot app and will start with a default tomcat server.
@SpringBootApplication
//@ComponentScan without arguments tells Spring to scan the current package and all of its sub-package.
@ComponentScan
//@EnableEurekaClient to register our application with Eureka server to be able to use it by other services.
@EnableEurekaClient
public class OrderServiceApplication {

	//Method and way to run the spring boot app
	public static void main(String[] args) 
	{
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	// We are creating RestTemplate Bean here that will be used in OrderService to call RESTful api via code.
	// We are also using load balanced annotation to use load balancer for better handling of requests.
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}

}
