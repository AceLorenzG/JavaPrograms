package Quizes;

/*
 * Will Determine the second highest number.
 */
import java.util.Scanner;

public class quiz2no2 {
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int high = 0;
        int mid = 0;
        int input = 0;
        System.out.println("This will determine the second highest number\ngiven by the user.\nThe user will give 5 numbers.");
        System.out.print("Give a 1st number: ");
        input = scnr.nextInt();
        if(input > high) {
            high = input;
        }
        System.out.print("Give a 2nd number: ");
        input = scnr.nextInt();
        if(input > high) {
            mid = high;
            high = input;
        } else if(input > mid) {
            mid = input;
        }
        System.out.print("Give a 3rd number: ");
        input = scnr.nextInt();
        if(input > high) {
            mid = high;
            high = input;
        } else if(input > mid) {
            mid = input;
        }
        System.out.print("Give a 4th number: ");
        input = scnr.nextInt();
        if(input > high) {
            mid = high;
            high = input;
        } else if(input > mid) {
            mid = input;
        }
        System.out.print("Give a 5th number: ");
        input = scnr.nextInt();
        if(input > high) {
            mid = high;
            high = input;
        } else if(input > mid) {
            mid = input;
        }
        System.out.println("Your second highest number is " + mid);
        scnr.close();
    }
}
