import java.util.Scanner;

class Student {
    protected String name;
    protected int rollNumber;
    protected int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Name of the Student: ");
        name = scanner.nextLine();
        System.out.print("Enter the Roll Number of the Student: ");
        rollNumber = scanner.nextInt();
        System.out.print("Enter the Marks of the Student: ");
        marks = scanner.nextInt();
        scanner.close();
    }

    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

class StudentDetails extends Student {
    public StudentDetails(String name, int rollNumber, int marks) {
        super(name, rollNumber, marks);
    }

    public void displayDetailsWithGrade() {
        // Inherit and call the base class displayDetails method
        super.displayDetails();

        // Additional functionality in the derived class
        System.out.println("Grade: " + calculateGrade());
    }

    private char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

public class Student1 {
    public static void main(String[] args) {
        StudentDetails student = new StudentDetails("", 0, 0);

        // Input student details
        student.inputDetails();

        // Display student details with grade
        student.displayDetailsWithGrade();
    }
}


	
