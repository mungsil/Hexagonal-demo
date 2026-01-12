package com.songeun.demo_hexa.domain.port.output;

import com.songeun.demo_hexa.domain.dto.FoodOrder;

public interface OrderRepositoryPort {

    void saveOrder(FoodOrder foodOrder);
    String findById(String orderId);

}
