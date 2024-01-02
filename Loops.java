import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Print numbers from 1-5
        // There are three types of loops
        /*
         * for(){
         * body
         * }
         */
        // for (int num = 1; num <=5 ; num+=2) {
        //     System.out.println(num);
        // }
        
//      print number from 1-n
        Scanner input = new Scanner(System.in);
        // int n = input.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     System.out.println("Hello World");
        // }
        
        /* while syntax
         * while(condition){
         * body
         * }
         */
        long num = 5L;
        // while (num <= 5) {
        //     System.out.println(num);
        //     num++;
        // }

        /* do while syntax
         * do{
         * body
         * }do(condition);
         */

        do {
            System.out.println(num);
            num++;
        } while (num == 5);
    }
}
