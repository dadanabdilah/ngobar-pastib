/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngobar;

import java.io.*;

/**
 *
 * @author Fikri Khairul Shaleh
 */
class Ngobar1 {
    private String nama, alamat;
    private int usia, tinggi;
    
     public void statis(){
        nama = "Fikri Khairul Shaleh";
        alamat = "Sherebon";
        usia = 100;
        tinggi = 200;
        
        System.out.println("Nama Saya adalah: "+nama);
        System.out.println("Alamat: "+alamat);
        System.out.println("Usia:"+usia);
        System.out.println("Tinggi: "+tinggi);
    }
    
    
    public void dinamisScanner(String nama, String alamat, int usia, int tinggi){
        // Output
        System.out.println("");
        System.out.println("Nama Saya adalah: "+nama);
        System.out.println("Alamat: "+alamat);
        System.out.println("Usia:"+usia);
        System.out.println("Tinggi: "+tinggi);
    }
    
     public void dinamisBR(String nama, String alamat, int usia, int tinggi) throws IOException{
         // Output
         System.out.println("");
         System.out.println("Nama Saya adalah: "+nama);
         System.out.println("Alamat: "+alamat);
         System.out.println("Usia:"+usia);
         System.out.println("Tinggi: "+tinggi);
     }
     
     public void luasLingkaran()
    {
        double luas, PI;
        int r;
        
        PI = 3.14;
        r = 18;
        
        luas = PI * r * r;
        
        System.out.println("Luas lingkaran: "+luas);
    }
}
