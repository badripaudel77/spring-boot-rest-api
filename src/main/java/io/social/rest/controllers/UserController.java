package io.social.rest.controllers;

import io.social.rest.models.User;
import io.social.rest.services.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/welcome")
    public Map<String, String> welcome() {
        return Collections.singletonMap("welcome_user", "Welcome To User API");
    }

    @GetMapping("/")
    //adding details to the rest endpoints swagger docs
    @ApiOperation(value = "Find all contacts from the database.",
            notes = "just provide the url and it will give you the response",
            response = User.class
    )
    public ArrayList<User> getAllPosts() {
        ArrayList<User> users = userService.listUser();
        return users;
    }

    @GetMapping("/user/{email}")
    public User getUserByEmail(@PathVariable(value = "email") String email) {
        return userService.getUserByEmail(email);
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        User createdUser = userService.saveUser(user);
        return createdUser;
    }

    @DeleteMapping("/delete/{userId}")
    public Map<String, String> deleteUser(@PathVariable(value = "userId") Integer userId) {
        boolean isDeleted = userService.deleteUser(userId);
        if(isDeleted) return Collections.singletonMap("userDeleted", "user Deleted");
        else return Collections.singletonMap("error", "couldn't delete the user");
    }
}
