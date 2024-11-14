import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows for the first matrix: ");
        int m1 = sc.nextInt();
        System.out.println("Enter the number of columns for the first matrix: ");
        int n1 = sc.nextInt();

        System.out.println("Enter the number of rows for the second matrix: ");
        int m2 = sc.nextInt();
        System.out.println("Enter the number of columns for the second matrix: ");
        int n2 = sc.nextInt();

        if (n1 != m2) {
            System.out.println(
                    "Matrix multiplication is not possible. The number of columns in the first matrix must equal the number of rows in the second matrix.");
            return;
        }

        int[][] a = new int[m1][n1];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print("[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }

        int[][] b = new int[m2][n2];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print("[" + i + "][" + j + "] = ");
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("First Matrix:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Second Matrix:");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] c = new int[m1][n2];

        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                c[i][j] = 0;
                for (int k = 0; k < n1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Resulting Matrix after Multiplication:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
