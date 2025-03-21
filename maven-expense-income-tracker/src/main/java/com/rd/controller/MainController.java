package com.rd.controller;


import com.rd.service.UserService;
import java.util.Scanner;

public class MainController {
    private final UserService userService = new UserService();
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to Expense Tracker!");
        displayMainMenu();
    }

    private void displayMainMenu() {
        while (true) {
            System.out.println("\n1. Register\n2. Login\n3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> registerUser();
                case 2 -> loginUser();
                case 3 -> { System.out.println("Goodbye!"); return; }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private void registerUser() {
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();
        userService.registerUser(username, password);
        System.out.println("User registered successfully!");
    }

    private void loginUser() {
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        if (userService.loginUser(username, password) != null) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials.");
        }
    }
}
