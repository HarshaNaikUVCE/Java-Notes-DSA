// write a program to display the factorial of the given number

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num, factorial, i ; // initilizing the input, factorial and i(to keep track of number)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial : ");
        num = input.nextInt();
        factorial = i =  1;
        while (i <= num) {  
            factorial *= i;
            i++;
        }
        System.out.println("The factorial of the given number is " + factorial);
        
    }
}
