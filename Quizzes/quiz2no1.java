package Quizes;
/*
 * admission for a professional course. The program will ask for the result of the
three exams in Math, Physics and Chemistry. If the score for Math is greater
than equal to 65 and score in Physics is greater than equal to 55 and score in
Chemistry is greater than equal to 50, the candidate is eligible. Also, if the
total score for all subjects is greater than 180, the candidate is also
eligible. If the total score for math and physics is greater than 140, the
candidate is also eligible. If those conditions were not met, the candidate is
not eligible. (17 pts)
 */

import java.util.Scanner;
public class quiz2no1
{
    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int math = 0;
        int physc = 0;
        int chem = 0;
        System.out.println("Determine weather you are eligible or not\nbased on your score in the exam");
        System.out.print("Score in math? ");
        math = scnr.nextInt();
        System.out.print("Score in physics? ");
        physc = scnr.nextInt();
        System.out.print("Score in chem? ");
        chem = scnr.nextInt();
        if(math >= 65 && physc >= 55 && chem >= 50 || (math + physc + chem) > 180 || (math + physc) > 140)
        {
            System.out.println("Congratulations!! You are eligible!!");
        } else {
            System.out.println("Sorry. You are not eligible.");
        }
        scnr.close();
    }
}