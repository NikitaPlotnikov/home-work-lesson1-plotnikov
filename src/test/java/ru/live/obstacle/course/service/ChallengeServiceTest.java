package ru.live.obstacle.course.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.live.obstacle.course.model.athlete.Athlete;
import ru.live.obstacle.course.model.athlete.Bot;
import ru.live.obstacle.course.model.athlete.Cat;
import ru.live.obstacle.course.model.athlete.Human;
import ru.live.obstacle.course.model.obstacle.Obstacle;
import ru.live.obstacle.course.model.obstacle.Treadmill;
import ru.live.obstacle.course.model.obstacle.Wall;

import java.util.ArrayList;
import java.util.List;

class ChallengeServiceTest {
    ChallengeService challengeRunService = new ChallengeService();
    @Test
    void challengeRunTest() {
        ArrayList<Athlete> athletes = getAthletes();
        ArrayList<Obstacle> obstacles = getTreadmill();
        ArrayList<Athlete> expectedResult = new ArrayList<>();
        expectedResult.add(athletes.get(1));
        expectedResult.add(athletes.get(4));
        expectedResult.add(athletes.get(8));
        List<Athlete> actual = challengeRunService.challengeRun(athletes, obstacles);
        Assertions.assertEquals(actual,expectedResult);
    }
    @Test
    void challengeJumpTest(){
        ArrayList<Athlete> athletes = getAthletes();
        ArrayList<Obstacle> obstacles = getWall();
        ArrayList<Athlete> expectedResult = new ArrayList<>();
        expectedResult.add(athletes.get(1));
        expectedResult.add(athletes.get(5));
        expectedResult.add(athletes.get(7));
        List<Athlete> actual = challengeRunService.challengeJump(athletes, obstacles);
        Assertions.assertEquals(actual,expectedResult);
    }

    private ArrayList<Obstacle> getWall() {
        ArrayList<Obstacle> obstacles = new ArrayList<>();
        Wall wall1 =new Wall(20);
        Wall wall2 =new Wall(15);
        Wall wall3 =new Wall(18);
        Wall wall4 =new Wall(22);
        obstacles.add(wall1);
        obstacles.add(wall2);
        obstacles.add(wall3);
        obstacles.add(wall4);
        return obstacles;
    }

    private ArrayList<Obstacle> getTreadmill() {
        ArrayList<Obstacle> obstacles = new ArrayList<>();
        Treadmill treadmill1 = new Treadmill(100);
        Treadmill treadmill2 = new Treadmill(95);
        Treadmill treadmill3 = new Treadmill(120);
        Treadmill treadmill4 = new Treadmill(80);
        obstacles.add(treadmill1);
        obstacles.add(treadmill2);
        obstacles.add(treadmill3);
        obstacles.add(treadmill4);
        return obstacles;
    }

    private ArrayList<Athlete> getAthletes() {
        Athlete wally = new Bot(100,10,"wally");
        Athlete eva = new Bot(130,22,"eva");
        Athlete fear = new Bot(70,20,"fear");
        Athlete tom = new Cat(78,19,"tom");
        Athlete sam = new Cat(150,21,"sam");
        Athlete mura = new Cat(111,25,"mura");
        Athlete masha = new Human(50,10,"masha");
        Athlete katya = new Human(96,27,"katya");
        Athlete oleg = new Human(120,15,"oleg");
        ArrayList<Athlete> athletes = new ArrayList<>();
        athletes.add(wally);
        athletes.add(eva);
        athletes.add(fear);
        athletes.add(tom);
        athletes.add(sam);
        athletes.add(mura);
        athletes.add(masha);
        athletes.add(katya);
        athletes.add(oleg);
        return athletes;
    }

}