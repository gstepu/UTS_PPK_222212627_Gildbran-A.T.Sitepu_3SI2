package com.polstatstis.gym.entity;

/**
 * @author gildbran
 */

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User {
    @Id
    private String NIM;
    
    @Column(nullable = false)
    private String role;
    
    @Column(nullable = false)
    private String nama;
    
    @Column(nullable = true)
    private String email;
    
    @Column(nullable = false)
    private String password;

    @Column(nullable = true)
    private String ukm;

    
    @OneToMany(mappedBy = "user")
    private List<Peminjaman> peminjaman;
}
