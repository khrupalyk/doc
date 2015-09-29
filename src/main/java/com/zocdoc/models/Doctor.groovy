
package com.zocdoc.models

import javax.persistence.Entity

@Entity
class Doctor {

    String name
    String location

    Doctor(String name) {
        this.name = name
    }
}