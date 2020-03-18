/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

/**
 *
 * @author indriawan
 */
public class main {
    public static void main(String[] args) {
        //membuat objek
        Mahasiswa mhs = new Mahasiswa();

        //memberi nilai atau value
        mhs.nama = "DWI SATRIA INDRIAWAN";
        mhs.kelas = "4B";
        mhs.nim = "18090146";

        //memanggil data
        System.out.println("Nama    : "+mhs.nama);
        System.out.println("Kelas   : "+mhs.kelas);
        System.out.println("NIM     : "+mhs.nim);
        
        
        
    }
}
