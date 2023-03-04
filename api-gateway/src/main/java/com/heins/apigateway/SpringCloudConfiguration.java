package com.heins.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfiguration {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("invoiceModule", r -> r.path("/invoice/**")
                        .uri("lb://invoice-service")
                )

                .route("customerModule", r -> r.path("/customer/**")
                        .uri("lb://customer-service")
                )
                .build();
    }
}
