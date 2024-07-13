package code;

// Copyright (c) 2024, NoCodeNoLife-cloud. All rights reserved.
// Author: NoCodeNoLife-cloud
// stay hungry，stay foolish
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootGatewayConfig {
	/**
	 * This method creates a custom route locator for the Gateway.
	 *
	 * @param builder The RouteLocatorBuilder used to build the RouteLocator.
	 *
	 * @return The RouteLocator with the custom route.
	 */
	@Bean
	public RouteLocator customRouteLocator(@Autowired RouteLocatorBuilder builder) {
		// Build the route locator with a single route
		return builder.routes()
				// Define the route with the name "path_route"
				.route("path_route", r -> r
						// Map the "/blog" path to the "http://localhost:8082" URI
						.path("/blog").uri("http://localhost:8082"))
				// Build the route locator
				.build();
	}
}