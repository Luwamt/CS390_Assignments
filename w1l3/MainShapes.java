package w1l2.CS390_Assignments.w1l3;

import java.util.Scanner;

public class MainShapes {
    static  Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        mainMenu(new Scanner(System.in));
        while (!scan.nextLine().equalsIgnoreCase("Exit")){
            mainMenu(new Scanner(System.in));
        }

        }
    public static void mainMenu(Scanner sc) {
        //System.out.println("Press \"ENTER\" to continue ...");
        System.out.println("Enter C for Circle \n" +
                "Enter R for Rectangle \n"+
                "Enter T for Triangle \n"+
                "Enter Exit to close the program");
        String input=  sc.nextLine();
        if(input.equalsIgnoreCase("C")) AreaCircle();
        if(input.equalsIgnoreCase("R")) areaRectangle();
        if(input.equalsIgnoreCase("T")) areaTriangle();
        if(input.equalsIgnoreCase("Exit")) exit();
        System.out.println("Press \"ENTER\" to continue ...");
    }
    public static void AreaCircle(){
        System.out.println("Please enter the radius of the circle");
        double radius = scan.nextDouble();
        scan.nextLine();
        Circle circle = new Circle(radius);
        System.out.println("The area of Circle is = "+ circle.computeArea());
    }

    public static void areaRectangle(){
        System.out.println("Please enter the width of the rectangle");
        double width = scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter the height of the rectangle ");
        double heightR = scan.nextDouble();
        scan.nextLine();
        Rectangle rectangle = new Rectangle(width, heightR);
        System.out.println("The area of rectangle is = "+ rectangle.computeArea());
    }
    public static void areaTriangle(){
        System.out.println("Please enter the height of the triangle ");
        double length = scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter the width of the triangle");
        double width = scan.nextDouble();
        scan.nextLine();
        Triangle triangle = new Triangle(width, length);
        System.out.println("The area of triangle is = "+ triangle.computeArea());
    }

    public static void exit(){
        System.out.println("Thank you for using our service");
        System.out.println("You have a good day!");
        System.exit(0);
    }
    }

