3D CINEMA Project
Welcome to the 3D CINEMA project repository! This project aims to provide a comprehensive microservice architecture for managing cinema operations including ticketing and payments. Below is an overview of the components and functionalities included in this project:

Components
Ticket Service: This microservice handles ticket management functionalities such as ticket booking, cancellation, and retrieval.

Payment Service: The payment microservice is responsible for processing payment transactions for booked tickets.

Features
Eureka Service Discovery: The microservices are registered with Eureka Service Discovery for dynamic service registration and discovery.

Spring Cloud Gateway: Integration of Spring Cloud Gateway enables routing of user requests to the appropriate microservices.

Spring Cloud Config Server: Utilization of Spring Cloud Config Server with Git allows centralized configuration management across all microservices.

ELK Stack: Centralized logging across all microservices is achieved using the ELK Stack (Elasticsearch, Logstash, Kibana).

Zipkin & Sleuth: For centralizing tracing in the microservices architecture, Zipkin and Sleuth are integrated.

Setup and Usage
To set up the 3D CINEMA project locally, follow these steps:

Clone the repository to your local machine:

bash
Copy code
git clone https://github.com/Zaid-Siddiqui/
Ensure you have Java and Maven installed on your system.

Configure the Spring Cloud Config Server by updating the application.properties file with the necessary Git repository details.

Run the Eureka Service Discovery server.

Run the Spring Cloud Gateway server.

Run each microservice (Ticket Service and Payment Service) individually.

Set up the ELK Stack for centralized logging and configure microservices to send logs to Logstash.

Integrate Zipkin and Sleuth for distributed tracing across microservices.

Access the endpoints provided by each microservice via the Spring Cloud Gateway.

Contributing
Contributions to the 3D CINEMA project are welcome! If you have any suggestions, improvements, or bug fixes, please feel free to open an issue or create a pull request.

License
This project is licensed under the MIT License. See the LICENSE file for details.

Acknowledgments
Special thanks to the developers and contributors of Spring Cloud, ELK Stack, Zipkin, and Sleuth for their invaluable tools and frameworks that made this project possible.
