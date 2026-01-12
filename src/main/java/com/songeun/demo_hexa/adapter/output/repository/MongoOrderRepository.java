package com.songeun.demo_hexa.adapter.output.repository;

import com.songeun.demo_hexa.domain.dto.FoodOrder;
import com.songeun.demo_hexa.domain.port.output.OrderRepositoryPort;

public class MongoOrderRepository implements OrderRepositoryPort {

    // inject mongo repository

    @Override
    public void saveOrder(FoodOrder foodOrder) {

    }

    @Override
    public String findById(String orderId) {
        return "";
    }

}
