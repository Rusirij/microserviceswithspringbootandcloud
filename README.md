# Microservices Design Patterns

In Microservices, some operations will be local (implemented by a single service), while others will be distributed across multiple services. 
A distributed operation is implemented using either synchronously using a protocol such as HTTP/REST or asynchronously using a message broker, such as Apache Kafka.


Please find a demostration of this project via this link:
https://youtu.be/dUwPbXpLzKY

## Implementing Microservices using Eureka discovery and Cloud Gateway

This project implements basic architecture containing two services, Order Service and Payment Service.
The client will be calling Order service to create an order for himself.
Order Service needs to call the payment service to complete the payment of an order.
Implemented Eureka Registry for service discovery and Cloud Gateway for load balancing.

![image](https://github.com/user-attachments/assets/6ade8b79-8da3-46f6-b75f-6b649e543993)
            https://www.edureka.co/blog/microservices-design-patterns



