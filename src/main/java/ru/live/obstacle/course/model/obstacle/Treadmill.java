package ru.live.obstacle.course.model.obstacle;

public class Treadmill implements Obstacle{
    private int sizeObstacles;

    public Treadmill(int sizeObstacles) {
        this.sizeObstacles = sizeObstacles;
    }

    @Override
    public int getSizeObstacles() {
        return sizeObstacles;
    }
}
