package us.example.getprueba.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String categoryName;
    private String description;
    private String picture;




}
