package com.small.service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SmallEntity {

    @Id
    private Long small_id;
    private String name;
    private double cost;
    private double sellingPrice;
    private int totalNumber;
}
