import java.util.Scanner;

public class QuickSortOnIntegers {
    int numbers[];
    int length;

    public static void main(String[] args) {
        QuickSortOnIntegers obj = new QuickSortOnIntegers();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of integers:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter the integers:");

        int numbersList[] = new int[n];
        for (int i = 0; i < n; i++) {
            numbersList[i] = scanner.nextInt();
        }

        scanner.close();

        obj.sort(numbersList);

        System.out.println("Sorted integers:");
        for (int num : numbersList) {
            System.out.print(num + " ");
        }
    }

    void sort(int array[]) {
        if (array == null || array.length == 0) {
            return;
        }
        this.numbers = array;
        this.length = array.length;
        quickSort(0, length - 1);
    }

    void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = this.numbers[lowerIndex + (higherIndex - lowerIndex) / 2];
        while (i <= j) {
            while (this.numbers[i] < pivot) {
                i++;
            }
            while (this.numbers[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    void exchangeNumbers(int i, int j) {
        int temp = this.numbers[i];
        this.numbers[i] = this.numbers[j];
        this.numbers[j] = temp;
    }
}
