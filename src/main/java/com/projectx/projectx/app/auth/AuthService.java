package com.projectx.projectx.app.auth;

import com.projectx.projectx.app.auth.dto.RegisterDto;
import com.projectx.projectx.app.user.User;
import com.projectx.projectx.app.user.UserRepository;
import com.projectx.projectx.common.dto.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    public ApiResponse<String> register(RegisterDto registerDto) {
        if (userRepository.existsByUsername(registerDto.getUsername())) {
            return new ApiResponse<>("Already exist", null);
        }
        User newUser = AuthMapper.authDtoToUserEntity(registerDto);
        userRepository.save(newUser);
        System.out.println("========" + newUser);
        return new ApiResponse<>("Success", null);
    }
}
