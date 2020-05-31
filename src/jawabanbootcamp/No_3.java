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
public class No_3 {
    public static void main(String[] args) {
        int NUM_SCORES = 5;
        int[] listOfScores = new int[NUM_SCORES];
        int min, max;
        double average;

        Scanner in = new Scanner(System.in);

        // Get the first integer and assign it to min, max and average
        listOfScores[0] = getInt(in);
        min = listOfScores[0];
        max = listOfScores[0];
        average = listOfScores[0];

        // Get the remaining integers and process min, max and average
        for (int i = 1; i < listOfScores.length; i++) {
            listOfScores[i] = getInt(in);

            if (listOfScores[i] > max) {
                max = listOfScores[i];
            }
            if (listOfScores[i] < min) {
                min = listOfScores[i];
            }
            average = (average * i + listOfScores[i]) / (i + 1);
        }

        // Display the numbers
        System.out.print("Numbers are: ");
        for (int i = 0; i < listOfScores.length; i++) {
            System.out.print(listOfScores[i] + " ");
        }
        System.out.println();

        // Display the result
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + average);
    }

    private static int getInt(Scanner in) {
        int input;
        // Check if the integer is in the range of 1 to 100
        do {
            System.out.print("Enter in an integer (from 1 to 100): ");
            input = in.nextInt();
            if (input < 1 || input > 100) {
                System.out.println("Error: Invalid integer.");
            }
        } while (input < 1 || input > 100); // Loop back if the integer is not in the range of 1 to 100

        // If yes, return the number
        return input;
    }
}
