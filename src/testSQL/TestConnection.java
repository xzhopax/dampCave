package testSQL;

import java.sql.*;

public class TestConnection {
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "root";
    public static final String URL = "jdbc:mysql://localhost:3306/mysql";
    public static Statement statement;
    public static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(URL,USER_NAME, PASSWORD);
        } catch (SQLException throwables){
            throwables.printStackTrace();
            throw new RuntimeException();
        }
    }

    static {
        try {
            statement = connection.createStatement();
        }catch (SQLException throwables){
            throwables.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        statement.executeUpdate("CREATE SCHEMA test DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;");

        statement.executeUpdate(
                            "CREATE TABLE test.testTable (" +
                                "id int auto_increment primary key, " +
                                "name varchar(38) not null, " +
                                "quantity varchar(10) not null, " +
                                "price varchar(10) not null)");

        statement.executeUpdate("INSERT INTO `test`.`testTable` (name,quantity,price) values ('Patrol','12','12')");
        statement.executeUpdate("INSERT INTO `test`.`testTable` (name,quantity,price) values ('Patrol','12','12')");
        statement.executeUpdate("INSERT INTO `test`.`testTable` (name,quantity,price) values ('Patrol','12','12')");
        ResultSet resultSet = statement.executeQuery("SELECT * FROM test.testtable");

        while (resultSet.next()){
            System.out.println(resultSet.getString(2) + " " +
                    resultSet.getString(3) + " " +
                    resultSet.getString(4));
        }
    }

}
