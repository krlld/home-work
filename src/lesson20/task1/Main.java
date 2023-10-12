package lesson20.task1;

import lesson20.Connector;

import java.sql.*;

//  Задача 1:
//  1.1 Создать модель пользователя в Java(User).
//  1.2 Создать соответствующую модели таблицу в базе данных(users).
//  1.3 Вытянуть с помощью JDBC информацию о пользователе с id=1.
//  1.4 Распарсить данные из ResultSet в объект User.
public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = Connector.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from users where id = 3");
        User user = null;
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String email = resultSet.getString("email");
            String passwordHash = resultSet.getString("password_hash");
            int age = resultSet.getInt("age");
            user = new User(id, email, passwordHash, age);
            System.out.println(user);
        }
    }
}
