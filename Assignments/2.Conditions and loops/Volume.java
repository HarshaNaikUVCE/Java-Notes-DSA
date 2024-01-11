// Program to write the volume of the cone, prism, cylinder, sphere, pyramid.

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        // initilizing the dimensions of the shapes
        int Cheight, Cradius, Pheight, Plength, Pbase, CYheight, CYradius, Sradius, PYheight, PYbase, PYlength;
        Scanner input = new Scanner(System.in);

        // Volume of sphere
        System.out.println("\nEnter the radius of sphere :");
        Sradius = input.nextInt();
        double volumeOfSphere = (4 / 3) * 3.14 * Sradius;
        System.out.println("Volume of the sphere is " + volumeOfSphere);

        // Volume of cone
        System.out.println("\nEnter the radius, height of cone :");
        Cradius = input.nextInt();
        Cheight = input.nextInt();
        double volumeOfCone = (1 / 3) * 3.14 * Math.pow(Cradius, 2) * Cheight;
        System.out.println("Volume of the cone is " + volumeOfCone);

        // Volume of cylinder
        System.out.println("\nEnter the radius, height of cylinder :");
        CYradius = input.nextInt();
        CYheight = input.nextInt();
        double volumeOfCylinder = 3.14 * Math.pow(CYradius, 2) * CYheight;
        System.out.println("Volume of the cylinder is " + volumeOfCylinder);

        // Volume of prism
        System.out.println("\nEnter the lenght, height, base of the prism :");
        Pbase = input.nextInt();
        Pheight = input.nextInt();
        Plength = input.nextInt();
        double volumeOfPrism = 0.5 * Pbase * Pheight * Plength;
        System.out.println("Volume of the prism is " + volumeOfPrism);

        // Volume of pyramid
        System.out.println("\nEnter the base lenght,pyramid height, base width of the prism :");
        PYbase = input.nextInt();
        PYheight = input.nextInt();
        PYlength = input.nextInt();
        double volumeOfPyramid = (PYbase * PYheight * PYlength) / 3;
        System.out.println("Volume of the pyramid is " + volumeOfPyramid);

    }

}
