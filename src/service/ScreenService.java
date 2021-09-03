package service;

import model.Screen;

import java.util.HashMap;
import java.util.Map;

public class ScreenService {
    Map<Integer, Screen> screenMap = new HashMap<>();


    public String addScreen(Screen screen){
        screenMap.put(screen.getId(), screen);
        return "Success";
    }

    public Screen getScreen(int screenId){
        if(screenMap.containsKey(screenId)){
            return  screenMap.get(screenId);
        }
        return null;
    }

}
