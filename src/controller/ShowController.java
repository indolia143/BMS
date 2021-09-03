package controller;

import model.Show;
import service.ShowService;

public class ShowController {
    ShowService showService;
    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    public String addShow(Show show){
       return showService.addShow(show);
    }
}
