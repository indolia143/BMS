package model;

import java.util.List;
import java.util.Set;

public class Screen {
    private int id;
    private int theatreId;
    private Set<Seat> seats;

    public Screen(int id, int theatreId, Set<Seat> seats) {
        this.id = id;
        this.theatreId = theatreId;
        this.seats = seats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public Set<Seat> getSeats() {
        return seats;
    }

    public void setSeats(Set<Seat> seats) {
        this.seats = seats;
    }
}
