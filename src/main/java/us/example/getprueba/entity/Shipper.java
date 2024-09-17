package us.example.getprueba.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table
@Data
public class Shipper {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String companyName;
    private String phone;
}
