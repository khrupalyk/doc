package com.zocdoc.models

import org.hibernate.annotations.GenericGenerator

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

/**
 * Created by root on 03.10.15.
 */

@Entity
@Table(name = "users_roles")
class UserRole {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    int id

    @ManyToOne
    @JoinColumn(name = "email")
    User user

    String role
}
