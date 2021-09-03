package model;

import java.util.List;

public class Show {
    private String timing;
    private int id;
    private int screenId;
    private int theatreId;
    private int movieId;

    public Show(String timing, int id, int screenId, int theatreId, int movieId) {
        this.timing = timing;
        this.id = id;
        this.screenId = screenId;
        this.theatreId = theatreId;
        this.movieId = movieId;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
}
