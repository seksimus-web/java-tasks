package com.seksimus.basicjava.module3.task1;

public class Robot {

    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        switch (direction) {
            case UP -> direction = Direction.LEFT;
            case LEFT -> direction = Direction.DOWN;
            case DOWN -> direction = Direction.RIGHT;
            case RIGHT -> direction = Direction.UP;
        }
    }

    public void turnRight() {
        switch (direction) {
            case UP -> direction = Direction.RIGHT;
            case RIGHT -> direction = Direction.DOWN;
            case DOWN -> direction = Direction.LEFT;
            case LEFT -> direction = Direction.UP;
        }
    }

    public void stepForward() {
        switch (direction) {
            case UP -> y++;
            case DOWN -> y--;
            case LEFT -> x--;
            case RIGHT -> x++;
        }
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}