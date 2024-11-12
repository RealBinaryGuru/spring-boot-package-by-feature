package com.projectx.projectx.app.auth;

import com.projectx.projectx.app.auth.dto.RegisterDto;
import com.projectx.projectx.common.dto.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ApiResponse<String> register(@RequestBody RegisterDto registerDto) {
        return authService.register(registerDto);
    }
}
