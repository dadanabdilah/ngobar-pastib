/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngobar.buku;

import java.util.Scanner;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Bk {
    private static String judul, pengarang, penerbit;
    private static int tahun;
    
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        
        System.out.print("Masukan Judul: ");
        judul = key.nextLine();
        System.out.print("Masukan Pengarang: ");
        pengarang = key.nextLine();
        System.out.print("Masukan Penerbit: ");
        penerbit = key.nextLine();
        System.out.print("Masukan Tahun Terbit: ");
        tahun = key.nextInt();
        
        Buku bk = new Buku();
        bk.terimaData(judul, pengarang, penerbit, tahun);
        bk.tampilData();
    }
}
