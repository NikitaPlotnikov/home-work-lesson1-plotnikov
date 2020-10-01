package ru.live.obstacle.course.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.live.obstacle.course.model.athlete.Athlete;
import ru.live.obstacle.course.model.athlete.Bot;
import ru.live.obstacle.course.model.athlete.Cat;
import ru.live.obstacle.course.model.athlete.Human;
import ru.live.obstacle.course.model.obstacle.Treadmill;
import ru.live.obstacle.course.model.obstacle.Wall;

import static org.junit.jupiter.api.Assertions.*;

class WallServiceTest {
    @Test
    void positiveJumpCatOnWall() {
        WallService wallService = new WallService();
        Wall wall = new Wall(10);
        Athlete athlete = new Cat(1,11,"athlete");
        boolean actual = wallService.jumpToWall(athlete,wall);

     Assertions.assertTrue(actual);
    }
    @Test
    void negativeJumpCatOnWall() {
        WallService wallService = new WallService();
        Wall wall = new Wall(10);
        Athlete athlete = new Cat(1,9,"athlete");
        boolean actual = wallService.jumpToWall(athlete,wall);
        Assertions.assertFalse(actual);
    }
    @Test
    void positiveJumpHumanOnWall() {
        WallService wallService = new WallService();
        Wall wall = new Wall(10);
        Athlete athlete = new Human(1,14,"athlete");
        boolean actual = wallService.jumpToWall(athlete,wall);
        Assertions.assertTrue(actual);
    }
    @Test
    void negativeJumpHumanOnWall() {
        WallService wallService = new WallService();
        Wall wall = new Wall(10);
        Athlete athlete = new Human(1,5,"athlete");
        boolean actual = wallService.jumpToWall(athlete,wall);
        Assertions.assertFalse(actual);
    }
    @Test
    void positiveJumpBotOnWall() {
        WallService wallService = new WallService();
        Wall wall = new Wall(10);
        Athlete athlete = new Bot(1,20,"athlete");
        boolean actual = wallService.jumpToWall(athlete,wall);
        Assertions.assertTrue(actual);
    }
    @Test
    void negativeJumpBotOnWall() {
        WallService wallService = new WallService();
        Wall wall = new Wall(10);
        Athlete athlete = new Bot(1,1,"athlete");
        boolean actual = wallService.jumpToWall(athlete,wall);
        Assertions.assertFalse(actual);
    }

}