package com.songeun.demo_hexa.adapter.input.rest;

import com.songeun.demo_hexa.domain.dto.FoodOrder;
import com.songeun.demo_hexa.domain.port.input.PlaceOrderUsecase;
import com.songeun.demo_hexa.domain.port.input.TrackOrderUsecase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final PlaceOrderUsecase placeOrderUsecase;
    private final TrackOrderUsecase trackOrderUsecase;

    @PostMapping
    public ResponseEntity<String> placeOrder(@RequestBody final FoodOrder order) {
        System.out.println("INPUT ADAPTER EXECUTED");
        placeOrderUsecase.placeOrder(order);
        return ResponseEntity.ok("Order placed");
    }

    @GetMapping("/track/{orderId}")
    public ResponseEntity<String> trackOrder(@PathVariable final String orderId) {
        System.out.println("INPUT ADAPTER EXECUTED");
        String tracked = trackOrderUsecase.trackOrder(orderId);
        return ResponseEntity.ok("Status: " + tracked);
    }

}
