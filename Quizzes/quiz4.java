package Quizes;
import java.util.Scanner;
public class quiz4 {
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int elem = 1;
        int input = 0;
        System.out.print("How many elements you wanted in your array: ");
        elem = scnr.nextInt();
        int[] array= new int[elem];
        for(int i = 0; i <= (elem - 1);)
        {
            System.out.print("Enter the value of element " + (i + 1) + " : ");
            input = scnr.nextInt();
            for(int a = i; a >= 0; a--)
            {
                if(input == array[a])
                {
                    System.out.println("Sorry. You already given that number.\nTry again.");
                    i--;
                    break;
                }
            }
            array[i] = input;
            i++;
        }
        for(int a = 0; a < array.length; a++)
        {
            System.out.println("Element " + (a + 1) + ": " + array[a]);
        }
        System.out.print("Reverse order of the element: \n");
        for(int a = (array.length-1); a >= 0 ; a--)
        {
            System.out.print(array[a] + ", ");
        }
        scnr.close();
    }
}
