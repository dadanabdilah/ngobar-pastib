/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngobar;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Fikri Khairul Shaleh
 */
public class Ngobar {
    
    /**
     * @param args the command line arguments
     */
    
    private static String nama, alamat;
    private static int usia, tinggi;
    private final static Ngobar1 ngobs = new Ngobar1();
    
    public static void main(String[] args) throws IOException {
        // Tampilkan data statis
        System.out.println("===== Data Statis =====");
        ngobs.statis();
        System.out.println("=======================");
        
        // Masukan dan tampilkan data dinamis menggunakan Scanner
        System.out.println("===== Data Dinamis Menggunakan Scanner =====");
        inputScanner();
        System.out.println("=======================");
        System.out.println("");
        
        // Masukan dan tampilkan data dinamis menggunakan BufferedReader
        System.out.println("===== Data Dinamis Menggunakan BufferedReader =====");
        inputBR();
        System.out.println("=======================");
        System.out.println("");
        
        // Tampilkan Luas Lingkaran
        System.out.println("===== Luas Lingkaran =====");
        ngobs.luasLingkaran();
        System.out.println("=======================");
        System.out.println("");
        
        // Tampilkan data s
//        statis();
//        dinamisScanner();
//        luasLingkaran();
//        dinamisBR();
        // TODO code application logic here
        // Output
//        Ngobar1 ngobarrr = new Ngobar1();
//        
//        ngobarrr.nama();
//        
//        System.out.println("1212122112");
//        
//        fikri();
//        ngobarrr.nama();
//        ngobarrr.nama();
        // Sistem Komentar Satu Baris
        /*
        Komentar
        Dua Baris
        */
//        nama = "121212";
//        huruf = 'F';
//        angka = 'A';
//        System.out.print(angka);
//        Scanner keyboard = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        
//        System.out.print("Masukan nama: ");
//        nama = keyboard.nextLine();
//        try{
//             nama = br.readLine();
//        
//            System.out.println("Namamu adalah: "+nama);
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
       
    }
    
    public static void inputScanner(){
        Scanner keyboard = new Scanner(System.in);
    
        // Input
        System.out.print("Masukan nama: ");
        nama = keyboard.nextLine();
        System.out.print("Masukan alamat: ");
        alamat = keyboard.nextLine();
        System.out.print("Masukan usia: ");
        usia = keyboard.nextInt();
        System.out.print("Masukan tinggi: ");
        tinggi = keyboard.nextInt();
        
        ngobs.dinamisScanner(nama, alamat, usia, tinggi);
    }
    
    public static void inputBR() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Input
        System.out.print("Masukan nama: ");
        nama = br.readLine();
        System.out.print("Masukan alamat: ");
        alamat = br.readLine();
        System.out.print("Masukan usia: ");
        usia = Integer.parseInt(br.readLine());
        System.out.print("Masukan tinggi: ");
        tinggi = Integer.parseInt(br.readLine());
        
        ngobs.dinamisBR(nama, alamat, usia, tinggi);
    }
}
