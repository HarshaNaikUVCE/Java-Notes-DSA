
/*Write a program to find the fibonacci number of the given number */
import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        long num1 = 0;
        long num2 = 1;
        long count = 2;
        long fibo;
        if (num == 1) {
            System.out.println(num1);
        } else {
            while (count <= num) {
                fibo = num1 + num2;
                num1 = num2;
                num2 = fibo;
                count++;
            }
            System.out.println(num2);
        }

    }
}
