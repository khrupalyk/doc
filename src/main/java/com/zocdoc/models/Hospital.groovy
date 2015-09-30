package com.zocdoc.models

import org.hibernate.annotations.GenericGenerator

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table

/**
 * Created by root on 30.09.15.
 */

@Entity
@Table(name = "hospitals")
class Hospital {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    Integer hospitalId
    String name

    @OneToMany(mappedBy = "doctorId")
    Collection<Doctor> doctors
}
