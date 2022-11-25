/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Halo semuanya, ini Kaenova. Kalian bisa lihat tutorial 
 * Java dan MySQL disini yaa
 * https://www.petanikode.com/java-mysql/
 */
package responsi;

/**
 *
 * @author kaeno
 */
public class Responsi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // Prepare Database
        Database db = new Database();
        db.getConnection();
        System.out.println("Successfully get a connection");

        // Register Usecase
        Akun.Register(db, "kaenova java", "halo responsi");
        System.out.println("Successfully register");

        // Login Usecase
        Admin admn = Admin.login(db, "kaenova java", "halo responsi");

        // Buat Toko Usecase
        Toko toko = admn.buatToko(db, "IF-01 SEMATKAN");
        System.out.println(toko);

        // Buat Barang Usecase
        Barang brg = admn.buatBarang(db, "IF-01 SEMATKAN");
        System.out.println(brg);

        admn.sematkanBarangToko(db, brg, toko);
        System.out.println("Berhasil menyematkan");
    }

}
