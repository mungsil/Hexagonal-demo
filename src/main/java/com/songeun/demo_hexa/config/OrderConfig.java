package com.songeun.demo_hexa.config;

import com.songeun.demo_hexa.domain.port.output.OrderRepositoryPort;
import com.songeun.demo_hexa.domain.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfig {

    @Bean
    public OrderService orderService(OrderRepositoryPort orderRepositoryPort) {
        return new OrderService(orderRepositoryPort);
    }

}
