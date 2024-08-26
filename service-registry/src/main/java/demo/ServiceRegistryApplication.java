package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//@SpringBootApplication specifies that this application is a spring boot app and will start with a default tomcat server.
@SpringBootApplication
@EnableEurekaServer
// The @EnableEurekaServer annotation is used to make your Spring Boot application acts as a Eureka Server.
public class ServiceRegistryApplication {

	//Method and way to run the spring boot app
	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

}
