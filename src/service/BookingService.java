package service;

import Exceptions.SeatNotAvailableException;
import model.Booking;
import model.BookingStatus;
import model.Seat;
import model.SeatStatus;

import java.util.*;

public class BookingService {
    Map<Integer, Booking> bookingMap = new HashMap<>();

    List<Booking> bookings = new ArrayList<>();
    SeatLockService seatLockService;
    UserService userService;

    public BookingService(SeatLockService seatLockService, UserService userService) {
        this.seatLockService = seatLockService;
        this.userService = userService;
    }

    public Booking creeateBooking(int showId, int theatreId, Set<Seat> seats, int userId) throws SeatNotAvailableException {
        if(isAnySeatAlreadyBooked(seats,showId)){
            throw new SeatNotAvailableException();
        }
            for(Seat seat:seats){
               seat.setSeatStatus(SeatStatus.booked);
            }

            Booking booking = new Booking(new Random().nextInt(10000),new Date().toString(),seats,userId,showId,theatreId,
                    12345,BookingStatus.CONFIRMED);
        bookingMap.put(booking.getBookingId(),booking);
        userService.addBooingsForAUser(booking);

        return booking;


    }

    public Booking getBooking(int bookingId){
        return bookingMap.get(bookingId);
    }

    public Set<Seat> getAllAvailableSeats(int showId){
        Set<Seat> bookedSeats = new HashSet<>();
        for(Booking booking:bookings){
            if(booking.getBookingStatus().equals("CONFIRMED")){
                bookedSeats.addAll(booking.getSeats());
            }
        }
        return bookedSeats;

    }

    public boolean isAnySeatAlreadyBooked(Set<Seat> seats, int showId){
        Set<Seat> bookedSeats = getAllAvailableSeats(showId);
        for(Seat seat:seats){
            if(bookedSeats.contains(seat)){
                return true;
            }
        }
        return false;

    }



}
