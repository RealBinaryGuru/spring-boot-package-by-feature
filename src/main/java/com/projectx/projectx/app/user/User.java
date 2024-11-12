package com.projectx.projectx.app.user;

import com.projectx.projectx.common.entity.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(nullable = false, length = 50)
    private String username;

    @Enumerated
    @Column(length = 10)
    private GenderType gender;

    @Column(nullable = true)
    private String avatar;

    @Column(nullable = false, length = 5, name = "country_code")
    private String countryCode;

    @Column(nullable = false, length = 15, name = "phone_number")
    private String phoneNumber;

    // No-args constructor
    public User() {
    }

    // All-args constructor
    public User(String username, GenderType gender, String avatar, String countryCode, String phoneNumber) {
        this.username = username;
        this.gender = gender;
        this.avatar = avatar;
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
    }

    // Getter and Setter for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and Setter for gender
    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    // Getter and Setter for avatar
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    // Getter and Setter for countryCode
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    // Getter and Setter for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

enum GenderType {
    MALE, FEMALE
}
