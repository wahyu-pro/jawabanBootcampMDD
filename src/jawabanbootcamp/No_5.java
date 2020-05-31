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
public class No_5 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan tahun untuk inputan pertama = ");
        int tahun1 = input.nextInt();
        System.out.print("Masukan tahun untuk inputan kedua = ");
        int tahun2 = input.nextInt();
        System.out.println();
        System.out.println("========================================================");
        System.out.println();
        System.out.println("Daftar Tahun kabisat diantara inputan pertama dan kedua");
        System.out.println();
        for (int i = tahun1; i <= tahun2; i++){
            if (i % 4 == 0){
                if (i % 400 == 0){
                    System.out.println(i);
                }
                
            }
        }
        
    }
    
}
