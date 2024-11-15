package com.polstatstis.gym.auth;

/**
 * @author gildbran
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    private String NIM;
    private String accessToken;    
}
