package io.social.rest.services;

import io.social.rest.models.User;

import java.util.ArrayList;
import java.util.List;

/*
 1) Create New User (signup)
 2) Validate user (Login / sign in)
 3) Get User
 4) Delete User
*/

public interface UserService {

    public User saveUser(User user); //null obj

    public boolean deleteUser(int id);

    public ArrayList<User> listUser(); // all users

    public User getUserByEmail(String email); // can get by id

}
