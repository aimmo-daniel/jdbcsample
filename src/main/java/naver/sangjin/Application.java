package naver.sangjin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import  java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/springdata";
        String username= "sangjin";
        String password = "pass";

        try(Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connection created: " + connection);
            String sql = "INSERT INTO account VALUES(1, 'sangjin', 'pass')";
            try(PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.execute();
            }
        }
    }

}
