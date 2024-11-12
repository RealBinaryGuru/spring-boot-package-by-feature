package com.projectx.projectx.app.auth;

import com.projectx.projectx.app.user.User;
import com.projectx.projectx.common.entity.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "password")
public class Password extends BaseEntity {
    @Id
    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Column(name = "password")
    private String password;

    public Password() {
    }

    public Password(User user, String password) {
        this.user = user;
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Getter and Setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
