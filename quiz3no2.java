package Quizes;
import java.util.Scanner;
public class quiz3no2 {
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int input = 0;
        int count = 0;
        System.out.print("Input a number of rows: ");
        input = scnr.nextInt();
        for(int x = 0; x <= input; x++)
        {
            for(int y = 0; y <= x; y++)
            {
                System.out.print(count + " ");
                count++;
            }
            System.out.println(" ");
        }
        scnr.close();
    }
}
