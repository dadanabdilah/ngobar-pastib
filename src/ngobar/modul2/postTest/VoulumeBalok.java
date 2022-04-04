/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngobar.modul2.postTest;

import java.io.*;
/**
 *
 * @author DADAN ABDILAH
 */
public class VoulumeBalok {
    public static void main(String args[]) throws IOException{
        double volume;
        Balok bl = new Balok();
            
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.printf("Panjang Balok : ");
        bl.panjang = Double.parseDouble(br.readLine());
        System.out.printf("Lebar Balok : ");
        bl.lebar = Double.parseDouble(br.readLine());
        System.out.printf("Tinggi Balok : ");
        bl.tinggi = Double.parseDouble(br.readLine());
        volume = bl.panjang*bl.lebar*bl.tinggi;
        System.out.println("Volume Balok = " + volume + "Cm3");
    }
}
