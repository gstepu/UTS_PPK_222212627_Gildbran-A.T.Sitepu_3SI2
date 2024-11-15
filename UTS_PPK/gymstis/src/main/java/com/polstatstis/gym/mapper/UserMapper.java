package com.polstatstis.gym.mapper;

/**
 * @author gildbran
 */

import com.polstatstis.gym.dto.UserDto;
import com.polstatstis.gym.entity.User;

public class UserMapper {
   public static User mapToUser(UserDto userDto){
        return User.builder()
            .NIM(userDto.getNIM())
            .role(userDto.getRole())
            .nama(userDto.getNama())
            .email(userDto.getEmail())
            .password(userDto.getPassword())
            .ukm(userDto.getUkm())
            .build();
    }
    public static UserDto mapToUserDto(User user){
        return UserDto.builder()
            .NIM(user.getNIM())
            .role(user.getRole())
            .nama(user.getNama())
            .email(user.getEmail())
            .password(user.getPassword())
                .ukm(user.getUkm())
                .build();
    }
}
