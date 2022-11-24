/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kaeno
 */
public class Database {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://[HOST]:[PORT]/[DB_NAME]";
    static final String USER = "[DB_USERNAME]";
    static final String PASS = "[DB_PASSWORD]";

    Connection conn;

    public Database() throws SQLException, ClassNotFoundException {
        // Always do this at the start of a application
        Class.forName(Database.JDBC_DRIVER);
        this.conn = DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public Connection getConnection() throws Exception {
        if (this.conn == null) {
            throw new Exception("Database not initialize");
        }
        return this.conn;
    }
}
