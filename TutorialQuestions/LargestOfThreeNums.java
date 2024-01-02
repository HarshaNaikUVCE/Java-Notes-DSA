/*Write a program to find the largest of three numbers */
package TutorialQuestions;

import java.util.Scanner;

public class LargestOfThreeNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int largest = num1;
        if (largest < num2) {
            largest = num2;
        }
        if (largest < num3) {
            largest = num3;
        }
        System.out.println(largest);
        System.out.println(largest);
    }
}
