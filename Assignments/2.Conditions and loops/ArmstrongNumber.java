// Write a program to find given number is ArmstrongNumber or not
// It is a special kind of number which is equals to sum of digits and raised by same power.

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int i = 2;
        while ((number / 10) > 9) {
            i++;
            number /= 10;
        }
        while () {
            
        }

    }
}
