package us.example.getprueba.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class OrderProductId implements Serializable {
    private Long orderId;
    private Long productId;

    // Constructors, Getters, Setters, Equals, and HashCode
}
