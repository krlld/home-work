package lesson20.task3;

import lesson20.Connector;
import lesson20.task1.User;

import java.sql.*;

//  Задача 1:
//  Реализовать CRUD операции для модели из вашего будущего проекта(или для User).
public class Main {
    public static void main(String[] args) throws SQLException {
        create("qwerty@gmail.com", "1234", 30);
        System.out.println(read(3));
        update(3, "newemail@gmail.com", "9999", 35);
        delete(3);
    }

    public static void create(String email, String passwordHash, int age) throws SQLException {
        Connection connection = Connector.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into users (email, password_hash, age) values (?,?,?)");
        preparedStatement.setString(1, email);
        preparedStatement.setString(2, passwordHash);
        preparedStatement.setInt(3, age);
        preparedStatement.execute();
        System.out.println("User created");
    }

    public static User read(int id) throws SQLException {
        Connection connection = Connector.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from users where id = ?");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("User:");
        resultSet.next();
        return new User(resultSet.getInt("id"),
                resultSet.getString("email"),
                resultSet.getString("password_hash"),
                resultSet.getInt("age"));
    }

    public static void update(int id, String email, String passwordHash, int age) throws SQLException {
        Connection connection = Connector.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("update users set email = ?, password_hash = ?, age = ? where id = ?");
        preparedStatement.setString(1, email);
        preparedStatement.setString(2, passwordHash);
        preparedStatement.setInt(3, age);
        preparedStatement.setInt(4, id);
        preparedStatement.execute();
        System.out.println("User updated");
    }

    public static void delete(int id) throws SQLException {
        Connection connection = Connector.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("delete from users where id = ?");
        preparedStatement.setInt(1, id);
        preparedStatement.execute();
        System.out.println("User deleted");
    }
}
