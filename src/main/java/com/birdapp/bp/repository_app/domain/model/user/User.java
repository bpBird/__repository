package com.birdapp.bp.repository_app.domain.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.birdapp.bp.repository_app.domain.model.Contact;

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
public class User extends Contact {

    /** PASSWORD. */
    private String password;

    /** BCRYPT PASSWORD. */
    @Column(name = "BCRYPT_PASSWORD")
    private String bcryptPassword;

    /** ROLE. */
    @Column(name = "ROLENAME")
    @Enumerated(EnumType.STRING)
    private Rolename rolename;
}