package us.example.getprueba.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(indexes = {
        @Index(columnList = "orderId"),
        @Index(columnList = "productId"),

})
@Data
public class OrderDetail {

    @EmbeddedId//When a table’s primary key is composed of multiple columns, you use @EmbeddedId to specify that the primary key is represented by a separate class.
    private OrderProductId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id") //defines foreign column
    @MapsId("orderId")
    private Order orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id")
    @MapsId("productId")
    private Product productId;

    private String unitPrice;
    private String quantity;
    private String discount;
}
