/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author kaeno
 */
public class Akun {

    private final int id;
    private final String username;
    private final String password;

    Akun(int id, String username, String password) {
        this.username = username;
        this.password = password;
        this.id = id;
    }

    public static void Register(Database db, String username, String password) throws Exception {
        Connection con = db.getConnection();
        PreparedStatement st = con.prepareStatement("INSERT INTO akun (username, password) VALUES (?, ?);");
        st.setString(1, username);
        st.setString(2, password);
        st.executeUpdate();
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    } 
    
}
