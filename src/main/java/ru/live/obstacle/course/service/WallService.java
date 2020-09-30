package ru.live.obstacle.course.service;

import ru.live.obstacle.course.model.athlete.Athlete;
import ru.live.obstacle.course.model.obstacle.Obstacle;

public class WallService {

    public boolean jumpToWall(Athlete athlete, Obstacle obstacle){
        int actualAthlete = athlete.getMaxJumpHeight();
        int actualObstacle = obstacle.getSizeObstacles();
        if (actualAthlete>=actualObstacle){
            return true;
        }else {
            return false;
        }
    }
}
