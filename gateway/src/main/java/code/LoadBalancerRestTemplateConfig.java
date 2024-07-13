package code;

// Copyright (c) 2024, NoCodeNoLife-cloud. All rights reserved.
// Author: NoCodeNoLife-cloud
// stay hungry，stay foolish
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Configuration
public class LoadBalancerRestTemplateConfig {
	/**
	 * configure RestTemplate
	 * Note: RestTemplate needs to cooperate with @LoadBalanced
	 * Only through the service name spring.application.name can it be resolved to a specific service
	 *
	 * @return restTemplate
	 */
	@Bean
	@LoadBalanced// Enable load balancing (Ribbon) when a client uses RestTemplate to request a server
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
