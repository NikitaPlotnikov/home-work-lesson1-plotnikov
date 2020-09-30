package ru.live.obstacle.course.model.athlete;

import ru.live.obstacle.course.model.athlete.Athlete;

public class Human implements Athlete {
    private int maxRunDistance;
    private int maxJumpHeight;

    public Human(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    @Override
    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }
}
