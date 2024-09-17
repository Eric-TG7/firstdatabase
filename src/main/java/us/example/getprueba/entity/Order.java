package us.example.getprueba.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(indexes = {
        @Index(columnList = "customerId"),
        @Index(columnList = "employeeId"),
        @Index(columnList = "orderDate"),
        @Index(columnList = "shippedDate"),
        @Index(columnList = "shipVia"),
        @Index(columnList = "shipPostalCode"),


})
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Customer customerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Employee employeeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Order shipVia;

    private String orderDate;
    private String orderRequiredDate;
    private String shippedDate;
    private String freight;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipRegion;
    private Integer shipPostalCode;
    private String shipCountry;


}
