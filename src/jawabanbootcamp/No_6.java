/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jawabanbootcamp;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class No_6 {
    static String[] mahasiswa = {"Wildan", "Taufan", "Adibil", "Adam"};
    
    public static void main(String[] args){
        getMahasiswa(0);
    }
    
    static void getMahasiswa(int absensi){
        if(absensi < mahasiswa.length){
            System.out.println("Absensi No-"+absensi+" Bernama: "+mahasiswa[absensi]);
            getMahasiswa(++absensi);
        }
    }
}
