/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jawabanbootcamp;

import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author ASUS
 */
public class No_9 {
    public static void main(String args[]) {
        Set<String> set = new HashSet<String>();
        String[] array = {"Jakarta", "Aceh", "Malang", "Medan", "Bontang", "Jogja", "Jakarta", "Bandung", "Malang", "Solo", "Palembang", "Bandung"};

        for (String num : array) {
            set.add(num);
        }

        System.out.println(set);
    }
}
