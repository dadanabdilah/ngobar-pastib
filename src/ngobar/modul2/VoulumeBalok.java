/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngobar.modul2;

/**
 *
 * @author DADAN ABDILAH
 */
public class VoulumeBalok {
    public static void main(String args[]){
        double volume;
        
        Balok bl = new Balok();
        bl.panjang = 7;
        bl.lebar = 4;
        bl.tinggi = 5;
        
        volume = bl.panjang*bl.lebar*bl.tinggi;
        System.out.println("Volume Balok = " + volume + "Cm3");
    }
}
