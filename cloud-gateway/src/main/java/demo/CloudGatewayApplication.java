package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@SpringBootApplication specifies that this application is a spring boot app and will start with a default tomcat server.
@SpringBootApplication
//@EnableEurekaClient to register our application with Eureka server to be able to use it by other services.
@EnableEurekaClient
public class CloudGatewayApplication {

	//Method and way to run the spring boot app
	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayApplication.class, args);
	}

}
// mvn spring-boot:run
