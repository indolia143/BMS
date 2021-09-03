package controller;

import model.Screen;
import service.ScreenService;

public class ScreenController {
    ScreenService screenService;

    public ScreenController(ScreenService screenService) {
        this.screenService = screenService;
    }
    public String addScreen(Screen screen){
        return  screenService.addScreen(screen);
    }
}
