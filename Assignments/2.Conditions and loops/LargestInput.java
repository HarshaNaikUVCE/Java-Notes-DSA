// Write a program to find the largest of the input until user inputs 0

import java.util.Scanner;

public class LargestInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("Enter any number(0 to exit) : ");
        int number = input.nextInt();
        int largest = number;
        while (true) {
            if (number != 0) {
                if (number > largest) {
                    largest = number;
                }
            } else {
                System.out.println("The largest number is " + largest);
                break;
            }
            System.out.println("Enter any number(0 to exit) : ");
            number = input.nextInt();
        }
    }

}
