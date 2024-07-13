package code;

// Copyright (c) 2024, NoCodeNoLife-cloud. All rights reserved.
// Author: NoCodeNoLife-cloud
// stay hungry，stay foolish
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
// @EnableDiscoveryClient
// @EnableFeignClients
// @EnableDubbo
@SpringBootApplication
public class SpringBootApplicationLauncher {
	/**
	 * Entry point of the application.
	 *
	 * @param args The command line arguments.
	 */
	@SneakyThrows
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationLauncher.class, args);
	}
}