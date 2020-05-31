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
public class No_1 {
    public static void main (String [] args){
    //deklarasikan class scanner nya dulu
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Program menentukan grade dari suatu masukan angka");
      System.out.print("Masukan angka : ");
      int nilai = scanner.nextInt();
      
      if (nilai >= 90) {
          System.out.println("A");
      }else if (nilai >= 80 && nilai <= 89){
          System.out.println("B");
      }else if (nilai >= 70 && nilai <= 79){
          System.out.println("C");
      }else if (nilai >= 60 && nilai <= 69){
          System.out.println("D");
      }else if (nilai < 59){
          System.out.println("E");
      }
        
    }
}
