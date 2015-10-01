package com.zocdoc.models.service.impl;

import com.zocdoc.models.Doctor;
import com.zocdoc.models.service.DoctorDAO;
import org.hibernate.SessionFactory;

import javax.inject.Inject;

/**
 * Created by root on 01.10.15.
 */
public class DoctorDAOImpl implements DoctorDAO {

    @Inject
    SessionFactory sessionFactory;

    @Override
    public void addDoctor(Doctor doctor) {

    }
}
