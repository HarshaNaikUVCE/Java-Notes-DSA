// Write a program to find sum of all numbers

import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        int sum, number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number ( 0 to exit ) : ");
        number = input.nextInt();
        sum = 0;
        while (true) {
            if (number != 0) {
                sum +=number;
            }else{
                System.out.println("The sum of total number is "+ sum);
                break;
            }
            System.out.print("Enter the number ( 0 to exit ) : ");
            number = input.nextInt();
        }
    }
}
