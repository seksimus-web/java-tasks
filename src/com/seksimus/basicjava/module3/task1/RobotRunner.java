package com.seksimus.basicjava.module3.task1;

public class RobotRunner {

    public static void main(String[] args) {

        Robot robot = new Robot(0, 0, Direction.UP);

        moveRobot(robot, 3, 2);

        System.out.println("X = " + robot.getX());
        System.out.println("Y = " + robot.getY());
        System.out.println("Direction = " + robot.getDirection());
    }

    public static void moveRobot(Robot robot, int toX, int toY) {

        if (toX > robot.getX()) {
            turnTo(robot, Direction.RIGHT);
            moveSteps(robot, toX - robot.getX());
        }

        if (toX < robot.getX()) {
            turnTo(robot, Direction.LEFT);
            moveSteps(robot, robot.getX() - toX);
        }

        if (toY > robot.getY()) {
            turnTo(robot, Direction.UP);
            moveSteps(robot, toY - robot.getY());
        }

        if (toY < robot.getY()) {
            turnTo(robot, Direction.DOWN);
            moveSteps(robot, robot.getY() - toY);
        }
    }

    private static void turnTo(Robot robot, Direction direction) {
        while (robot.getDirection() != direction) {
            robot.turnRight();
        }
    }

    private static void moveSteps(Robot robot, int steps) {
        for (int i = 0; i < steps; i++) {
            robot.stepForward();
        }
    }
}
//ыыыы