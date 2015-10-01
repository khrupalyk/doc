package com.zocdoc.models.service.impl;

import com.zocdoc.models.Hospital;
import com.zocdoc.models.service.HospitalDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.inject.Inject;

/**
 * Created by root on 01.10.15.
 */
public class HospitalDAOImpl implements HospitalDAO {

    @Inject
    SessionFactory sessionFactory;

    @Override
    public void addHospital(Hospital hospital) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(hospital);
        session.getTransaction().commit();
        session.close();
    }
}
