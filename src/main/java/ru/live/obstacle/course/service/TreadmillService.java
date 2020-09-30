package ru.live.obstacle.course.service;

import ru.live.obstacle.course.model.athlete.Athlete;
import ru.live.obstacle.course.model.obstacle.Obstacle;

public class TreadmillService {

    public boolean runOnTreadmill(Athlete athlete, Obstacle obstacle){
        int actualAthlete = athlete.getMaxRunDistance();
        int actualObstacle = obstacle.getSizeObstacles();
        if(actualAthlete>=actualObstacle){
            return true;
        }else{
            return false;
        }
    }
}
