package com.birdapp.bp.repository_app.domain.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.birdapp.bp.repository_app.domain.model.AbstractEntity;

import lombok.Getter;
import lombok.Setter;

/**
 * USER DATA.
 *
 * @author bp
 *
 */
@Entity
@Table(name = "users")
@Getter
@Setter
public class User extends AbstractEntity {

    /** LASTNAME. */
    @Column(name = "FIRSTNAME")
    private String firstname;

    /** FIRSTNAME. */
    @Column(name = "LASTNAME")
    private String lastname;

    /** EMAIL. */
    @Column(name = "EMAIL")
    private String email;

    /** PASSWORD. */
    private String password;

    /** BCRYPT PASSWORD. */
    @Column(name = "BCRYPT_PASSWORD")
    private String bcryptPassword;

    /** ROLE. */
    @Enumerated(EnumType.STRING)
    private Rolename rolename;
}