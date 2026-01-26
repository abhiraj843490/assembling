package com.assembling.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "vehicles")
@AllArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue
    private Long id;
    private String brandName;
    private boolean availability;
}
