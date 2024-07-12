package org.example.ecommerce.model;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
@Entity
@Table (name = "users")
public class User {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "username", nullable = false, unique = true)
    @NotBlank (message = "O campo de usuario não pode estar vazio")
    private String username;
    @Column (name = "password", nullable = false)
    private String password;
}
