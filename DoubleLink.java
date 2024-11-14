import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class DoubleLink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> doublyLinkedList = new LinkedList<>();
        int choice;
        System.out.print("Enter the number of elements in the list: ");
        int numberOfElements = scanner.nextInt();

        System.out.print("Enter the elements: ");
        for (int i = 0; i < numberOfElements; i++) {
            int element = scanner.nextInt();
            doublyLinkedList.add(element);
        }

        System.out.println("The elements in the list are: " + doublyLinkedList);

        do {
            System.out.println("Menu:\n" +
                    "1. Add Element at specified Index\n" +
                    "2. Add Element in the Beginning\n" +
                    "3. Add Element at the End\n" +
                    "4. Remove Element at specified Index\n" +
                    "5. Remove Element in the Beginning\n" +
                    "6. Remove Element in the End\n" +
                    "7. Display Element at specified Index\n" +
                    "8. Display Element in the Beginning\n" +
                    "9. Display Element in the End\n" +
                    "10. Display Full List\n" +
                    "11. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addElementAtIndex(doublyLinkedList, scanner);
                    break;
                case 2:
                    addElementAtBeginning(doublyLinkedList, scanner);
                    break;
                case 3:
                    addElementAtEnd(doublyLinkedList, scanner);
                    break;
                case 4:
                    removeElementAtIndex(doublyLinkedList, scanner);
                    break;
                case 5:
                    removeElementAtBeginning(doublyLinkedList);
                    break;
                case 6:
                    removeElementAtEnd(doublyLinkedList);
                    break;
                case 7:
                    displayElementAtIndex(doublyLinkedList, scanner);
                    break;
                case 8:
                    displayElementInBeginning(doublyLinkedList);
                    break;
                case 9:
                    displayElementInEnd(doublyLinkedList);
                    break;
                case 10:
                    displayFullList(doublyLinkedList);
                    break;
                case 11:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 11);

        scanner.close();
    }


    private static void addElementAtIndex(LinkedList<Integer> doublyLinkedList, Scanner scanner) {
        System.out.print("Enter Element to add: ");
        int elementToAdd = scanner.nextInt();
        System.out.print("Enter Index to add at: ");
        int indexToAdd = scanner.nextInt();

        ListIterator<Integer> iterator = doublyLinkedList.listIterator();
        while (iterator.hasNext() && iterator.nextIndex() != indexToAdd) {
            iterator.next();
        }
        iterator.add(elementToAdd);
    }

    private static void addElementAtBeginning(LinkedList<Integer> doublyLinkedList, Scanner scanner) {
        System.out.print("Enter Element to add: ");
        int elementToAddBeginning = scanner.nextInt();
        doublyLinkedList.addFirst(elementToAddBeginning);
    }

    private static void addElementAtEnd(LinkedList<Integer> doublyLinkedList, Scanner scanner) {
        System.out.print("Enter Element to add: ");
        int elementToAddEnd = scanner.nextInt();
        doublyLinkedList.addLast(elementToAddEnd);
    }

    private static void removeElementAtIndex(LinkedList<Integer> doublyLinkedList, Scanner scanner) {
        System.out.print("Enter Index to delete at: ");
        int indexToRemove = scanner.nextInt();

        ListIterator<Integer> iterator = doublyLinkedList.listIterator();
        while (iterator.hasNext() && iterator.nextIndex() != indexToRemove) {
            iterator.next();
        }
        iterator.remove();
    }

    private static void removeElementAtBeginning(LinkedList<Integer> doublyLinkedList) {
        doublyLinkedList.removeFirst();
    }

    private static void removeElementAtEnd(LinkedList<Integer> doublyLinkedList) {
        doublyLinkedList.removeLast();
    }

    private static void displayElementAtIndex(LinkedList<Integer> doublyLinkedList, Scanner scanner) {
        System.out.print("Enter Index to display: ");
        int indexToDisplay = scanner.nextInt();

        ListIterator<Integer> iterator = doublyLinkedList.listIterator();
        while (iterator.hasNext() && iterator.nextIndex() != indexToDisplay) {
            iterator.next();
        }
        System.out.println(iterator.next());
    }

    private static void displayElementInBeginning(LinkedList<Integer> doublyLinkedList) {
        System.out.println(doublyLinkedList.getFirst());
    }

    private static void displayElementInEnd(LinkedList<Integer> doublyLinkedList) {
        System.out.println(doublyLinkedList.getLast());
    }

    private static void displayFullList(LinkedList<Integer> doublyLinkedList) {
        System.out.println("The elements in the list are: " + doublyLinkedList);
    }
}
