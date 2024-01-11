//Write program to find the area of the triangle( equlilateral, scaline, isosceles), square, rectangle, circle, rhombus, 

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        // initilizing the variables
        int height, radius, width, base, length, Rheight, Rbase;
        double Eside, side;
        Scanner input = new Scanner(System.in);

        // Area of Triangle
        System.out.println("Enter the height and base of the triangle( scaline, isosceles) : ");
        height = input.nextInt();
        base = input.nextInt();
        float AreaOfTriangle = (0.5f) * height * base;
        System.out.println("Area of the triangle is : " + AreaOfTriangle);

        // Area of Rectangle
        System.out.println("\nEnter the length and width of Rectangle :");
        length = input.nextInt();
        width = input.nextInt();
        int AreaOfRectangle = length * width;
        System.out.println("Area of the rectangle is : " + AreaOfRectangle);

        // Area of Square
        System.out.println("\nEnter a side of Square :");
        side = input.nextInt();
        double AreaOfSquare = Math.pow(side, 2);
        System.out.println("Area of the Square is : " + AreaOfSquare);

        // Area of circle
        System.out.println("\nEnter a radius of Circle :");
        radius = input.nextInt();
        float AreaOfCircle = (3.14f) * radius * radius;
        System.out.println("Area of the Circle is : " + AreaOfCircle);

        // Area of equilateral Triangle
        System.out.println("\nEnter the side of Equilateral Triangle :");
        Eside = input.nextInt();
        double AreaOfETriangle = (Math.sqrt(3) / 4) * Math.pow(Eside, 2);
        System.out.println("Area of the Equilateral Triangle is : " + AreaOfETriangle);

        // Area of rhombus using base and height
        System.out.println("\nEnter the base and height of Rhombus :");
        Rbase = input.nextInt();
        Rheight = input.nextInt();
        int AreaOfRhombus = Rheight * Rbase;
        System.out.println("Area of the Rhombus is : "+ AreaOfRhombus); 

    }
}
