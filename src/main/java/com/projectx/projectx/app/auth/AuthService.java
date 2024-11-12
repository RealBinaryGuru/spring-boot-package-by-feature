package com.projectx.projectx.app.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

public class AuthService {
    @Autowired
    private PasswordRepository passwordRepository;
}
