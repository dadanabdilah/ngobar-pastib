/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngobar.modul2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DADAN ABDILAH
 */
public class Praktikum1 {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String nama, kota;
        System.out.printf("Nama Anda : ");
        nama = br.readLine();
        System.out.printf("Kota Asal : ");
        kota = br.readLine();
        System.out.printf("Selamat Datang "+ nama + " dari " +kota);
    }
}
