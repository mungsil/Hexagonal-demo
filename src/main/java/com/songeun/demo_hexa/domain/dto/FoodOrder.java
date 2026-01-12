package com.songeun.demo_hexa.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FoodOrder {
    private String orderId;
    private String customerName;
    private String restaurantName;
    private String item;
    private String status;
}
