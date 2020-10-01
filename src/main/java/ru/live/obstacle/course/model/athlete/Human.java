package ru.live.obstacle.course.model.athlete;

import ru.live.obstacle.course.model.athlete.Athlete;

public class Human implements Athlete {
    private int maxRunDistance;
    private int maxJumpHeight;
    private String name;

    public Human(int maxRunDistance, int maxJumpHeight,String name) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
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