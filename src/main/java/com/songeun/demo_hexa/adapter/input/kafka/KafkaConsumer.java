package com.songeun.demo_hexa.adapter.input.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.songeun.demo_hexa.domain.dto.FoodOrder;
import com.songeun.demo_hexa.domain.port.input.PlaceOrderUsecase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaConsumer {

    private final PlaceOrderUsecase placeOrderUsecase;

//    @KafkaListener
    public void consume(String message) throws JsonProcessingException {
        FoodOrder foodOrder = new ObjectMapper().readValue(message, FoodOrder.class);
        placeOrderUsecase.placeOrder(foodOrder);
    }

}
