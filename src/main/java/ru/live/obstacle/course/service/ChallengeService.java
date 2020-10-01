package ru.live.obstacle.course.service;

import ru.live.obstacle.course.model.athlete.Athlete;
import ru.live.obstacle.course.model.obstacle.Obstacle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ChallengeService {

    public List<Athlete> challengeRun(Collection<Athlete> athletes, Collection<Obstacle> obstacles) {
        TreadmillService treadmillService = new TreadmillService();
        List<Athlete> actualResult = new ArrayList<>(athletes);
        for (Obstacle obstacle : obstacles) {
            Iterator<Athlete> iterator = actualResult.iterator();
            while (iterator.hasNext()) {
                Athlete athlete = iterator.next();
                boolean isPassed = treadmillService.runOnTreadmill(athlete,obstacle);
                if (!isPassed) {
                    iterator.remove();
                }
            }
        }

        return actualResult;
    }
    public List<Athlete> challengeJump(Collection<Athlete> athletes, Collection<Obstacle> obstacles) {
        WallService wallService = new WallService();
        List<Athlete> actualResult = new ArrayList<>(athletes);
        for (Obstacle obstacle : obstacles) {
            Iterator<Athlete> iterator = actualResult.iterator();
            while (iterator.hasNext()) {
                Athlete athlete = iterator.next();
                boolean isPassed = wallService.jumpToWall(athlete,obstacle);
                if (!isPassed) {
                    iterator.remove();
                }
            }
        }

        return actualResult;
    }
}
