package com.polstatstis.gym.mapper;

/**
 * @author gildbran
 */

import com.polstatstis.gym.dto.AlatDto;
import com.polstatstis.gym.entity.Alat;

public class AlatMapper {
    static Alat mapToalat(AlatDto alatDto){
        return Alat.builder()
            .idAlat(alatDto.getIdAlat())
            .gym(alatDto.getGym())
            .status(alatDto.getStatus())
                .namaAlat(alatDto.getNamaAlat())
            .build();
    }
    public static AlatDto mapToalatDto(Alat alat){
        return AlatDto.builder()
            .idAlat(alat.getIdAlat())
            .gym(alat.getGym())
            .status(alat.getStatus())
                .namaAlat(alat.getNamaAlat())
            .build();
    }
}
