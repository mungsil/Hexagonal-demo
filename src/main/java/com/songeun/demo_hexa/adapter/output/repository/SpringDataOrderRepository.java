package com.songeun.demo_hexa.adapter.output.repository;

import com.songeun.demo_hexa.adapter.output.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataOrderRepository extends JpaRepository<OrderEntity, String> {
}
