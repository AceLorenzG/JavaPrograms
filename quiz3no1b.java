package Quizes;
import java.util.Scanner;
/*
 * Dispay the cube of a number;
 */
public class quiz3no1b {
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int input = 0;
        int result = 0;
        System.out.print("Input number of term: ");
        input = scnr.nextInt();
        int i = 1;
        while(i < (input + 1))
        {
            result = i * i * i;
            System.out.println("cube number of " + i + " is " + result);
            i++;
        }
        scnr.close();
    }
}
