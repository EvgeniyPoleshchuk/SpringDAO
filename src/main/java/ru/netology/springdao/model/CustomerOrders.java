package ru.netology.springdao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
@Table(name = "orders",schema = "public")
public class CustomerOrders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String date;

    @Column(name = "product_name")
    private String productName;
    @Column
    private int amount;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customers;

    public CustomerOrders() {
    }
}
