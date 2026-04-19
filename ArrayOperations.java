import java.util.Scanner;

// ArrayOperations.java
// Contains the private array and all operation methods.

public class ArrayOperations {

    private int[] numbers;
    private static final int SIZE = 5;
    private Scanner scanner;

    // Constructor — receives shared Scanner from main
    public ArrayOperations(Scanner scanner) {
        this.numbers = new int[SIZE];
        this.scanner = scanner;
    }

    // Accepts 5 integers from the user
    public void inputNumbers() {
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("n[" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }
    }

    // Displays all elements in the array
    public void displayNumbers() {
        System.out.print("Numbers: ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    // Computes and displays the total sum
    public void displaySum() {
        int sum = 0;
        for (int i = 0; i < SIZE; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);
    }

    // Displays even numbers and their sum
    public void displayEvenNumbers() {
        int sumEven = 0;
        System.out.print("Even numbers: ");
        for (int i = 0; i < SIZE; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
                sumEven += numbers[i];
            }
        }
        System.out.println("\nSum of even numbers: " + sumEven);
    }

    // Displays odd numbers and their sum
    public void displayOddNumbers() {
        int sumOdd = 0;
        System.out.print("Odd numbers: ");
        for (int i = 0; i < SIZE; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
                sumOdd += numbers[i];
            }
        }
        System.out.println("\nSum of odd numbers: " + sumOdd);
    }

    // Searches for a value and shows occurrences
    public void searchNumber(int value) {
        int count = 0;
        boolean found = false;
        for (int i = 0; i < SIZE; i++) {
            if (numbers[i] == value) {
                count++;
                found = true;
            }
        }
        if (found) {
            System.out.println(value + " is found. Occurrences: " + count);
        } else {
            System.out.println(value + " is not found in the array.");
        }
    }

    // Prompts user for the number to search
    public int getSearchValue() {
        System.out.print("Enter number to search: ");
        return scanner.nextInt();
    }
}
