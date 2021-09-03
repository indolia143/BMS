package model;

import java.util.List;
import java.util.Set;

public class Booking {
    private int bookingId;
    private String bookingTime;
    private Set<Seat> seats;
    private int bookedBy;
    private int showId;
    private int theatreId;
    private int bookedAmount;
    private BookingStatus bookingStatus;


    public Booking(int bookingId, String bookingTime, Set<Seat> seats, int bookedBy, int showId, int theatreId, int bookedAmount, BookingStatus status) {
        this.bookingId = bookingId;
        this.bookingTime = bookingTime;
        this.seats = seats;
        this.bookedBy = bookedBy;
        this.showId = showId;
        this.theatreId = theatreId;
        this.bookedAmount = bookedAmount;
        this.bookingStatus = status;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    public Set<Seat> getSeats() {
        return seats;
    }

    public void setSeats(Set<Seat> seats) {
        this.seats = seats;
    }

    public int getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(int bookedBy) {
        this.bookedBy = bookedBy;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public int getBookedAmount() {
        return bookedAmount;
    }

    public void setBookedAmount(int bookedAmount) {
        this.bookedAmount = bookedAmount;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    @Override
    public String toString() {
        return "{" +
                "bookingId=" + bookingId +
                ", bookingTime='" + bookingTime + '\'' +
                ", seats=" + seats +
                ", bookedBy=" + bookedBy +
                ", showId=" + showId +
                ", theatreId=" + theatreId +
                ", bookedAmount=" + bookedAmount +
                ", bookingStatus=" + bookingStatus +
                '}';
    }
}
