package com.zocdoc.models

import org.hibernate.annotations.GenericGenerator

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "doctors")
class Doctor {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    Integer doctorId
    String firstName
    String lastName
    String specialty
    String location


    @ManyToOne
    @JoinColumn(name = "hospitalId", nullable = true)
    Hospital hospital
}