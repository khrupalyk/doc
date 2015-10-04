package com.zocdoc.models.service.impl;

import com.zocdoc.models.User;
import com.zocdoc.models.service.UserDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.inject.Inject;
import java.util.Collection;

/**
 * Created by root on 03.10.15.
 */
public class UserDAOImpl implements UserDAO {

    @Inject
    SessionFactory sessionFactory;

    @Override
    public void addUser(User user) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Collection<User> getAllUsers() {
        Collection<User> users;
        Session session = sessionFactory.openSession();
        users = session.createCriteria(User.class).list();
        session.close();
        return users;
    }
}
