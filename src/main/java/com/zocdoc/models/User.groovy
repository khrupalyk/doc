package com.zocdoc.models

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.OneToOne
import javax.persistence.Table

/**
 * Created by root on 03.10.15.
 */

@Entity
@Table(name = "users")
class User {

    @Id
    String email

    String firstName
    String lastName

    @OneToMany(mappedBy = "user")
    Collection<UserRole> userRoles

    @OneToOne(mappedBy = "user")
    Doctor doctor

}
