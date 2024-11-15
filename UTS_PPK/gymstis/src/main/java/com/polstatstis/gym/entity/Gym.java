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
@Table(name = "gym")
public class Gym {
    @Id
    private int idGym;
    
    @Column(nullable = false)
    private String namaGym;
    
    @Column(nullable = false)
    private String status;
    
    @OneToMany(mappedBy = "gym")
    private List<Alat> alat;
    @OneToMany(mappedBy = "gym")
    private List<Peminjaman> peminjaman;
}
