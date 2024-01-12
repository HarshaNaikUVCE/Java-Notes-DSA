// Write a program to calculate the distance b/w two points

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        float point1, point2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 : ");
        point1 = input.nextFloat();
        System.out.print("Enter point 2 : ");
        point2 = input.nextFloat();
        System.out.println("The distance between two points is : " + (point2 - point1));

    }
}
