/* Write a program for calculator */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take input from the user till user does not press X or x
        int ans = 0;
        while (true) {
            // Take the operator as input
            System.out.println("Enter operation to perform (x or X to stop) : ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '/' || op == '*' || op == '%') {
                System.out.println("Enter two Numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }else{
                        System.out.println("Opertaion cannot be done");
                        continue;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'X' || op == 'x') {
                break;
            } else {
                System.out.println("Invalid opearator");
            }
            System.out.println("The answer is "+ans);
        }
    }
}
