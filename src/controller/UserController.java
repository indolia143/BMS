package controller;

import model.Booking;
import model.User;
import service.UserService;

import java.util.Set;

public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public String registerUser(User user){
        return userService.createUser(user);
    }
    public User getUser(int userId){
        return userService.getUserByUserId(userId);
    }
    public Set<Booking> getAllUserBookings(int userId){
        return userService.getAllUserBookings(userId);
    }
}
