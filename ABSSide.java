import java.util.Scanner;

abstract class Shape {
    public abstract void numberOfSides();
}

class Rectangle extends Shape {
    public void numberOfSides() {
        System.out.println("Number of Sides of Rectangle = 4");
    }
}

class Triangle extends Shape {
    public void numberOfSides() {
        System.out.println("Number of Sides of Triangle = 3");
    }
}

class Hexagon extends Shape {
    public void numberOfSides() {
        System.out.println("Number of Sides of Hexagon = 6");
    }
}

public class ABSSide{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;

        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Rectangle");
            System.out.println("2. Triangle");
            System.out.println("3.  Hexagon");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    shape = new Rectangle();
                    break;
                case 2:
                    shape = new Triangle();
                    break;
                case 3:
                    shape = new Hexagon();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

            if (shape != null && choice != 4) {
                shape.numberOfSides();
            }

        } while (choice != 4);

        scanner.close();
    }
}
