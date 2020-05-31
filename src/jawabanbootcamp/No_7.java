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
public class No_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Kata !");
        // Menggunakan logika rekursif
        String str = input.nextLine();
        StringBuilder sb = new StringBuilder();
        //Split String pada spasi
        String[] strArr = str.split("\\s+");
        // Iterasi kata demi kata
        for(String s : strArr) {
            // membalikkan dan menambahkan
            sb.append(reverseString(s)).append(" ");
        }
        System.out.println("String asli = " + str);
        System.out.println("String yang dibalikan = " + sb.toString());
 
    }
      
    private static String reverseString(String str){
        // Validasi String
        if((str == null) || (str.length() <= 1)){
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
