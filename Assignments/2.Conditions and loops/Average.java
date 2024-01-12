// Write a program to calculate the average of N number.

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        float i, sum, inputNum; // float should be used
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find average of N number (0 to exit) : ");
        inputNum = input.nextFloat();
        sum = i = 0;
        while (inputNum != 0) {
            sum += inputNum;
            i++;
            System.out.print("Enter a number to find average of N number (0 to exit) : ");
            inputNum = input.nextFloat();
        }
        if ( i != 0) {
           double avg = sum / i;
        System.out.println("The average of "+ i +" numbers is " + avg); 
        }else{
            System.out.println("The program is not compatable");
        }
        
    }
}
