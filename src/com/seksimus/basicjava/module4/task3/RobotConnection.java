package com.seksimus.basicjava.module4.task3;

public interface RobotConnection extends AutoCloseable {

    void moveRobotTo(int x, int y);
    @Override
    void close();
}