/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngobar.mahasiswa;

import ngobar.mahasiswa.Mahasiswa;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Mhs {
    private static String nim, nama;
    private static char JK;
    private static String prodi;
    
    public static void main(String[] args)
    {
        nim = "20210810032";
        nama = "Fikri Khairul Shaleh";
        JK = 'L';
        prodi = "Teknik Informatika";
        
        Mahasiswa mhs = new Mahasiswa(nim, nama, JK, prodi);
        mhs.tampilMahasiswa();
        mhs.tampilFakultas();
    }
}
