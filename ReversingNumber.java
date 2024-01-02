/*Write a program to reverse the given number */

import java.util.Scanner;

public class ReversingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            count = count*10 + rem;
            num/=10;
        }
        System.out.println(count);
        
    }
}
