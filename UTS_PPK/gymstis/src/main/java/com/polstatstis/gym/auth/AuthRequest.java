package com.polstatstis.gym.auth;

/**
 * @author gildbran
 */

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor
public class AuthRequest {
    @NotNull @Max(20)
    private String NIM;
    @NotNull @Max(16)
    private String password;
}
