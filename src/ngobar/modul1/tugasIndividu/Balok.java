/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngobar.modul1.tugasIndividu;

/**
 *
 * @author DADAN ABDILAH
 */
public class Balok {
    public static void main(String args[]){
        int p,l,t;
        int luas, volume, keliling;
        
        p = 2;
        l = 4;
        t = 6;
        
        luas = 2*((p*l)+(p*t)+(l*t));
        System.out.println("Luas Nya : " + luas);
        
        volume = p*l*t;
        System.out.println("Volume Nya : " + volume);
        
        keliling = 4*(p+l+t);
        System.out.println("Keliling Nya : " + keliling);
    }
}
