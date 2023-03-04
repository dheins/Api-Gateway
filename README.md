## API Gateway using Spring Cloud Gateway and Eureka

A simple project using Spring Boot 3 to illustrate how to use Spring Cloud Gateway to route requests to downstream services and Eureka service registry.

### Requirements
* Java 17
* Gradle 7.4 or greater
* Postman

### To run the services

`./gradlew eureka-server:bootRun`

`./gradlew api-gateway:bootRun`

`./gradlew test-customer-service:bootRun`

`./gradlew test-invoice-service:bootRun`


The services are configured to run on the following ports:
* Gateway          : 8080
* Eureka           : 8083
* Invoice Service  : 8081
* Customer Service : 8082

To test if the gateway is working as expected use postman to access the routes defined in the individual services 
via the gateways service url `localhost:8080`

To see which routes are registered on the gateway navigate to `http://localhost:8080/actuator/gateway/routes`

To see which routes are registered on the Eureka registry service to `http://localhost:8083/`

### Postman
A [postman collection](./SpringCloudGateway.postman_collection.json) is included for testing the various routes.

### Gradle note
If you receive and error like
> Could not open init generic class cache for initialization script

Then go into settings; Build, Execution, Deployment > Build Tools > Gradle.  Then select the module and set `Use Gradle from` to `Specified location` and set the location of gradle.

---
### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.3/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.3/gradle-plugin/reference/html/#build-image)
* [Gateway](https://docs.spring.io/spring-cloud-gateway/docs/current/reference/html/)
* [Eureka Server](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#spring-cloud-eureka-server)

* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.3/reference/htmlsingle/#web)

### Guides
The following guides illustrate how to use some features concretely:

* [API Gateway](https://spring.io/guides/gs/gateway/)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
