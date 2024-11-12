package com.projectx.projectx.app.user_role;

import com.projectx.projectx.app.role.Role;
import com.projectx.projectx.app.user.User;
import com.projectx.projectx.common.entity.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "user_roles")
public class UserRole extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", unique = true)
    private User user;

    @OneToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role role;

    // No-args constructor
    public UserRole() {
    }

    // All-args constructor
    public UserRole(User user, Role role) {
        this.user = user;
        this.role = role;
    }

    // Getter and Setter for user
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Getter and Setter for role
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
