package controller;

import model.Movie;
import service.MovieService;

import java.util.List;
import java.util.Set;

public class MovieController {
    MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    public Movie getMovie(int movieId){
        return movieService.getMovie(movieId);
    }

    public String addMovie(Movie movie, int theatreId){
       return movieService.addMovie(movie,theatreId);
    }

    public Set<Movie> getAllMoviesForATheatre(int thetreId){
        return movieService.getAllMoviesForATheatre(thetreId);
    }


}
