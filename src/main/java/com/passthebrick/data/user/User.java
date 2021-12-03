package com.passthebrick.data.user;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor @NoArgsConstructor @Builder
@EqualsAndHashCode(of = "id") @ToString(exclude = "password")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(nullable = false)
    private Boolean isActive;
}
