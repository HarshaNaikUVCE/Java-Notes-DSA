// write a program to find out the average of batsman

import java.util.Scanner;

public class AverageOfBatsman {
    public static void main(String[] args) {
        double  run, sum;
        int innings;
        sum = 0; 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total innings batsman played : ");
        innings = input.nextInt();
        for (int index = 1; index <= innings; index++) {
            System.out.println("Enter runs "+ index + " innings :");
            run = input.nextInt();
            sum += run;
        }
        System.out.println("The average of the batsman in "+  innings + " is : " + (sum/innings));
    }
}
