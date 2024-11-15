package com.polstatstis.gym.entity;

/**
 * @author gildbran
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "alat")
public class Alat {
    @Id
    private int idAlat;
   
    @ManyToOne 
    @JoinColumn(name = "gym_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Gym gym;
    
    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private String namaAlat; // Kolom baru untuk nama alat
    

}
