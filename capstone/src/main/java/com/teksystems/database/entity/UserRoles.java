package com.teksystems.database.entity;

import jakarta.persistence.*;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * user roles entity that is the same as the users roles table in the database
 *
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "users_roles")

public class UserRoles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "role_name")
    private String roleName;
}
