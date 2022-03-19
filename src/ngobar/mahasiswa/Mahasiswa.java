/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngobar.mahasiswa;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Mahasiswa {
    private String nim, nama;
    private char JK;
    private String prodi;
    
    public Mahasiswa(String nim, String nama, char JK, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.JK = JK;
        this.prodi = prodi;    }
    
    public void tampilMahasiswa()
    {
        System.out.println("NIM: "+nim);
        System.out.println("Nama: "+nama);
        System.out.println("Jenis Kelamin: "+JK);
        System.out.println("Program Studi: "+prodi);
        System.out.println("Belajar Untuk Meraih Masa Depan");
    }
    
    public void tampilFakultas()
    {
        System.out.println("FKOM");
    }
}
