package Quizes;
import java.util.Scanner;
/*
 * Dispay the cube of a number;
 */
public class quiz3no1a {
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int input = 0;
        int result = 0;
        System.out.print("Input number of term: ");
        input = scnr.nextInt();
        for(int i = 1; i < (input + 1); i++)
        {
            result = i * i * i;
            System.out.println("cube number of " + i + " is " + result);
        }
        scnr.close();
    }
}
