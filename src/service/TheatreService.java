package service;

import model.Movie;
import model.Show;
import model.Theatre;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TheatreService {
    Map<Integer, Theatre> theatreMap = new HashMap<>();
    Map<String, Set<Theatre>> theatreCityMap = new HashMap<>();
    ShowService showService;
    MovieService movieService;

    public TheatreService(ShowService showService, MovieService movieService) {
        this.showService = showService;
        this.movieService = movieService;
    }

    public String addThreatre(Theatre theatre){
        theatreMap.put(theatre.getId(),theatre);
        String theatreString = null;
        if(theatreCityMap.containsKey(theatre.getCityName())){
            theatreCityMap.get(theatre.getCityName()).add(theatre);
        }else{
            Set<Theatre> theatres = new HashSet<>();
            theatres.add(theatre);
            theatreCityMap.put(theatre.getCityName(), theatres);
        }
        theatreString = theatreString+ "success";
        theatreString = theatreString +theatre;
        return theatreString;
    }

    public Theatre getTheatreByTheatreId(int theatreId){
        if(!theatreMap.containsKey(theatreId)){
            return null;
        }
        return theatreMap.get(theatreId);
    }

    public Set<Theatre> getTheatreByCityName(String cityName){
        if(!theatreCityMap.containsKey(cityName)){
            return  null;
        }
        return theatreCityMap.get(cityName);
    }

    public Set<Show> getAllShowsForTheatre(int theatreId){
        return showService.getShowsForTheatre(theatreId);
    }

    public Set<Movie> getAllMoviesForATheatre(int thetreId){
        return movieService.getAllMoviesForATheatre(thetreId);
    }




}
