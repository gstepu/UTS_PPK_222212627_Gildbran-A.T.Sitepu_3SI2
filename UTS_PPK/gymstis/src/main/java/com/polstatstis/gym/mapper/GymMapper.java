package com.polstatstis.gym.mapper;

/**
 * @author gildbran
 */

import com.polstatstis.gym.dto.GymDto;
import com.polstatstis.gym.entity.Gym;

public class GymMapper {
    static Gym mapTogym(GymDto gymDto){
        return Gym.builder()
            .idGym(gymDto.getIdGym())
            .namaGym(gymDto.getNama())
            .status(gymDto.getStatus())
            .build();
    }
    public static GymDto mapTogymDto(Gym gym){
        return GymDto.builder()
            .idGym(gym.getIdGym())
            .nama(gym.getNamaGym())
            .status(gym.getStatus())
            .build();
    }
}
