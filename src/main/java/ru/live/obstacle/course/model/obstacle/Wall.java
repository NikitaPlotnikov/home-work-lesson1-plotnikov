package ru.live.obstacle.course.model.obstacle;

public class Wall implements Obstacle{
    private int sizeObstacles;

    public Wall(int sizeObstacles) {
        this.sizeObstacles = sizeObstacles;
    }

    @Override
    public int getSizeObstacles() {
        return sizeObstacles;
    }

}
