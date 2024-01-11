// program to display the factors of given number

import java.util.Scanner;

public class FactorsOfGivenNumber {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find it's factors : ");
        number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }

    }

}
