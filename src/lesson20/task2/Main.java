package lesson20.task2;

import lesson20.Connector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//  Задача 2:
//  Вытянуть из базы данных среднее значение возраста пользователей из таблицы users
public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = Connector.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select avg(age) as 'average_age' from users");
        resultSet.next();
        System.out.println("Average age: " + resultSet.getInt("average_age"));
    }
}
