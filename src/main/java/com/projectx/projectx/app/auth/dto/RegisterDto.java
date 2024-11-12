package com.projectx.projectx.app.auth.dto;

import com.projectx.projectx.enumeric.GenderType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class RegisterDto {
    @NotNull
    @Size(min = 3, max = 50)
    private String username;

    private String avatar;

    @Size(max = 5)
    private String countryCode;

    @Size(min = 7, max = 15)
    private String phoneNumber;

    @Size(min = 6)
    private String password;

    private GenderType gender;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType genderType) {
        this.gender = genderType;
    }
}
