package com.polstatstis.gym.dto;

/**
 * @author gildbran
 */

import com.polstatstis.gym.entity.Gym;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlatDto {
    private int idAlat;
    
    private Gym gym;
    
    private String status;

    private String namaAlat;
}
