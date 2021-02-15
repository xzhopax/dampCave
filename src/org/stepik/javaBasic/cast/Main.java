package org.stepik.javaBasic.cast;

public class Main {
    public static int count = 0;
    public interface RobotConnection extends AutoCloseable {
        void moveRobotTo(int x, int y);
        @Override
        void close();
    }
    public interface RobotConnectionManager {
        RobotConnection getConnection();
    }
    public static class RobotConnectionException extends RuntimeException {

        public RobotConnectionException(String message) {
            super(message);

        }

        public RobotConnectionException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean success = false;
        for (int i = 0; !success && (i < 3); ++i) {
            try (RobotConnection connection = robotConnectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                success = true;
            } catch (RobotConnectionException e) {}
        }
        if (!success) {
            throw new RobotConnectionException("3 attempts failed");
        }
    }

    public static void main(String[] args) {







    }
}
