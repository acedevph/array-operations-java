# Object-Oriented Array Processing with Menu

A Java program that converts a procedural array program into an
Object-Oriented design with a menu-driven interface.

---

## Files

| File | Description |
|---|---|
| `ArrayOperations.java` | Class that holds the array and all operation methods |
| `ArrayApp.java` | Driver class that runs the menu |

---

## How to Run

**Step 1 — Compile both files:**
```bash
javac ArrayOperations.java ArrayApp.java
```

**Step 2 — Run the program:**
```bash
java ArrayApp
```

> Both files must be in the same folder.

---

## How It Works

1. The program asks the user to enter 5 numbers first.
2. The menu is displayed.
3. The user picks an option (1–6).
4. The chosen operation runs.
5. The menu repeats until the user selects **Exit**.

---

## Menu Options

```
MENU
1. Display All Numbers
2. Display Sum of Numbers
3. Display Even Numbers and Sum
4. Display Odd Numbers and Sum
5. Search Number
6. Exit
```

---

## Sample Output

```
Enter 5 numbers:
n[0]: 4
n[1]: 7
n[2]: 2
n[3]: 9
n[4]: 2

MENU
1. Display All Numbers
2. Display Sum of Numbers
3. Display Even Numbers and Sum
4. Display Odd Numbers and Sum
5. Search Number
6. Exit
Enter choice: 3
Even numbers: 4 2 2
Sum of even numbers: 8

Enter choice: 5
Enter number to search: 2
2 is found. Occurrences: 2

Enter choice: 6
Exiting... Goodbye!
```

---

## Class Design

### `ArrayOperations`

| Member | Type | Description |
|---|---|---|
| `numbers` | `private int[]` | Array of 5 integers |
| `SIZE` | `private static final int` | Fixed size = 5 |
| `scanner` | `private Scanner` | Shared scanner from main |
| `ArrayOperations(Scanner)` | Constructor | Initializes array and scanner |
| `inputNumbers()` | Method | Reads 5 integers from the user |
| `displayNumbers()` | Method | Prints all elements |
| `displaySum()` | Method | Prints the total sum |
| `displayEvenNumbers()` | Method | Prints even numbers and their sum |
| `displayOddNumbers()` | Method | Prints odd numbers and their sum |
| `searchNumber(int)` | Method | Searches for a value and counts occurrences |
| `getSearchValue()` | Method | Prompts user for the number to search |

### `ArrayApp`

Contains only the `main()` method. Creates an `ArrayOperations` object,
calls `inputNumbers()` once, then runs the menu loop using `do-while`
and `switch`.

---

## OOP Concepts Used

- **Encapsulation** — the array is `private` and can only be accessed through the class methods
- **Object** — `ArrayOperations arr = new ArrayOperations(scanner)` creates one object that owns all the data and behavior
- **Methods** — each operation is in its own method; no logic is written directly in `main()`
- **Constructor** — receives a shared `Scanner` so both classes read from the same input stream
- **switch statement** — handles each menu option cleanly with a `default` case for invalid input
- **do-while loop** — ensures the menu shows at least once and keeps repeating until Exit is chosen

---

## Requirements

- Java 8 or higher
- No external libraries needed
