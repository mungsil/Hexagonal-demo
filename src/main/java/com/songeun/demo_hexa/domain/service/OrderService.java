package com.songeun.demo_hexa.domain.service;

import com.songeun.demo_hexa.domain.dto.FoodOrder;
import com.songeun.demo_hexa.domain.port.input.PlaceOrderUsecase;
import com.songeun.demo_hexa.domain.port.input.TrackOrderUsecase;
import com.songeun.demo_hexa.domain.port.output.OrderRepositoryPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderService implements PlaceOrderUsecase, TrackOrderUsecase {

    private final OrderRepositoryPort repositoryPort;

    @Override
    public void placeOrder(FoodOrder foodOrder) {
        foodOrder.setStatus("ORDER PLACED");
        System.out.println("CORE EXECUTED WITH INPUT PORT--");
        repositoryPort.saveOrder(foodOrder);
    }

    @Override
    public String trackOrder(String orderId) {
        System.out.println("CORE EXECUTED WITH INPUT PORT--");
        return repositoryPort.findById(orderId);
    }

}
