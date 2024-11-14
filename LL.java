import java.util.*;

public class LL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> L = new LinkedList<>();
        int x, y, z, n;
        int key;

        System.out.print("Enter No of Elements in List:");
        z = sc.nextInt();
        System.out.print("Enter the Elements:");

        for (int i = 0; i < z; i++) {
            n = sc.nextInt();
            L.add(i, n);
        }

        System.out.println("The elements in the List are: " + L);

        do {
            System.out.println("Enter Choice \n 1. Add Element at specified Index \n 2. Add Element in Beginning \n" +
                    " 3. Add Element in End \n 4. Remove Element at specified Index \n 5. Remove Element in Beginning \n" +
                    " 6. Remove Element in End \n 7. Display Element at specified Index \n 8. Display Element in Beginning \n" +
                    " 9. Display Element in End \n 10. Display Full List \n 11. EXIT \n");
            key = sc.nextInt();

            switch (key) {
                case 1:
                    System.out.print("Enter Element to add:");
                    x = sc.nextInt();
                    System.out.print("Enter Index to add at:");
                    y = sc.nextInt();
                    L.add(y, x);
                    break;
                case 2:
                    System.out.print("Enter Element to add:");
                    x = sc.nextInt();
                    L.addFirst(x);
                    break;
                case 3:
                    System.out.print("Enter Element to add:");
                    x = sc.nextInt();
                    L.addLast(x);
                    break;
                case 4:
                    System.out.print("Enter Index to delete at:");
                    x = sc.nextInt();
                    L.remove(x);
                    break;
                case 5:
                    L.removeFirst();
                    break;
                case 6:
                    L.removeLast();
                    break;
                case 7:
                    System.out.print("Enter Index to add at:");
                    x = sc.nextInt();
                    System.out.println(L.get(x));
                    break;
                case 8:
                    System.out.println(L.getFirst());
                    break;
                case 9:
                    System.out.println(L.getLast());
                    break;
                case 10:
                    System.out.println("The elements in the List are: " + L);
                    break;
                case 11:
                    break;
                default:
                    System.out.println("INPUT ERROR");
                    break;
            }
        } while (key != 11);
    }
}
