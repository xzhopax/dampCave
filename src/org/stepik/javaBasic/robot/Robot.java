package org.stepik.javaBasic.robot;

public class Robot {
    int x;
    int y;
    Direction dir;

    public Direction getDirection() {
        // текущее направление взгляда
        return dir;
    }

    public int getX() {
        // текущая координата X
        return x;
    }

    public int getY() {
        // текущая координата Y
        return y;
    }

    public void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }




    public static void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();

        while (y != toY) {

            if (y < toY) {
                while (robot.getDirection() != Direction.UP){
                    robot.turnRight();
                }
                robot.stepForward();
                y++;
            } else {
                while (robot.getDirection() != Direction.DOWN){
                    robot.turnLeft();
                }
                robot.stepForward();
                y--;
            }
        }

        while (x != toX) {

            if (x < toX) {
                while (robot.getDirection() != Direction.RIGHT){
                    robot.turnRight();
                }
                robot.stepForward();
                x++;
            } else {
                while (robot.getDirection() != Direction.LEFT){
                    robot.turnLeft();
                }
                robot.stepForward();
                x--;
            }
        }
    }
}
