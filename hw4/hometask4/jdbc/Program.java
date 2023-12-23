package hometask4.jdbc;

import java.sql.*;
public class Program {

    public static void main(String[] args) {
        String searchAuthor = "Пушкин А.С.";

        DB db = new DB();
        Connection connection = db.dbConnection();
        db.prepareTables(connection);
        db.insertData(connection);
        db.getData(connection, searchAuthor);
        db.dbClose(connection);
    }

}
