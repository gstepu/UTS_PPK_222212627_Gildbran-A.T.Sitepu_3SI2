package com.polstatstis.gym.service;

/**
 * @author gildbran
 */
import com.polstatstis.gym.repository.UserRepository;
import com.polstatstis.gym.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService{
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public UserDetails loadUserByUsername(String NIM) throws
    UsernameNotFoundException {
        User user = userRepository.findByNIM(NIM);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + NIM);
        }
        UserDetails userDetails = org.springframework.security.core.userdetails.User.builder()
            .username(user.getEmail())
            .password(user.getPassword())
            .build();
        return userDetails;
    }
}
