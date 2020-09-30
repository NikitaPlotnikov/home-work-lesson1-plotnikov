package ru.live.obstacle.course.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.live.obstacle.course.model.athlete.Athlete;
import ru.live.obstacle.course.model.athlete.Bot;
import ru.live.obstacle.course.model.athlete.Cat;
import ru.live.obstacle.course.model.athlete.Human;
import ru.live.obstacle.course.model.obstacle.Obstacle;
import ru.live.obstacle.course.model.obstacle.Treadmill;

import static org.junit.jupiter.api.Assertions.*;

class TreadmillServiceTest {

    @Test
    void positiveRunCatOnTreadmill() {
        TreadmillService treadmillService = new TreadmillService();
        Treadmill treadmill = new Treadmill(10);
        Athlete athlete = new Cat(12,20);
        boolean actual = treadmillService.runOnTreadmill(athlete, treadmill);
        Assertions.assertTrue(actual);
    }
    @Test
    void negativeRunCatOnTreadmill() {
        TreadmillService treadmillService = new TreadmillService();
        Treadmill treadmill = new Treadmill(10);
        Athlete athlete = new Cat(8,11);
        boolean actual = treadmillService.runOnTreadmill(athlete, treadmill);
        Assertions.assertFalse(actual);
    }
    @Test
    void positiveRunHumanOnTreadmill() {
        TreadmillService treadmillService = new TreadmillService();
        Treadmill treadmill = new Treadmill(20);
        Athlete athlete = new Human(20,20);
        boolean actual = treadmillService.runOnTreadmill(athlete, treadmill);
        Assertions.assertTrue(actual);
    }
    @Test
    void negativeRunHumanOnTreadmill() {
        TreadmillService treadmillService = new TreadmillService();
        Treadmill treadmill = new Treadmill(20);
        Athlete athlete = new Human(19,11);
        boolean actual = treadmillService.runOnTreadmill(athlete, treadmill);
        Assertions.assertFalse(actual);
    }
    @Test
    void positiveRunBotOnTreadmill() {
        TreadmillService treadmillService = new TreadmillService();
        Treadmill treadmill = new Treadmill(55);
        Athlete athlete = new Bot(1999,20);
        boolean actual = treadmillService.runOnTreadmill(athlete, treadmill);
        Assertions.assertTrue(actual);
    }
    @Test
    void negativeRunBotOnTreadmill() {
        TreadmillService treadmillService = new TreadmillService();
        Treadmill treadmill = new Treadmill(10);
        Athlete athlete = new Bot(2,11);
        boolean actual = treadmillService.runOnTreadmill(athlete, treadmill);
        Assertions.assertFalse(actual);
    }


}
