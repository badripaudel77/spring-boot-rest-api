package io.social.rest.services.implementation;

import io.social.rest.models.User;
import io.social.rest.repositories.UserRepository;
import io.social.rest.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        logger.warn("coming user : ", user.getEmail());
        User user1 = userRepository.findByEmail(user.getEmail());
        if(user1!= null) {
           throw new RuntimeException("User Already Exists");
        }
        user.setJoinedDate(new Date());

        User newUser = userRepository.save(user);
        return newUser;
    }

    @Override
    public ArrayList<User> listUser() {
        //logger.warn("listing user");
        return (ArrayList<User>) userRepository.findAll();
    }

    @Override
    public boolean deleteUser(int userId) {
        if(userId <= 0) return false;
        userRepository.deleteById(userId);
        return true;
    }

    @Override
    public User getUserByEmail(String email) {
        if(email!=null) return userRepository.findByEmail(email);
        else return null;
    }
}
