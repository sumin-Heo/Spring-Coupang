package com.asac.SpringCoupang.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String useremail;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
    private String password;
}
