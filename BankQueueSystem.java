/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankqueuesystem;

import java.util.*;

public class BankQueueSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Customer> queue = new LinkedList<>();

        while (true) {
            System.out.print("""
                \n  Bank Queue Menu
                1. Add customer to queue
                2. Serve next customer
                3. View queue
                4. Exit
                Enter your choice here: """);

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("\nEnter customer name here: ");
                    String name = scanner.nextLine();
                    Customer newCustomer = new Customer(name);
                    queue.offer(newCustomer);
                    System.out.println("\nCustomer Added: " + newCustomer);
                    break;

                case "2":
                    if (queue.isEmpty()) {
                        System.out.println("No customers to serve.");
                    } else {
                        Customer served = queue.poll();
                        System.out.println("\nServing: " + served);
                    }
                    break;

                case "3":
                    if (queue.isEmpty()) {
                        System.out.println("\nQueue is empty.");
                    } else {
                        System.out.println("\nCurrent queue:");
                        for (Customer c : queue) {
                            System.out.println(" - " + c);
                        }
                    }
                    break;

                case "4":
                    System.out.println("\nThanks, bye.");
                    scanner.close();
                    return;

                default:
                    System.out.println("\nInvalid user input. Please enter 1-4 only.");
            }
        }
    }
}
