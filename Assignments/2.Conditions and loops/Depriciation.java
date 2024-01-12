/*  Write a program to find the depriciation value of given product
(Depricisian value is the decline in the value of the prodcut)*/

import java.util.Scanner;

public class Depriciation {
    public static void main(String[] args) {
        double quarter1, quarter2, quarter3, quarter4;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter the price of the product in first quarter : ");
            quarter1 = input.nextDouble();
            System.out.print("Enter the price of the product in second quarter : ");
            quarter2 = input.nextDouble();
            System.out.print("Enter the price of the product in third quarter : ");
            quarter3 = input.nextDouble();
            System.out.print("Enter the price of the product in fourth quarter : ");
            quarter4 = input.nextDouble();
            System.out.println("The depriciation value is : " + (quarter4 - quarter1));
            System.out.print("\nEnter the price of the product in first quarter (0 to exit): ");
            quarter1 = input.nextDouble();
        } while (quarter1 != 0);
    }
}
