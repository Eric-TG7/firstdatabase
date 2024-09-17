package us.example.getprueba.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(indexes = {
        @Index(columnList = "companyName"),
        @Index(columnList = "city"),
        @Index(columnList = "region"),
        @Index(columnList = "postalCode"),

})
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String companyName;
    private String contactName;
    private String contactTitle;
    private String address;
    private String city;
    private String region;
    private Integer postalCode;
    private String country;
    private String phone;
    private String fax;
}
