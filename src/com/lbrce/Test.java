package com.lbrce;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        try {
            // Correct path to the file
            File file = new File("D:\\file.txt");

            // Check if file exists
            if (!file.exists()) {
                System.out.println("Error: File not found at " + file.getAbsolutePath());
                return;
            }

            Scanner scanner = new Scanner(file);

            // Read numbers and operation from the file
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            char operation = scanner.next().charAt(0);
            scanner.close();

            // Perform operation using switch
            switch (operation) {
                case '+':
                    System.out.println("Sum is: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Difference is: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Product is: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println("Quotient is: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Supported operations are +, -, *, /.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Ensure the file path is correct.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
