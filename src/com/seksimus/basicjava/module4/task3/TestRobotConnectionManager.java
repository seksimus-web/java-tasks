package com.seksimus.basicjava.module4.task3;

public class TestRobotConnectionManager implements RobotConnectionManager{

    @Override
    public RobotConnection getConnection() {
        return new TestRobotConnection();
    }
}
