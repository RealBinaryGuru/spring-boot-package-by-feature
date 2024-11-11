package com.projectx.projectx.app.user;

import com.projectx.projectx.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
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


}

enum GenderType {MALE, FEMALE}