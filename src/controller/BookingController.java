package controller;

import Exceptions.SeatNotAvailableException;
import model.Booking;
import model.Seat;
import service.BookingService;

import java.util.Set;

public class BookingController {
    BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    public Booking getBooking(int bookingId){
        return bookingService.getBooking(bookingId);
    }
    public Booking createBooking(int showId, int theatreId, Set<Seat> seats, int userId) throws SeatNotAvailableException {
        return bookingService.creeateBooking(showId,theatreId,seats,userId);

    }

}
