package com.polstatstis.gym.service;

/**
 * @author gildbran
 */

import com.polstatstis.gym.dto.UserDto;

public interface UserService {
    public UserDto createUser(UserDto user);
    public UserDto getUserByNIM(String NIM);
    public UserDto changePassword(String NIM, String password);
}
