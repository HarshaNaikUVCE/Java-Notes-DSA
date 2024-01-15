// Write a program to check a given number is palindrome or not

import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        int num, number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = input.nextInt();
        number = 0;
        int reminder = num % 10;
        int quotient = num / 10;
        while (quotient > 9) {
            quotient = quotient / 10;
        }
        while (reminder > 9) {
            reminder = reminder / 10;
        }
        System.out.println(reminder + " " + quotient);
        if (quotient == reminder) {
            System.out.println("The given number is palindrome");
        }else{
            System.out.println("Given number is not palindrome");
        }
    }
}
