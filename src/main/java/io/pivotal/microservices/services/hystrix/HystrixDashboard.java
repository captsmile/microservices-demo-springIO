package io.pivotal.microservices.services.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


@SpringBootApplication
@EnableHystrixDashboard
@EnableDiscoveryClient
public class HystrixDashboard {

    public static void main( String[] args ) {
        System.setProperty("spring.config.name", "hystrix-dashboard");
        SpringApplication.run(HystrixDashboard.class, args);

    }
}
