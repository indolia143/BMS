package service;

import model.Movie;
import model.Screen;
import model.Show;

import java.util.*;

public class ShowService {
    Map<Integer, Show> showMap = new HashMap<>();
    Set<Show> showList = new HashSet<>();
    Map<Integer, Set<Show>> theatreShowMap = new HashMap<>();
    MovieService movieService;
    ScreenService screenService;

    public ShowService(MovieService movieService, ScreenService screenService) {
        this.movieService = movieService;
        this.screenService = screenService;
    }

    public String addShow(Show show){
        showMap.put(show.getId(), show);
        showList.add(show);
        if(!theatreShowMap.containsKey(show.getTheatreId())){
            Set<Show> shows = new HashSet<>();
            shows.add(show);
            theatreShowMap.put(show.getTheatreId(),shows);
        }else{
            theatreShowMap.get(show.getTheatreId()).add(show);
        }
        return "Success";
    }

    public Set<Show> getShowsForTheatre(int theatreId){
        if(theatreShowMap.containsKey(theatreId)){
            return theatreShowMap.get(theatreId);
        }else
            return null;
    }

    public Movie getMoviesForAShow(int showId){
        Show show = showMap.get(showId);
       return movieService.getMovie(show.getMovieId());

    }
    public Screen getScreenForAShow(int showId){
        return screenService.getScreen(showMap.get(showId).getScreenId());
    }



}
