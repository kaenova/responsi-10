/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author kaeno
 */
public class Toko {

    private int id;
    private String nama;
    private Admin admn;
    private Barang[] barang;

    public Toko(Database db, int idToko, Admin adm) throws Exception {
        Connection con = db.getConnection();
        PreparedStatement st = con.prepareStatement("SELECT * FROM toko WHERE (id = ?);");
        st.setInt(1, idToko);
        ResultSet rs = st.executeQuery();
        if (!rs.next() || rs.getInt("id_akun") != adm.getId()) {
            // Tidak ditemukan
            throw new Exception("Tidak ditmukan toko");
        }
        this.nama = rs.getString("nama");
        this.admn = adm;
        this.id = rs.getInt("id");
    }

    public void infoToko() {
        // Print semua info toko
    }

    public void lihatBarang() {
        // Print semua barang
    }

    public int getId() {
        return id;
    }

}
