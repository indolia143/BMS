package service;

import model.Movie;
import model.Show;
import model.Theatre;

import java.util.*;

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
//        return "success" + theatre.toString();
    }

    public Theatre getTheatreByTheatreId(int theatreId){
        if(!theatreMap.containsKey(theatreId)){
            return null;
        }else
        return theatreMap.get(theatreId);
    }

    public Set<Theatre> getTheatreByCityName(String cityName){
        List<Integer> integerList = new ArrayList<>();
        integerList.addAll(Arrays.asList(1,2,3,4,20));
        if(!theatreCityMap.containsKey(cityName)){
            return  null;
        }
        if(integerList.contains(3))
            return theatreCityMap.get(cityName);
        else
        return theatreCityMap.get(cityName);
    }

    public Set<Show> getAllShowsForTheatre(int theatreId){
        return showService.getShowsForTheatre(theatreId);
    }

    public Set<Movie> getAllMoviesForATheatre(int thetreId){
        return movieService.getAllMoviesForATheatre(thetreId);
    }




}
