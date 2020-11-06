/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119028.latihan40.warnakepribadian.oo;

/**
 *
 
 * @author
 * NAMA     : Rizal Sihombing
 * KELAS    : IF1
 * NIM      : 10119028
 * Deskripsi Program : Program ini berisi program untuk menampilkan kepribadian
 *                     user berdasarkan warna dengan konsep OO   
 */
public class IF110119028Latihan40WarnaKepribadianOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKepribadian kepribadian = new WarnaKepribadian();
        kepribadian.inputWarna();
        kepribadian.inputNama();
        kepribadian.cekKepribadian();
    }
    
}
