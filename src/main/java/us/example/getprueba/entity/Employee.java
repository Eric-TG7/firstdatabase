package us.example.getprueba.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(indexes = {
        @Index(columnList = "lastName"),
        @Index(columnList = "postalCode")
})
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String lastName;
    private String firstName;
    private String title;
    private String titleOfCourtesy;
    private String hireDate;
    private String adress;
    private String city;
    private String region;
    private Integer postalCode;
    private String country;
    private String homePhone;
    private String extension;
    private String photo;
    private String notes;
    private String reportsTo;



}
