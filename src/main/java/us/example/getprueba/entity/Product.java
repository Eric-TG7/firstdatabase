package us.example.getprueba.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(indexes = {
        @Index(columnList = "productName"),
        @Index(columnList = "supplierId"),
        @Index(columnList = "categoryId")
})
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("id")
    private Supplier supplierId;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("id")
    private Category categoryId;

    private String productName;
    private String quantityPerUnit;
    private String unitPrice;
    private String unitsInStock;
    private String unitsOnOrder;
    private String reorderLevel;
    private String discontinued;
}
