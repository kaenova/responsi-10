/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author kaeno
 */
public class Admin extends Akun {

    private Admin(int id, String username, String password) {
        super(id, username, password);
    }

    public static Admin login(Database db, String username, String password) throws Exception {

        Connection con = db.getConnection();
        PreparedStatement st = con.prepareStatement("SELECT * FROM akun WHERE (username = ?) AND (password = ?);");
        st.setString(1, username);
        st.setString(2, password);

        ResultSet rs = st.executeQuery();
        if (!rs.next()) {
            throw new Exception("User tidak ditemukan");
        }
        int id = rs.getInt("id");
        String usrname = rs.getString("username");
        String psword = rs.getString("password");

        System.out.println("Ada usernya euy!");
        return new Admin(id, username, password);
    }

    public Toko buatToko(Database db, String nama) throws Exception {
        Connection con = db.getConnection();
        PreparedStatement st = con.prepareStatement("INSERT INTO toko (id_akun, nama) VALUES (?, ?);", Statement.RETURN_GENERATED_KEYS);
        st.setInt(1, super.getId());
        st.setString(2, nama);
        if (st.executeUpdate() < 1) {
            throw new Exception("Fail to insert");
        }
        ResultSet rs = st.getGeneratedKeys();
        rs.next();
        return new Toko(db, rs.getInt(1), this);
    }

    public Barang buatBarang(Database db, String nama) throws Exception {
        Connection con = db.getConnection();
        PreparedStatement st = con.prepareStatement("INSERT INTO barang (id_akun, nama) VALUES (?, ?);", Statement.RETURN_GENERATED_KEYS);
        st.setInt(1, super.getId());
        st.setString(2, nama);
        if (st.executeUpdate() < 1) {
            throw new Exception("Fail to insert");
        }
        ResultSet rs = st.getGeneratedKeys();
        rs.next();
        return new Barang(db, rs.getInt(1), this);
    }

    public void sematkanBarangToko(Database db, Barang brg, Toko toko) throws Exception {
        int idBarang = brg.getId();
        int idToko = toko.getId();

        Connection con = db.getConnection();
        PreparedStatement st = con.prepareStatement("INSERT INTO barang_toko (id_barang, id_toko) VALUES (?, ?);", Statement.RETURN_GENERATED_KEYS);
        st.setInt(1, idBarang);
        st.setInt(2, idToko);
        if (st.executeUpdate() < 1) {
            throw new Exception("Fail to insert");
        }
    }

}
