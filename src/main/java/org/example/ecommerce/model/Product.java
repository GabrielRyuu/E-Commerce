package org.example.ecommerce.model;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
@Entity
@Table (name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    @NotBlank(message = "O Nome do produto não pode estar vazio")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price", nullable = false)
    @NotBlank(message = "O preço do produto não pode estar vazio")
    private BigDecimal price;


}

