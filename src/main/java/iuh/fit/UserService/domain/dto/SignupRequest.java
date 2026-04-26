package iuh.fit.UserService.domain.dto;

import iuh.fit.UserService.domain.common.Role;
import lombok.Data;

@Data
public class SignupRequest {
    private String username;
    private String password;
    private Role role;
}
