package org.example.ecommerce.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "carts")
public class Cart {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Product> Products;

    @ManyToOne
    private User user;
}
