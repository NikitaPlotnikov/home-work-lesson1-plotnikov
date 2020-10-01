package ru.live.obstacle.course.model.athlete;

import ru.live.obstacle.course.model.athlete.Athlete;

public class Cat implements Athlete {
    private int maxRunDistance;
    private int maxJumpHeight;
    private String name;

    public Cat(int maxRunDistance, int maxJumpHeight,String name) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.name = name;
    }



    @Override
    public String toString() {
        return "Cat{" +
                "maxRunDistance=" + maxRunDistance +
                ", maxJumpHeight=" + maxJumpHeight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    @Override
    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public String getName() {
        return name;
    }
}
