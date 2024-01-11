// Write a program to find the perimeter of the square, rectangle, equilateral triangle, circle, rhombus.

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        // initilizing the sides of respectives shapes by using their first letter in
        // caps
        int Sside, Rlenght, Rwidth, ETsides, Cradius, RHside;
        Scanner input = new Scanner(System.in);

        // Perimeter of the square
        System.out.print("\nEnter the side of the square : ");
        Sside = input.nextInt();
        int PerimeterOfSquare = Sside * 4;
        System.out.println("The permienter of the square is " + PerimeterOfSquare);

        // Perimeter of the rectangle
        System.out.print("\nEnter the length and width of the rectangle : ");
        Rlenght = input.nextInt();
        Rwidth = input.nextInt();
        int PerimeterOfRectangle = 2 * (Rlenght + Rwidth);
        System.out.println("The permienter of the Rectangle is " + PerimeterOfRectangle);

        // Perimeter of the circle
        System.out.print("\nEnter the radius of the circle : ");
        Cradius = input.nextInt();
        float PerimeterOfCircle = 3.14f * Cradius * 2;
        System.out.println("The permienter of the circle is " + PerimeterOfCircle);

        // Perimeter of the equilateral triangle
        System.out.print("\nEnter the side of the equilateral triangle : ");
        ETsides = input.nextInt();
        int PerimeterOfEQtriangle = 3 * ETsides;
        System.out.println("The permienter of the equilateral triangle is " + PerimeterOfEQtriangle);

        // Perimeter of the rhombus
        System.out.print("\nEnter the side of the rhombus : ");
        RHside = input.nextInt();
        int PerimeterOfRhombus = 4 * RHside;
        System.out.println("The permienter of the equilateral rhombus is " + PerimeterOfRhombus);
    }
}
