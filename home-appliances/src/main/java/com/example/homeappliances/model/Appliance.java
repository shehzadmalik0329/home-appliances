package com.example.homeappliances.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "appliance")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Appliance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;
    @Column(name = "name")
    private String name;
    @Column(name = "purchase_date")
    private LocalDate purchaseDate;
    @Column(name = "price")
    private double price;
    @Column(name = "delivery_date")
    private LocalDate deliveryDate;

}
