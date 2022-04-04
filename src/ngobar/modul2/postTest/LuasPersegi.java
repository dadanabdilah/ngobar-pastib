/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngobar.modul2.postTest;

/**
 *
 * @author DADAN ABDILAH
 */
public class LuasPersegi {
    public static void main(String args[]){
        Persegi psg = new Persegi();
        double sisi = psg.sisi;
        double luas;
        
        sisi = 4;
        luas = sisi*sisi;
        System.out.println("Luas nya adalah : " + luas);
    }
}
