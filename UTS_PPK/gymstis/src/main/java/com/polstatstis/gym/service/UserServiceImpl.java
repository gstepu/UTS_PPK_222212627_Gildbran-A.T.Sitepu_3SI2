package com.polstatstis.gym.service;

/**
 * @author gildbran
 */

import com.polstatstis.gym.dto.UserDto;
import com.polstatstis.gym.entity.User;
import com.polstatstis.gym.mapper.UserMapper;
import com.polstatstis.gym.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @Override
    public UserDto createUser(UserDto userDto) {
        userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
        User user = userRepository.save(UserMapper.mapToUser(userDto));
        return UserMapper.mapToUserDto(user);
    }
    
    @Override
    public UserDto changePassword(String NIM, String password) {
        User user = userRepository.findByNIM(NIM);
        UserDto userDto = UserMapper.mapToUserDto(user);
        userDto.setPassword(passwordEncoder.encode(password));
        user = userRepository.save(UserMapper.mapToUser(userDto));
        return UserMapper.mapToUserDto(user);
    }
    
    @Override
    public UserDto getUserByNIM(String NIM) {
        User user = userRepository.findByNIM(NIM);
        return UserMapper.mapToUserDto(user);
    }
}
