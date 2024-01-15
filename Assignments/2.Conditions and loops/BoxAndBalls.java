/* Write a program to find out the combination of the box and balls
 * case 1 : Every box should contains different number of balls and numbers should not be repeated.
 * case 2 : If number repeated, return false otherwise true
*/

import java.util.Scanner;

public class BoxAndBalls {
    public static void main(String[] args) {
        int box, balls, sum, difference, i;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of balls and number of boxes : ");
        balls = input.nextInt();
        box = input.nextInt();
        difference = sum = 0;
        i = 1;
        while (i < box) {
            sum += i;
            difference = balls - sum;
            if (difference < i) {
                    break;
            }
            i++;
        }

        if (difference < i) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
