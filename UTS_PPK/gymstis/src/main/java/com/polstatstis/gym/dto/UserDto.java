package com.polstatstis.gym.dto;

/**
 * @author gildbran
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements UserDetails{
    private String NIM;
    private String role;    
    private String nama;   
    private String email;        
    private String password;    
    private String ukm;

    
    @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }
        
    @Override
        public String getUsername() {
//        if (this.role=="ADMIN")
//            return this.role;
        return this.NIM;
    }
        
    @Override
        public boolean isAccountNonExpired() {
        return true;
    }
        
    @Override
        public boolean isAccountNonLocked() {
        return true;
    }
        
    @Override
        public boolean isCredentialsNonExpired() {
        return true;
    }
        
    @Override
        public boolean isEnabled() {
        return true;
    }
}
