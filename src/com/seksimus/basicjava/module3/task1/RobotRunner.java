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

            if (robot.getDirection() == Direction.DOWN ) {
                robot.turnLeft();
            } else {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            }
            int steps = toX - robot.getX();
            for (int i = 0; i < steps; i++) {
                robot.stepForward();
            }
        }

        if (toX < robot.getX()) {

            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            } else {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnRight();
                }
            }

            int steps = robot.getX() - toX;
            for (int i = 0; i < steps; i++) {
                robot.stepForward();
            }
        }

        if (toY > robot.getY()) {

            if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            } else {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
            }

            int steps = toY - robot.getY();
            for (int i = 0; i < steps; i++) {
                robot.stepForward();
            }
        }

        if (toY < robot.getY()) {

            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            } else {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnRight();
                }
            }

            int steps = robot.getY() - toY;
            for (int i = 0; i < steps; i++) {
                robot.stepForward();
            }
        }
    }

//        if (toX > robot.getX()) {
//            turnTo(robot, Direction.RIGHT);
//            moveSteps(robot, toX - robot.getX());
//        }
//
//        if (toX < robot.getX()) {
//            turnTo(robot, Direction.LEFT);
//            moveSteps(robot, robot.getX() - toX);
//        }
//
//        if (toY > robot.getY()) {
//            turnTo(robot, Direction.UP);
//            moveSteps(robot, toY - robot.getY());
//        }
//
//        if (toY < robot.getY()) {
//            turnTo(robot, Direction.DOWN);
//            moveSteps(robot, robot.getY() - toY);
//        }
//    }
//
//    private static void turnTo(Robot robot, Direction direction) {
//        while (robot.getDirection() != direction) {
//            robot.turnRight();
//        }
//    }
//
//    private static void moveSteps(Robot robot, int steps) {
//        for (int i = 0; i < steps; i++) {
//            robot.stepForward();
//        }
//    }
}