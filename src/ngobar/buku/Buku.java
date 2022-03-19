/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngobar.buku;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Buku {
    private String judul, pengarang, penerbit;
    private int tahun;
    
    public void terimaData(String judul, String pengarang, String penerbit, int tahun){
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    
    public void tampilData()
    {
        System.out.println("Judul Buku: "+judul);
        System.out.println("Pengarang: "+pengarang);
        System.out.println("Penerbit: "+penerbit);
        System.out.println("Tahun: "+tahun);
        System.out.println("");
    }
}
