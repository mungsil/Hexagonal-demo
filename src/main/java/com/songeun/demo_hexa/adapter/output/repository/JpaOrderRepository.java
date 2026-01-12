package com.songeun.demo_hexa.adapter.output.repository;

import com.songeun.demo_hexa.adapter.output.entity.OrderEntity;
import com.songeun.demo_hexa.domain.dto.FoodOrder;
import com.songeun.demo_hexa.domain.port.output.OrderRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class JpaOrderRepository implements OrderRepositoryPort {

    private final SpringDataOrderRepository orderRepository;

    @Override
    public void saveOrder(FoodOrder foodOrder) {
        System.out.println("OUTPUT ADAPTER EXECUTED WITH OUTPUT PORT--");
        orderRepository.save(mapToEntity(foodOrder));
    }

    @Override
    public String findById(String orderId) {
        System.out.println("OUTPUT ADAPTER EXECUTED WITH OUTPUT PORT--");
        OrderEntity entity = orderRepository.findById(orderId).orElseThrow();
        return mapToDomain(entity).getOrderId();
    }

    private OrderEntity mapToEntity(FoodOrder foodOrder) {
        OrderEntity entity = new OrderEntity();
        entity.setId(foodOrder.getOrderId());
        entity.setCustomerName(foodOrder.getCustomerName());
        entity.setRestaurantName(foodOrder.getRestaurantName());
        entity.setItem(foodOrder.getItem());
        entity.setStatus(foodOrder.getStatus());
        return entity;
    }

    private FoodOrder mapToDomain(OrderEntity entity) {
        FoodOrder foodOrder = new FoodOrder();
        foodOrder.setOrderId(entity.getId());
        foodOrder.setCustomerName(entity.getCustomerName());
        foodOrder.setRestaurantName(entity.getRestaurantName());
        foodOrder.setItem(entity.getItem());
        foodOrder.setStatus(entity.getStatus());
        return foodOrder;
    }

}
