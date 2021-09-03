package service;

import model.Booking;
import model.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserService {
    Map<Integer, User> userMap = new HashMap<>();
    Map<Integer, Set<Booking>> userBookings = new HashMap<>();

    public String createUser(User user){
        userMap.put(user.getUserId(),user);
        return "Success";
    }
    public User getUserByUserId(int userId){
        return userMap.get(userId);
    }

    public void addBooingsForAUser(Booking booking){
        if(userBookings.containsKey(booking.getBookedBy())){
            userBookings.get(booking.getBookedBy()).add(booking);
        }else{
            Set<Booking> bookings = new HashSet<>();
            bookings.add(booking);
            userBookings.put(booking.getBookedBy(),bookings);
        }
    }

    public  Set<Booking> getAllUserBookings(int userId){
        return userBookings.get(userId);
    }


}
