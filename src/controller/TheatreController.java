package controller;

import model.Theatre;
import service.TheatreService;

import java.util.List;
import java.util.Set;

public class TheatreController {
    TheatreService theatreService;

    public TheatreController(TheatreService theatreService) {
        this.theatreService = theatreService;
    }


    public String addTheatre(Theatre theatre){
       return theatreService.addThreatre(theatre);
    }
    public Theatre getTheatre(int theatreId){
        return theatreService.getTheatreByTheatreId(theatreId);
    }
    public Set<Theatre> getAllTheatreByCityName(String cityName){
        return theatreService.getTheatreByCityName(cityName);
    }

}
