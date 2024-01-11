// Write a program to substract the sum and product of two numbers

import java.util.Scanner;

public class SumProduct{
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        num1 = input.nextInt();
        num2 = input.nextInt();


        int sum = num1 + num2;
        int product = num1 * num2;

        int substract = sum - product;
        
        System.out.println("The difference between sum and product is "+ substract);
        
    }
}