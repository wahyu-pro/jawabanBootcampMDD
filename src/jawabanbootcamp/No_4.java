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
public class No_4 {
    public static void main (String[] args) {
  
        Scanner input = new Scanner(System.in);

        System.out.println("Silahkan masukkan kalimat ! ");
        String kal = input.nextLine();

        int len = kal.length();
        int b=0 ;
        for(int a=0;a<kal.length();a++){
            if(kal.charAt(a) == kal.charAt(len-1) ){
            len=len-1;
            b+=1;     
        }else{
            break;
        }
        }

        if(b == kal.length()){
        System.out.println(kal+" adalah kalimat palindrom");
        }else{
            System.out.println(kal+ " bukan kalimat palindrom");

        }
    }
}
