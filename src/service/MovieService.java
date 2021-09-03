package service;

import model.Movie;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MovieService {
    Map<Integer, Movie> movieMap = new HashMap<>();
    Map<Integer, Set<Movie>> theatreMovieMap = new HashMap<>();

    public String addMovie(Movie movie, int theatreId){//add only one movie at a time for a theatre!
        movieMap.put(movie.getId(),movie);
        if(theatreMovieMap.containsKey(theatreId)){
            theatreMovieMap.get(theatreId).add(movie);
        }else{
            Set<Movie> movies  = new HashSet<>();
            movies.add(movie);
            theatreMovieMap.put(theatreId, movies);
        }
        return "success: "+ movie.toString() ;
    }
    public  Movie getMovie(int movieId){
        if(!movieMap.containsKey(movieId)){
            return null;
        }
        return movieMap.get(movieId);
        
    }
    public Set<Movie> getAllMoviesForATheatre(int theatreId){
        if(theatreMovieMap.containsKey(theatreId)){
            return theatreMovieMap.get(theatreId);
        }else{
            return null;
        }
    }



}
