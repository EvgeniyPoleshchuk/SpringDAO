package ru.netology.springdao.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;




@AllArgsConstructor
@Data
@Entity
@Table(name = "customers",schema = "public")
public class Customers {
    @Id
    private long id;

    @Column
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String phone_Number;

    public Customers() {
    }
}
