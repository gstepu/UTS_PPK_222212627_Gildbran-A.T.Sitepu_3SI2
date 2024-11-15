package com.polstatstis.gym.dto;

/**
 * @author gildbran
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GymDto {
    private int idGym;
    
    private String nama;
    
    private String status;
}
