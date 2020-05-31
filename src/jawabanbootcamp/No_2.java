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
public class No_2 {
    public static void main(String args[])
  {
    int angka;
    System.out.println("Masukkan sebuah angka:");
 
    //Input dari user disimpan dalam variabel angka
    Scanner input = new Scanner(System.in);
    angka = input.nextInt();
 
    /* Kalau angka bisa dibagi dua maka itu adalah bilangan genap
     * selain dari itu adalah bilangan ganjil*/
    if ( angka % 2 == 0 )
        System.out.println(angka + " adalah bilangan genap");
     else
        System.out.println(angka + " adalah bilangan ganjil");
  }  
}
