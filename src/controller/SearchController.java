package controller;

import model.Theatre;
import service.MovieService;
import service.ShowService;
import service.TheatreService;

import java.util.Set;

public class SearchController {
    TheatreService theatreService;
    MovieService movieService;
    ShowService showService;

    public SearchController(TheatreService theatreService, MovieService movieService, ShowService showService) {
        this.theatreService = theatreService;
        this.movieService = movieService;
        this.showService = showService;
    }

    public Set<Theatre> getAllTheatreByCityName(String cityName){
        return theatreService.getTheatreByCityName(cityName);
    }



}
