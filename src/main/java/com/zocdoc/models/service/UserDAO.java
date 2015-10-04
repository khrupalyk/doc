package com.zocdoc.models.service;

import com.zocdoc.models.User;

import java.util.Collection;

/**
 * Created by root on 03.10.15.
 */
public interface UserDAO {
    void addUser(User user);
    Collection<User> getAllUsers();
}
