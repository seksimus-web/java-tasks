package com.seksimus.basicjava.module4.task3;

public class TestRobotConnection implements RobotConnection {

    @Override
    public void moveRobotTo(int x, int y) {
        throw new RobotConnectionException("Ошибка во время перемещения");
    }

    @Override
    public void close() {
        System.out.println("Соединение закрыто");
    }
}