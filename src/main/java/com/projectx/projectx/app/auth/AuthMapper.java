package com.projectx.projectx.app.auth;

import com.projectx.projectx.app.auth.dto.RegisterDto;
import com.projectx.projectx.app.user.User;

public class AuthMapper {
    public static User authDtoToUserEntity(RegisterDto registerDto) {
        User user = new User();
        user.setUsername(registerDto.getUsername());
        user.setCountryCode(registerDto.getCountryCode());
        user.setPhoneNumber(registerDto.getPhoneNumber());
        user.setAvatar(registerDto.getAvatar());
        user.setGender(registerDto.getGender());
        return user;
    }
}
