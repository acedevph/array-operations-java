import java.util.Scanner;

// ArrayApp.java
// Driver class — creates the object and runs the menu.

public class ArrayApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayOperations arr = new ArrayOperations(scanner);

        // Input numbers first before showing the menu
        arr.inputNumbers();

        int choice;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Display All Numbers");
            System.out.println("2. Display Sum of Numbers");
            System.out.println("3. Display Even Numbers and Sum");
            System.out.println("4. Display Odd Numbers and Sum");
            System.out.println("5. Search Number");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    arr.displayNumbers();
                    break;
                case 2:
                    arr.displaySum();
                    break;
                case 3:
                    arr.displayEvenNumbers();
                    break;
                case 4:
                    arr.displayOddNumbers();
                    break;
                case 5:
                    int value = arr.getSearchValue();
                    arr.searchNumber(value);
                    break;
                case 6:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 to 6.");
                    break;
            }

        } while (choice != 6);

        scanner.close();
    }
}
