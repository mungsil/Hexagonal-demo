package com.songeun.demo_hexa.adapter.output.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OrderEntity {

    @Id
    private String id;

    private String customerName;
    private String restaurantName;
    private String item;
    private String status;

}
