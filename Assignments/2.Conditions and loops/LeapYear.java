// Write a program to find the given year is leap year or not

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any year : ");
        year = input.nextInt();
        if (year % 4 == 0) {
            System.out.println("The given year is leap year");
        } else {
            System.out.println("The given year is not leap year");

        }
    }
}
